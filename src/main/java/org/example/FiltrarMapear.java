package org.example;

import java.util.List;

public class FiltrarMapear {


    static class Produto{

        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", preco=" + preco +
                    '}';
        }
    }


        public static void main(String[] args) {
            List<Produto> produtos = List.of(
                    new Produto("Notebook", 3500.00),
                    new Produto("Celular", 1500.00),
                    new Produto("Monitor", 800.00),
                    new Produto("Mouse", 50.00)
            );

            // 1. Filtrar produtos com preço acima de R$ 1000
            //produtos.stream().filter(produto -> produto.getPreco() > 100).forEach(System.out::println);

            // 2. Mapear para aplicar um desconto de 10%
           // produtos.stream().map(produto -> produto.getPreco() * 0.9).toList().forEach(System.out::println);

            // 3. Reduzir para calcular o preço total
                double precoTotal = produtos.stream().map(Produto::getPreco)
                    .reduce(0.0, Double::sum);
            System.out.println("Preço Total: R$ " + precoTotal);

        }

}
