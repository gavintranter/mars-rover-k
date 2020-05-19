package uk.trantr.kata.marsroverk.navigation

enum class Heading {
    N {
        override fun anticlockwise() = W
        override fun clockwise() = E
        override fun transform(): (Position) -> Position = { p -> p.copy(y = p.y + 1) }
    },
    E {
        override fun anticlockwise() = N
        override fun clockwise() = S
        override fun transform(): (Position) -> Position = { p -> p.copy(x = p.x + 1) }
    },
    S {
        override fun anticlockwise() = E
        override fun clockwise() = W
        override fun transform(): (Position) -> Position = { p -> p.copy(y = p.y - 1) }
    },
    W {
        override fun anticlockwise() = S
        override fun clockwise() = N
        override fun transform(): (Position) -> Position = { p -> p.copy(x = p.x - 1) }
    };

    abstract fun anticlockwise(): Heading

    abstract fun clockwise(): Heading

    abstract fun transform(): (Position) -> Position
}