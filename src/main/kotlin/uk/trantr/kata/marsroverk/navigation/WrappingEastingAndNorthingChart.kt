package uk.trantr.kata.marsroverk.navigation

class WrappingEastingAndNorthingChart(private val eastingExtant: Int, private val northingExtent: Int): Chart {
    override fun isSafeLocation(coordinate: Coordinate): Coordinate? {
        return coordinate.adjust(adjustment(eastingExtant), adjustment(northingExtent))
    }

    private fun adjustment(extent: Int): (Int) -> Int = {
        when {
            (it < 0) -> extent - 1
            (it >= extent) -> 0
            else -> it
        }
    }
}