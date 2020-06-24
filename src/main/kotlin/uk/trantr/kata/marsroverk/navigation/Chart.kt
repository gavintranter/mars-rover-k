package uk.trantr.kata.marsroverk.navigation

interface Chart {
    fun isSafeLocation(coordinate: Coordinate): Coordinate?
}