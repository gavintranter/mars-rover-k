package uk.trantr.kata.marsroverk

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CommandSpec: Spek({
    describe("Interpret commands") {
        describe("parsing 'r'") {
            it("will give RIGHT") {
                assertEquals(Command.RIGHT, Command.from('r'))
            }
        }
        describe("parsing 'l'") {
            it("will give LEFT") {
                assertEquals(Command.LEFT, Command.from('l'))
            }
        }
        describe("parsing 'f'") {
            it("will give FORWARD") {
                assertEquals(Command.FORWARD, Command.from('f'))
            }
        }
        describe("parsing 'b'") {
            it("will give BACKWARD") {
                assertEquals(Command.BACKWARD, Command.from('b'))
            }
        }

        describe("parsing an illegal command") {
            it("will throw an IllegalArgumentException") {
                assertThrows<IllegalArgumentException> { Command.from('L') }
            }
        }
    }
})