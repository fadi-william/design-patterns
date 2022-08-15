---
name: 3. Interpreter
route: /behavioral/interpreter
menu: Behavioral
---

# Interpreter

The interpreter pattern is used to translate from one language to another. It works great with rather simple grammar.

## Sample Code

```kotlin
interface Expression {
    fun interpret(context: String): String
}
```

```kotlin
class NameNotPrimitiveType : Expression {
    override fun interpret(context: String): String {
        var myContext = context
        if (myContext == "int" || myContext == "boolean" || myContext == "double") {
            myContext += "1"
        }
        return myContext
    }
}
```

```kotlin
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
```

```kotlin
class FirstLetterIsLowerCase : Expression {
    private val nameNotPrimitiveType: NameNotPrimitiveType = NameNotPrimitiveType()

    override fun interpret(context: String): String {
        val myContext = context.substring(0, 1).lowercase(Locale.getDefault()) + context.substring(1);
        return nameNotPrimitiveType.interpret(myContext)
    }
}
```

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var context = "_Int"

        val firstLetterNotUnderscore = FirstLetterNotUnderscore()
        context = firstLetterNotUnderscore.interpret(context)
        println(context)
    }
}
```
