package com.kaleb.training.fase1_logica.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class PersonaSinContrato {

    // Clase Persona que NO sobreescribe equals ni hashCode
    static class Persona {
        String nombre;

        Persona(String nombre) {
            this.nombre = nombre;
        }
    }

    public static void main(String[] args) {
        // 1) Dos personas con el MISMO nombre
        Persona p1 = new Persona("Kaleb");
        Persona p2 = new Persona("Kaleb");

        // 2) Mételas en un HashSet
        Set<Persona> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        // 3) Imprime el tamaño
        System.out.println("Tamaño del set: " + set.size());
    }
}


