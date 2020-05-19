package uk.trantr.kata.marsroverk

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import uk.trantr.kata.marsroverk.navigation.Heading.*
import uk.trantr.kata.marsroverk.navigation.Position

object RoverSpec: Spek({
    describe("A Rover") {
        val rover by memoized { Rover(Position(1, 1, E)) }

        describe("being initialised") {
            it("will be at the initial position") {
                assertEquals(Position(1, 1, E), rover.position)
            }
        }

        describe("receives command") {
            describe("which is invalid") {
                it("will thrown an IllegalArgumentException") {
                    assertThrows<IllegalArgumentException> { rover.receive(arrayOf('L')) }
                }
            }

            describe("to move forward") {
                val dRover = rover.receive(arrayOf('f'))

                it("will move eastward along x axis") {
                    assertEquals(Position(2, 1, E), dRover.position)
                }
            }
        }

        describe("receives multiple commands") {
            describe("to move clockwise to each cardinal point in turn") {
                val dRover = rover.receive(arrayOf('r', 'r', 'r', 'r'))

                it("will be heading E(ast)") {
                    assertEquals(Position(1, 1, E), dRover.position)
                }
            }

            describe("to move anticlockwise to each cardinal point in turn") {
                val dRover = rover.receive(arrayOf('l', 'l', 'l', 'l'))

                it("will be heading E(ast)") {
                    assertEquals(Position(1, 1, E), dRover.position)
                }
            }

            describe("to move through a sequence of rotations") {
                val dRover = rover.receive(arrayOf('l', 'l', 'r', 'l', 'r'))

                it("will be heading N(orth))") {
                    assertEquals(Position(1, 1, N), dRover.position)
                }
            }

            describe("to sequence of rotations and movements") {
                val dRover = rover.receive(arrayOf('l', 'f', 'l', 'f', 'l', 'f'))

                it("will move northwards along the y axis") {
                    assertEquals(Position(0, 1, S), dRover.position)
                }
            }
        }
    }
})