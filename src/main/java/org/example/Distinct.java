package org.example;

import java.util.List;


public class Distinct {

    public static void main(String[] args) {
        //Objetivo: Remover valores duplicados e calcular quadrados únicos.

        List<Integer> numeros = List.of(2, 4, 6, 2, 8, 4, 10, 6);

        List<Integer> quadrados  = numeros.stream().distinct().map( (n -> n * n )).toList();

        System.out.println(quadrados);

    }
}
