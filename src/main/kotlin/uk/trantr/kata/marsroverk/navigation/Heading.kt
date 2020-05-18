package uk.trantr.kata.marsroverk.navigation

enum class Heading {
    N {
        override fun anticlockwise() = W
        override fun clockwise() = E
    },
    E {
        override fun anticlockwise() = N
        override fun clockwise() = S
    },
    S {
        override fun anticlockwise() = E
        override fun clockwise() = W
    },
    W {
        override fun anticlockwise() = S
        override fun clockwise() = N
    };

    abstract fun anticlockwise(): Heading

    abstract fun clockwise(): Heading
}