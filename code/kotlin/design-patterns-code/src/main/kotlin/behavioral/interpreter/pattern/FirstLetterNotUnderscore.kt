package behavioral.interpreter.pattern

class FirstLetterNotUnderscore : Expression {

    private val firstLetterIsLowerCase: FirstLetterIsLowerCase = FirstLetterIsLowerCase()

    override fun interpret(context: String): String {
        var myContext = context
        if (myContext.startsWith("_")) {
            myContext = context.substring(1)
        }
        return firstLetterIsLowerCase.interpret(myContext)
    }
}
