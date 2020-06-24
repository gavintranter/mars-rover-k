package uk.trantr.kata.marsroverk.navigation

data class Coordinate(val x: Int, val y: Int) {
    companion object {
        val ZERO_ZERO = Coordinate(0, 0)
        val ONE_ONE = Coordinate(1, 1)
    }

    fun adjust(xAdjustment: (Int) -> Int, yAdjustment: (Int) -> Int): Coordinate {
        return Coordinate(xAdjustment.invoke(x), yAdjustment.invoke(y))
    }
}