package com.kaleb.training.fase1_logica.ejercicios;


public class StringPoolDemo {

    public static void main(String[] args) {
        String a = "hola";
        String b = "hola";
        String c = new String("hola");
        String d = c.intern();

        System.out.println("a == b:      " + (a == b));
        System.out.println("a == c:      " + (a == c));
        System.out.println("a.equals(c): " + (a.equals(c)));
        System.out.println("a == d:      " + (a == d));

        String x = "hola";
        x.concat(" mundo");
        System.out.println("x = " + x);

        

    }
}
