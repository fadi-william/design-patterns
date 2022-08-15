package behavioral.strategy.pattern

class File(private val fileName: String) {
    fun encrypt(encryptor: Encryptor) {
        println(encryptor.encryptFile() + " to " + fileName)
    }
}