package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Heading.N
import uk.trantr.kata.marsroverk.navigation.Heading.S
import uk.trantr.kata.marsroverk.navigation.Position

class Rover(val position: Position) {
    fun receive(command: Char): Rover {
        return if (command == 'r') {
            Rover(Position(position.x, position.y, S))
        }
        else {
            Rover(Position(position.x, position.y, N))
        }
    }

    override fun toString(): String {
        return "Rover(position=$position)"
    }
}