package behavioral.interpreter.pattern

import java.util.*

class FirstLetterIsLowerCase : Expression {
    private val nameNotPrimitiveType: NameNotPrimitiveType = NameNotPrimitiveType()

    override fun interpret(context: String): String {
        val myContext = context.substring(0, 1).lowercase(Locale.getDefault()) + context.substring(1);
        return nameNotPrimitiveType.interpret(myContext)
    }
}
