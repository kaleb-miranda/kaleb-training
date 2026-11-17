package com.kaleb.training.fase1_logica.ejercicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteracionColecciones {

    public static void main(String[] args) {
        List<String> nombres = List.of("Kaleb", "Ana", "Luis", "Maria");

        // TODO 1: imprime los nombres con for-each (clásico)
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // TODO 2: imprime los nombres con forEach + lambda
        nombres.forEach(nombre -> System.out.println(nombre));

        // TODO 3: imprime los nombres con forEach + referencia a método (::)
        nombres.forEach(System.out::println);

        // ============ Bonus: recorrer un Map ============
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Kaleb", 25);
        edades.put("Ana", 30);
        edades.put("Luis", 28);

        // TODO 4: recorre edades con entrySet() e imprime "clave -> valor"
        edades.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
