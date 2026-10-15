package com.kaleb.training.fase0_diagnostico.ejercicios;

public class DuplicadosSinSet {

    public static void main(String[] args) {
        
        int[] numeros = {1, 5, 3, 1, 900, 3, 1000, 5};


        int[] contador = new int[1000];

        for (int numero : numeros) {
            int posicion = numero - 1; // Ajuste para que 1 -> 0, 2 -> 1, ..., 1000 -> 999

            if (contador[posicion] == 1) {
                System.out.println("Duplicada: " + numero);
            }

        
            contador[posicion]++;
        }
    }
    
}
