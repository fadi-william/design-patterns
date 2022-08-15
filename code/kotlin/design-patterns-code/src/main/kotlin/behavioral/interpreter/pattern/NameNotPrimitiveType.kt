package behavioral.interpreter.pattern

class NameNotPrimitiveType : Expression {
    override fun interpret(context: String): String {
        var myContext = context
        if (myContext == "int" || myContext == "boolean" || myContext == "double") {
            myContext += "1"
        }
        return myContext
    }
}