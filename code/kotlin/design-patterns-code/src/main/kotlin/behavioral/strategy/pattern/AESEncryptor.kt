package behavioral.strategy.pattern

class AESEncryptor : Encryptor {
    override fun encryptFile(): String {
        return "Applying AES encryption"
    }
}