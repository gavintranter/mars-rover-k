package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Position

enum class Command {
    r {
        override fun execute(position: Position) = position.copy(heading = position.heading.clockwise())
    },
    l {
        override fun execute(position: Position) = position.copy(heading = position.heading.anticlockwise())
    };

    companion object Factory {
        fun from(value: Char) = when (value) {
            'r' -> r
            'l' -> l
            else -> throw IllegalArgumentException("Unknown command")
        }
    }

    abstract fun execute(position: Position): Position
}