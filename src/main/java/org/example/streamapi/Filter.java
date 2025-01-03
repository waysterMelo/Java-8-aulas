package org.example.streamapi;

import java.util.List;

public class Filter {

    public static void main(String[] args) {

        List<String> nomes = List.of("Ana", "Carlos", "Amanda", "João", "Alice");

        List<String> nomesA = nomes.stream().filter(resultado -> resultado.startsWith("A")).toList();

        System.out.println(nomesA);

    }

}
