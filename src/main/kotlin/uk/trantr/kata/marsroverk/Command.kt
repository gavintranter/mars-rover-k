package uk.trantr.kata.marsroverk

enum class Command {
    r,
    l;

    companion object Factory {
        fun from(value: Char) = when (value) {
            'r' -> r
            'l' -> l
            else -> throw IllegalArgumentException("Unknown command")
        }
    }
}