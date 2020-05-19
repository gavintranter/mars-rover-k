package uk.trantr.kata.marsroverk.navigation

data class Position(val coordinate: Coordinate, val heading: Heading) {
    fun rotateClockWise(): Position {
        return this.copy(heading = heading.clockwise())
    }

    fun rotateAntiClockWise(): Position {
        return this.copy(heading = heading.anticlockwise())
    }

    fun forward(): Position {
        return this.copy(coordinate = heading.transform().invoke(this.coordinate))
    }

    fun backward(): Position {
        return this.copy(coordinate = heading.transform(-1).invoke(this.coordinate))
    }
}