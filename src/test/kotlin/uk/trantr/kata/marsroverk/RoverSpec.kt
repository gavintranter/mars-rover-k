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
            describe("r") {
                val dRover: Rover = rover.receive('r')
                it("will change heading to S(outh)") {
                    assertEquals(Position(1, 1, S), dRover.position)
                }
            }

            describe("l") {
                val dRover: Rover = rover.receive('l')
                it("will change heading to N(orth)") {
                    assertEquals(Position(1, 1, N), dRover.position)
                }
            }

            describe("which is invalid") {
                it("will thrown an IllegalArgumentException") {
                    assertThrows<IllegalArgumentException> { rover.receive('L') }
                }
            }
        }
    }
})