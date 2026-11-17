package com.kaleb.training.fase1_logica.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class PersonaConContrato {

    static class Persona {
        String nombre;

        Persona(String nombre) {
            this.nombre = nombre;
        }

        // TODO: sobreescribe equals (dos Persona son iguales si tienen el mismo nombre)
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Persona persona = (Persona) obj;
            return nombre.equals(persona.nombre);
        }

        // TODO: sobreescribe hashCode (debe basarse en el nombre)
        @Override
        public int hashCode() {
            return nombre.hashCode();
        }

    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Kaleb");
        Persona p2 = new Persona("Kaleb");

        Set<Persona> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println("Tamaño del set: " + set.size());
    }
}
