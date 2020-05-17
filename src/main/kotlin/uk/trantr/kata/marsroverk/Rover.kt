package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Heading
import uk.trantr.kata.marsroverk.navigation.Position

class Rover {
    lateinit var position: Position private set

    companion object Factory {
        val rover = Rover()

        fun initialise(x: Int, y: Int, heading: Heading): Rover {
            rover.position = Position(x, y, heading)
            return rover
        }
    }
}