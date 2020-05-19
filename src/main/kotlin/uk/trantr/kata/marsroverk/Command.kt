package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Position

enum class Command {
    RIGHT {
        override fun execute(position: Position) = position.rotateClockWise()
    },
    LEFT {
        override fun execute(position: Position) = position.rotateAntiClockWise()
    },
    FORWARD {
        override fun execute(position: Position) = position.forward()
    },
    BACKWARD {
        override fun execute(position: Position) = position.backward()
    };

    companion object Factory {
        fun from(value: Char) = when (value) {
            'r' -> RIGHT
            'l' -> LEFT
            'f' -> FORWARD
            'b' -> BACKWARD
            else -> throw IllegalArgumentException("Unknown command")
        }
    }

    abstract fun execute(position: Position): Position
}