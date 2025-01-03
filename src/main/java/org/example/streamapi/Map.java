package org.example.streamapi;

import java.util.List;

public class Map {


    public static void main(String[] args) {

        List<String> nomes = List.of("Ana", "Carlos", "João");

        List<String> toUpperCase = nomes.stream().map(String::toUpperCase)
                .toList();

        System.out.println(toUpperCase);


    }
}
