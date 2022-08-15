package behavioral.interpreter.pattern

interface Expression {
    fun interpret(context: String): String
}
