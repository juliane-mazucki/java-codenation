package br.codenation.cursojava.aula8.cryptography;

import javax.crypto.Cipher;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * https://www.devmedia.com.br/criptografia-assimetrica-criptografando-e-descriptografando-dados-em-java/31213
 */
public class AsymmetricCryptography {
    public static final String ALGORITHM = "RSA";

    /**
     * Local da chave privada no sistema de arquivos.
     */
    public static final String PATH_PRIVATE_KEY = "keys/private.key";

    /**
     * Local da chave pública no sistema de arquivos.
     */
    public static final String PATH_PUBLIC_KEY = "keys/public.key";

    /**
     * Gera a chave que contém um par de chave Privada e Pública usando 1025 bytes.
     * Armazena o conjunto de chaves nos arquivos private.key e public.key
     */
    public static void generateKeys() {
        try {
            final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
            keyGen.initialize(2048);
            final KeyPair key = keyGen.generateKeyPair();

            File privateFile = new File(PATH_PRIVATE_KEY);
            File publicFile = new File(PATH_PUBLIC_KEY);

            // Cria os arquivos para armazenar a chave Privada e a chave Publica
            if (privateFile.getParentFile() != null) {
                privateFile.getParentFile().mkdirs();
            }

            privateFile.createNewFile();

            if (publicFile.getParentFile() != null) {
                publicFile.getParentFile().mkdirs();
            }

            publicFile.createNewFile();

            // Salva a Chave Pública no arquivo
            ObjectOutputStream publicKeyOS = new ObjectOutputStream(
                    new FileOutputStream(publicFile));
            publicKeyOS.writeObject(key.getPublic());
            publicKeyOS.close();

            // Salva a Chave Privada no arquivo
            ObjectOutputStream privateKeyOS = new ObjectOutputStream(
                    new FileOutputStream(privateFile));
            privateKeyOS.writeObject(key.getPrivate());
            privateKeyOS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Verifica se o par de chaves Pública e Privada já foram geradas.
     */
    public static boolean checkKeysExists() {

        File privateKey = new File(PATH_PRIVATE_KEY);
        File publicKey = new File(PATH_PUBLIC_KEY);

        if (privateKey.exists() && publicKey.exists()) {
            return true;
        }

        return false;
    }

    /**
     * Criptografa o texto puro usando chave pública.
     */
    public static byte[] encrypt(String texto, PublicKey chave) {
        byte[] cipherText = null;

        try {
            final Cipher cipher = Cipher.getInstance(ALGORITHM);
            // Criptografa o texto puro usando a chave Púlica
            cipher.init(Cipher.ENCRYPT_MODE, chave);
            cipherText = cipher.doFinal(texto.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cipherText;
    }

    /**
     * Decriptografa o texto puro usando chave privada.
     */
    public static String decrypt(byte[] texto, PrivateKey chave) {
        byte[] dectyptedText = null;

        try {
            final Cipher cipher = Cipher.getInstance(ALGORITHM);
            // Decriptografa o texto puro usando a chave Privada
            cipher.init(Cipher.DECRYPT_MODE, chave);
            dectyptedText = cipher.doFinal(texto);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new String(dectyptedText);
    }

    /**
     * Testa o Algoritmo
     */
    public static void main(String[] args) {

        try {

            // Verifica se já existe um par de chaves, caso contrário gera-se as chaves..
            if (!checkKeysExists()) {
                // Método responsável por gerar um par de chaves usando o algoritmo RSA e
                // armazena as chaves nos seus respectivos arquivos.
                generateKeys();
            }

            final String originalMessage = "Exemplo de mensagem";
            ObjectInputStream inputStream = null;

            // Criptografa a Mensagem usando a Chave Pública
            inputStream = new ObjectInputStream(new FileInputStream(PATH_PUBLIC_KEY));
            final PublicKey publicKey = (PublicKey) inputStream.readObject();
            final byte[] decodedText = encrypt(originalMessage, publicKey);

            // Decriptografa a Mensagem usando a Chave Pirvada
            inputStream = new ObjectInputStream(new FileInputStream(PATH_PRIVATE_KEY));
            final PrivateKey privateKey = (PrivateKey) inputStream.readObject();
            final String plainText = decrypt(decodedText, privateKey);

            // Imprime o texto original, o texto criptografado e
            // o texto descriptografado.
            System.out.println("Mensagem Original: " + originalMessage);
            System.out.println("Mensagem Criptografada: " + decodedText.toString());
            System.out.println("Mensagem Decriptografada: " + plainText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
