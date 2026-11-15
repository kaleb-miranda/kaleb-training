package com.kaleb.training.fase1_logica.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparTransacciones {

    public static void main(String[] args) {
        String[][] transacciones = {
            {"comida", "100"}, {"transporte", "50"}, {"comida", "75"},
            {"entretenimiento", "200"}, {"transporte", "30"}, {"comida", "25"}
        };

        // clave = categoría, valor = lista de montos de esa categoría
        Map<String, List<String>> porCategoria = new HashMap<>();

        for(String[] transaccion : transacciones) {
            String categoria = transaccion[0];
            String monto = transaccion[1];

            // TODO: recorre transacciones y agrupa usando computeIfAbsent:
            porCategoria.computeIfAbsent(categoria, k -> new ArrayList<>()).add(monto);
        }

        System.out.println(porCategoria);
    }
}
