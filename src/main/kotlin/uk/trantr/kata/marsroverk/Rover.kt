package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Chart
import uk.trantr.kata.marsroverk.navigation.Position

class Rover(private val chart: Chart, val position: Position) {
    fun receive(commands: Array<Char>): Rover {
        val p = commands.map { Command.from(it) }
            .fold(this.position) { deltaP, next -> translateAgainstChart(deltaP, next) }

        return Rover(chart, p)
    }

    private fun translateAgainstChart(position: Position, command: Command): Position {
        val p = command.execute(position)
        val l = chart.isSafeLocation(p.coordinate)

        return Position(l!!, p.heading)
    }

    override fun toString(): String {
        return "Rover(position=$position)"
    }
}