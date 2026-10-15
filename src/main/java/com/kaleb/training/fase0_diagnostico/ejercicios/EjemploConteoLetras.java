package com.kaleb.training.fase0_diagnostico.ejercicios;

/**
 * EJEMPLO ANÁLOGO — NO es la solución de tu ejercicio (duplicados del 1 al 1000).
 *
 * Problema resuelto aquí: dada una palabra, imprimir qué letras aparecen
 * más de una vez.
 *
 * El patrón que demuestra este ejemplo ("el valor se convierte en índice")
 * es exactamente el mismo que vas a aplicar con números del 1 al 1000.
 */
public class EjemploConteoLetras {

    public static void main(String[] args) {
        String palabra = "banana";

        // 26 casillas: una por letra. Casilla 0 = 'a', 1 = 'b', ..., 25 = 'z'.
        int[] contador = new int[26];

        for (char letra : palabra.toCharArray()) {
            // Convierte la letra en su casilla: 'a' -> 0, 'b' -> 1, ..., 'z' -> 25.
            int posicion = letra - 'a';

            // CONDICIÓN CLAVE: si la casilla YA vale 1, es que esa letra
            // había aparecido ANTES. Acabamos de encontrar un duplicado.
            if (contador[posicion] == 1) {
                System.out.println("Duplicada: " + letra);
            }

            // Registramos que la letra apareció una vez más.
            contador[posicion]++;
        }
    }
}
