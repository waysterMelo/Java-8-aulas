package org.example.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class IntSummaryStatistics {


    public static void main(String[] args) {
        List<Integer> idades = List.of(18, 25, 17, 40, 25, 30, 22);

        // Estatísticas de idades
        java.util.IntSummaryStatistics estatisticas = idades.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Soma: " + estatisticas.getSum());
        System.out.println("Média: " + estatisticas.getAverage());
        System.out.println("Máximo: " + estatisticas.getMax());
        System.out.println("Mínimo: " + estatisticas.getMin());
    }
}
