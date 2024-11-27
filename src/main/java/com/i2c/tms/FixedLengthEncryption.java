package com.i2c.tms;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class FixedLengthEncryption {

    private static final String AES = "AES";
    private static final String NUMERIC = "0123456789";

    public static String encrypt(long plaintext, String secretKey) throws Exception {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, AES);

        // Encrypt using AES
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        byte[] encryptedBytes = cipher.doFinal(buffer.putLong(plaintext).array());

        // Encode to Base64
        return Base64.getUrlEncoder().withoutPadding().encodeToString(encryptedBytes);
    }

    // Decrypt ciphertext back to 19-digit plaintext
    public static long decrypt(String ciphertext, String secretKey) throws Exception {
        // Generate AES key from secret key
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, AES);

        // Decode from Base64
        byte[] encryptedBytes = Base64.getUrlDecoder().decode(ciphertext);

        // Decrypt using AES
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        // Convert bytes back to long
        ByteBuffer buffer = ByteBuffer.wrap(decryptedBytes);
        return buffer.getLong();
    }

    public static void main(String[] args) throws Exception {
        AsyncPrintAllValues();
    }

    public static void AsyncPrintAllValues() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    for (long i = 9223372036854775807L; i > 1; i--) {
                        for (int j = 1; j <= 10; j++) {
                            String secretKey = "1234567890123456123456789012345612345678901234561234567890123456123456789012345612345678901234561234567890123456123456789012345612345678901234561234567890123456123456789012345612345678901234561234567890123456123456789012345612345678901234561234567890123456";
                            long randomValue = randomLongValueOGivenDigitsLength(String.valueOf(i).length());
                            String cipherText = encrypt(randomValue, secretKey);
                            long decryptedText = decrypt(cipherText, secretKey);
                            System.out.println("Plaintext: " + randomValue + ", Secret Key: " + secretKey + ", Cipher Text: " + cipherText + ", Decrypted Text: " + decryptedText);
                        }
                        i = i / 10;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    private static long randomLongValueOGivenDigitsLength(int digits){
        while (true){
            try {

                StringBuilder sb = new StringBuilder(digits);
                for(int i = 0; i < digits; i++){
                    int index = (int)(NUMERIC.length() * Math.random());
                    sb.append(NUMERIC.charAt(index));
                }
                return Long.parseLong(sb.toString());
            }
            catch (Exception e){

            }
        }
    }
}