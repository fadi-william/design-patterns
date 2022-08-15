package behavioral.strategy.pattern

class RSAEncryptor : Encryptor {
    override fun encryptFile(): String {
        return "Applying RSA encryption"
    }
}