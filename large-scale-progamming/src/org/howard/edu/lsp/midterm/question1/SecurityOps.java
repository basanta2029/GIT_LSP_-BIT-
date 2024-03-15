package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        // Remove whitespace and punctuation from the input text
        text = text.replaceAll("[\\s\\p{Punct}]", "");

        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Iterate over the characters in the text
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                // Append characters at even indices to evenChars
                evenChars.append(text.charAt(i));
            } else {
                // Append characters at odd indices to oddChars
                oddChars.append(text.charAt(i));
            }
        }

        // Concatenate evenChars and oddChars to get the encrypted text
        return evenChars.toString() + oddChars.toString();
    }

    public static void main(String[] args) {
        String input = "I love CSCI363";
        String encrypted = encrypt(input);
        System.out.println("Encrypted text: " + encrypted);
    }
}
