package uk.trantr.kata.marsroverk

import uk.trantr.kata.marsroverk.navigation.Heading
import kotlin.properties.Delegates

object Rover {
    var x by Delegates.notNull<Int>()
    var y by Delegates.notNull<Int>()
    lateinit var heading: Heading
}