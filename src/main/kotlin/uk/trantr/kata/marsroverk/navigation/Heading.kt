package uk.trantr.kata.marsroverk.navigation

enum class Heading {
    N {
        override fun anticlockwise() = W
        override fun clockwise() = E
        override fun transform(adjustFactor: Int): (Coordinate) -> Coordinate = { p -> p.copy(y = p.y + (1 * adjustFactor)) }
    },
    E {
        override fun anticlockwise() = N
        override fun clockwise() = S
        override fun transform(adjustFactor: Int): (Coordinate) -> Coordinate = { p -> p.copy(x = p.x + (1 * adjustFactor)) }
    },
    S {
        override fun anticlockwise() = E
        override fun clockwise() = W
        override fun transform(adjustFactor: Int): (Coordinate) -> Coordinate = { p -> p.copy(y = p.y - (1 * adjustFactor)) }
    },
    W {
        override fun anticlockwise() = S
        override fun clockwise() = N
        override fun transform(adjustFactor: Int): (Coordinate) -> Coordinate = { p -> p.copy(x = p.x - (1 * adjustFactor)) }
    };

    abstract fun anticlockwise(): Heading

    abstract fun clockwise(): Heading

    abstract fun transform(adjustFactor: Int = 1): (Coordinate) -> Coordinate
}