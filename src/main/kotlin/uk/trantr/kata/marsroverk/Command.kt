package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Position

enum class Command {
    r {
        override fun execute(position: Position) = position.rotateClockWise()
    },
    l {
        override fun execute(position: Position) = position.rotateAntiClockWise()
    },
    f {
        override fun execute(position: Position) = position.forward()
    },
    b {
        override fun execute(position: Position) = position.backward()
    };

    companion object Factory {
        fun from(value: Char) = when (value) {
            'r' -> r
            'l' -> l
            'f' -> f
            'b' -> b
            else -> throw IllegalArgumentException("Unknown command")
        }
    }

    abstract fun execute(position: Position): Position
}