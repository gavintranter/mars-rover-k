package uk.trantr.kata.marsroverk.navigation

data class Position(val x: Int, val y: Int, val heading: Heading) {
    fun rotateClockWise(): Position {
        return this.copy(heading = heading.clockwise())
    }

    fun rotateAntiClockWise(): Position {
        return this.copy(heading = heading.anticlockwise())
    }
}