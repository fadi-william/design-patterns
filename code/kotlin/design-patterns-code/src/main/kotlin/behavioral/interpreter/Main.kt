package behavioral.interpreter

import behavioral.interpreter.pattern.FirstLetterNotUnderscore

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var context = "_Int"

        val firstLetterNotUnderscore = FirstLetterNotUnderscore()
        context = firstLetterNotUnderscore.interpret(context)
        println(context)
    }
}
