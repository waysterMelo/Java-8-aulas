package org.example.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {


    static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return nome + " (" + idade + " anos)";
        }
    }

    public static void main(String[] args) {

        List<Pessoa> pessoas = List.of(
                new Pessoa("Ana", 18),
                new Pessoa("Carlos", 25),
                new Pessoa("João", 17),
                new Pessoa("Maria", 40),
                new Pessoa("Lucas", 25)
        );

        // Agrupar pessoas por faixa etária
        Map<String, List<Pessoa>> agrupamento = pessoas.stream().collect(Collectors.groupingBy(pessoa -> {
            if (pessoa.getIdade() > 20) return "Maiores de 20";
            else if (pessoa.getIdade() <= 20 ) return "Menores que 20";
            else return "Maiores que 30";
        }));

        agrupamento.forEach( (faixa, lista) -> System.out.println(faixa + ": " + lista) );

    }

}
