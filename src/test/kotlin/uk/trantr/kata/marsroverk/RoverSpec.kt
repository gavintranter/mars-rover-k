package uk.trantr.kata.marsroverk

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import uk.trantr.kata.marsroverk.navigation.Heading.E
import uk.trantr.kata.marsroverk.navigation.Position

object RoverSpec: Spek({
    describe("A Rover") {
        describe("being initialised") {
            val rover = Rover.initialise(1, 1, E)

            it("will be at the initial position") {
                Assertions.assertEquals(rover.position, Position(1, 1, E))
            }
        }
    }
})