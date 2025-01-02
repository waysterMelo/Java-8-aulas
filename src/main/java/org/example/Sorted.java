package org.example;

import java.util.List;

public class Sorted {

    public static void main(String[] args){
        List<Integer> numeros = List.of(12, 45, 3, 22, 89, 7, 25);

        List<Integer> maioresNumeros = numeros.stream().sorted((n1, n2) -> n2 - n1)
                .limit(3)
                .toList();

        System.out.println(maioresNumeros);

    }
}
