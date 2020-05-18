package uk.trantr.kata.marsroverk

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import uk.trantr.kata.marsroverk.navigation.Heading.E
import uk.trantr.kata.marsroverk.navigation.Heading.S
import uk.trantr.kata.marsroverk.navigation.Position

object RoverSpec: Spek({
    describe("A Rover") {
        val rover by memoized { Rover(Position(1, 1, E)) }

        describe("being initialised") {
            it("will be at the initial position") {
                assertEquals(Position(1, 1, E), rover.position)
            }
        }

        describe("receives commands") {
            describe("receives command r") {
                val dRover: Rover = rover.receive('r')
                it("will change heading to S(outh)") {
                    assertEquals(Position(1, 1, S), dRover.position)
                }
            }
        }
    }
})