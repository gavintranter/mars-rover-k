package uk.trantr.kata.marsroverk.navigation

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import uk.trantr.kata.marsroverk.navigation.Heading.*

object HeadingSpec: Spek({
    describe("Heading") {
        val coordinate by memoized { Coordinate.ZERO_ZERO }

        describe("from N(orth)") {
            val heading by memoized { N }

            describe("rotating clockwise") {
                it("will give E(ast)") {
                    assertEquals(E, heading.clockwise())
                }
            }
            describe("rotating anticlockwise") {
                it("will give W(est)") {
                    assertEquals(W, heading.anticlockwise())
                }
            }

            describe("an unadjusted transform") {
                it("will give coordinate 0, 1") {
                    assertEquals(Coordinate(0, 1), heading.transform().invoke(coordinate))
                }
            }
            describe("a transform adjusted by -1") {
                it("will give coordinate 0, -1") {
                    assertEquals(Coordinate(0, -1), heading.transform(-1).invoke(coordinate))
                }
            }
        }

        describe("from E(ast)") {
            val heading by memoized { E }

            describe("rotating clockwise") {
                it("will give S(outh)") {
                    assertEquals(S, heading.clockwise())
                }
            }
            describe("rotating anticlockwise") {
                it("will give N(orth)") {
                    assertEquals(N, heading.anticlockwise())
                }
            }

            describe("an unadjusted transform") {
                it("will give coordinate 1, 0") {
                    assertEquals(Coordinate(1, 0), heading.transform().invoke(coordinate))
                }
            }
            describe("a transform adjusted by -1") {
                it("will give coordinate -1, 0") {
                    assertEquals(Coordinate(-1, 0), heading.transform(-1).invoke(coordinate))
                }
            }
        }

        describe("from S(outh)") {
            val heading by memoized { S }

            describe("rotating clockwise") {
                it("will give W(est)") {
                    assertEquals(W, heading.clockwise())
                }
            }
            describe("rotating anticlockwise") {
                it("will give E(ast)") {
                    assertEquals(E, heading.anticlockwise())
                }
            }

            describe("an unadjusted transform") {
                it("will give coordinate 0, -1") {
                    assertEquals(Coordinate(0, -1), heading.transform().invoke(coordinate))
                }
            }
            describe("a transform adjusted by -1") {
                it("will give coordinate 0, 1") {
                    assertEquals(Coordinate(0, 1), heading.transform(-1).invoke(coordinate))
                }
            }
        }

        describe("from W(est)") {
            val heading by memoized { W }

            describe("rotating clockwise") {
                it("will give N(orth)") {
                    assertEquals(N, heading.clockwise())
                }
            }
            describe("rotating anticlockwise") {
                it("will give S(outh)") {
                    assertEquals(S, heading.anticlockwise())
                }
            }

            describe("an unadjusted transform") {
                it("will give coordinate -1, 0") {
                    assertEquals(Coordinate(-1, 0), heading.transform().invoke(coordinate))
                }
            }
            describe("a transform adjusted by -1") {
                it("will give coordinate 1, 0") {
                    assertEquals(Coordinate(1, 0), heading.transform(-1).invoke(coordinate))
                }
            }
        }
    }
})