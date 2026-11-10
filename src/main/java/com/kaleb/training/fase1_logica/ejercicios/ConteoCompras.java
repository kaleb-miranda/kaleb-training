package com.kaleb.training.fase1_logica.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConteoCompras {

    public static void main(String[] args) {
        String[] compras = {"manzana", "pera", "manzana", "uva", "pera", "manzana", "uva", "sandia"};

        // ============ 1) ArrayList: todas las compras en orden ============
        List<String> lista = new ArrayList<>();
        // TODO: agrega todas las compras a "lista" (usa un for-each sobre el arreglo)
        // TODO: agrega "melon" al final
        // TODO: imprime "lista"
        for(String compra : compras) {
            lista.add(compra);
        };
        lista.add("melon");
        System.out.println("Lista de compras: " + lista);

        // ============ 2) HashSet: productos únicos ============
        Set<String> unicos = new HashSet<>();
        // TODO: agrega todas las compras a "unicos" (los duplicados se ignoran solos)
        // TODO: imprime "unicos"
        for (String compra : lista) {
            unicos.add(compra);
        }
        System.out.println("Productos únicos: " + unicos);


        // ============ 3) HashMap: conteo por producto ============
        Map<String, Integer> conteo = new HashMap<>();
        // TODO: por cada compra, usa el patrón: conteo.put(compra, conteo.getOrDefault(compra, 0) + 1)
        // TODO: imprime "conteo"
        for (String compra : lista) {
            conteo.put(compra, conteo.getOrDefault(compra, 0) + 1);
        }
        System.out.println("Conteo por producto: " + conteo);
    }
}
