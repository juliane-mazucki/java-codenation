package br.codenation.cursojava.aula8.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * https://codare.aurelio.net/2007/02/02/java-gerando-codigos-hash-md5-sha/
 */
public class Hash {

    public static void main(String[] args) {
        String phrase = "Quero gerar códigos hash desta mensagem.";
        System.out.println(stringHexa(generateHash(phrase, "MD5")));
        System.out.println(stringHexa(generateHash(phrase, "SHA-1")));
        System.out.println(stringHexa(generateHash(phrase, "SHA-256")));
    }

    public static byte[] generateHash(String phrase, String algorithm) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(phrase.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String stringHexa(byte[] bytes) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
            int parteBaixa = bytes[i] & 0xf;
            if (parteAlta == 0) s.append('0');
            s.append(Integer.toHexString(parteAlta | parteBaixa));
        }
        return s.toString();
    }
}
