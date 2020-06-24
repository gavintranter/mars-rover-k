package uk.trantr.kata.marsroverk.navigation

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ChartSpec: Spek({

    describe("Map the rovers position on a chart") {
        describe("A Easting and Northing Chart that wraps at edges") {
            val chart by memoized { WrappingEastingAndNorthingChart(4, 4) }

            it("coordinate 3,3 is valid and will return 3,3") {
                assertEquals(Coordinate(3,3), chart.isSafeLocation(Coordinate(3,3)))
            }

            it("coordinate 4,3 will wrap around to 0,3") {
                assertEquals(Coordinate(0,3), chart.isSafeLocation(Coordinate(4,3)))
            }

            it("coordinate -1,3 will wrap around to 3,3") {
                assertEquals(Coordinate(3,3), chart.isSafeLocation(Coordinate(-1,3)))
            }

            it("coordinate 3,4 will wrap around to 3,0") {
                assertEquals(Coordinate(3,0), chart.isSafeLocation(Coordinate(3,4)))
            }

            it("coordinate 3,-1 will wrap around to 3,3") {
                assertEquals(Coordinate(3,3), chart.isSafeLocation(Coordinate(3,-1)))
            }
        }
    }
})