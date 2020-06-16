package br.codenation.cursojava.aula8.cryptography;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SymmetricCryptography {

    public static void main(String[] args) throws Exception {
        // DES
        String encrypted = encrypt("primeira", "DES", "DES/ECB/NoPadding", "8Eight8!");
        System.out.println(encrypted);
        String decoded = decrypt(encrypted, "DES", "DES/ECB/NoPadding", "8Eight8!");
        System.out.println(decoded);

        // AES
        encrypted = encrypt("segunda", "AES", "AES/ECB/PKCS5Padding", "sixteenCharacter");
        System.out.println(encrypted);
        decoded = decrypt(encrypted, "AES", "AES/ECB/PKCS5Padding", "sixteenCharacter");
        System.out.println(decoded);

        // Triple DES
        encrypted = encrypt("terceira", "DESede", "DESede/ECB/PKCS5Padding", "twenty_four_Characters24");
        System.out.println(encrypted);
        decoded = decrypt(encrypted, "DESede", "DESede/ECB/PKCS5Padding", "twenty_four_Characters24");
        System.out.println(decoded);
    }

    public static String encrypt(String input, String algorithm, String code, String secret)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), algorithm);
        Cipher cipher = Cipher.getInstance(code);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        final byte[] encrypted = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String input, String algorithm, String code, String secret)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), algorithm);
        Cipher cipher = Cipher.getInstance(code);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        final byte[] decoded = Base64.getDecoder().decode(input);
        return new String(cipher.doFinal(decoded));
    }

}
