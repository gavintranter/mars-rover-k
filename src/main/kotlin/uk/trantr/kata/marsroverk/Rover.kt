package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Position

class Rover(val position: Position) {
    fun receive(commands: Array<Char>): Rover {
        val p = commands.map { Command.from(it) }
            .fold(this.position) { deltaP, next ->
                when (next) {
                    Command.r -> next.execute(deltaP)
                    Command.l -> next.execute(deltaP)
                }
            }

        return Rover(p)
    }

    override fun toString(): String {
        return "Rover(position=$position)"
    }
}