package com.kaleb.training.LeetCodes;

public class LeetCode {

    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println("¿" + x + " es palíndromo? " + result);

    }

    /**
     * Enfoque: dos punteros (left desde el inicio, right desde el final) que
     * comparan los extremos y avanzan hacia el centro.
     *
     * Complejidad: - Tiempo: O(n), donde n es el número de dígitos. - Espacio:
     * O(n), por el String que crea String.valueOf. Leccion: Para optimizar el
     * espacio, se podría revertir la mitad del número y compararla con la otra
     * mitad.
     *
     */
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
