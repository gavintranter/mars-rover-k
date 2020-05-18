package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Heading.N
import uk.trantr.kata.marsroverk.navigation.Heading.S
import uk.trantr.kata.marsroverk.navigation.Position

class Rover(val position: Position) {
    fun receive(command: Char): Rover {
        return when (command) {
            'r' -> Rover(Position(position.x, position.y, S))
            'l' -> Rover(Position(position.x, position.y, N))
            else -> {
                throw IllegalArgumentException("Unknown Command")
            }
        }
    }

    override fun toString(): String {
        return "Rover(position=$position)"
    }
}