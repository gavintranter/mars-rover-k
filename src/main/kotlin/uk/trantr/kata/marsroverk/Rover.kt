package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.Command.*
import uk.trantr.kata.marsroverk.navigation.Position

class Rover(val position: Position) {
    fun receive(commands: Array<Char>): Rover {
        val p = commands.map { Command.from(it) }
            .fold(this.position) { deltaP, next ->
                when (next) {
                    RIGHT -> next.execute(deltaP)
                    LEFT -> next.execute(deltaP)
                    FORWARD -> next.execute(deltaP)
                    BACKWARD -> next.execute(deltaP)
                }
            }

        return Rover(p)
    }

    override fun toString(): String {
        return "Rover(position=$position)"
    }
}