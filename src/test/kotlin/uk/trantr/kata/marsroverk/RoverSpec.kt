package uk.trantr.kata.marsroverk

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import uk.trantr.kata.marsroverk.navigation.Heading.E

object RoverSpec: Spek({
    describe("A Rover") {
        val rover by memoized { Rover }

        describe("at initial location") {
            beforeEachTest {
                rover.x = 1
                rover.y = 1
                rover.heading = E
            }

            it("will be at the initial x") {
                Assertions.assertEquals(rover.x, 1)
            }

            it("will be at the initial y") {
                Assertions.assertEquals(rover.x, 1)
            }

            it("will the initial heading") {
                Assertions.assertEquals(rover.heading, E)
            }
        }

    }
})