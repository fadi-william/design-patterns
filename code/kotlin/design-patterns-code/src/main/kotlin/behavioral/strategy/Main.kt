package behavioral.strategy

import behavioral.strategy.pattern.AESEncryptor
import behavioral.strategy.pattern.File

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val file = File("test.pdf")
        val aesEncryptor = AESEncryptor()
        file.encrypt(aesEncryptor)
    }
}
