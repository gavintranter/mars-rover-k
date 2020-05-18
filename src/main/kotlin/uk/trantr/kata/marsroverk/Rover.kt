package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Heading.S
import uk.trantr.kata.marsroverk.navigation.Position

class Rover(val position: Position) {
    fun receive(command: Char): Rover {
        println()
        return Rover(Position(position.x, position.y, S))
    }

    override fun toString(): String {
        return "Rover(position=$position)"
    }
}