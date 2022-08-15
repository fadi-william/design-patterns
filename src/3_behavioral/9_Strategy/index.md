---
name: 9. Strategy
route: /behavioral/strategy
menu: Behavioral
---

# Strategy

The strategy pattern enables selecting an algorithm at runtime based on the defined strategies.

## Code Sample

```kotlin
interface Encryptor {
    fun encryptFile(): String?
}
```

```kotlin
class AESEncryptor : Encryptor {
    override fun encryptFile(): String {
        return "Applying AES encryption"
    }
}
```

```kotlin
class RSAEncryptor : Encryptor {
    override fun encryptFile(): String {
        return "Applying RSA encryption"
    }
}
```

```kotlin
class File(private val fileName: String) {
    fun encrypt(encryptor: Encryptor) {
        println(encryptor.encryptFile() + " to " + fileName)
    }
}
```

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val file = File("test.pdf")
        val aesEncryptor = AESEncryptor()
        file.encrypt(aesEncryptor)
    }
}
```
