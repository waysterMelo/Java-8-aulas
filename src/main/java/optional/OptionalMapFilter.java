package optional;

import java.util.Optional;

public class OptionalMapFilter {


    public static void main(String[] args) {
        Optional<String> optional = Optional.of("java 8 optional");

        //transformar o valor com map
        Optional<String> transformed = optional.map(String::trim).map(String::toUpperCase);
        transformed.ifPresent(System.out::println);

        //filtrar os valores
        Optional<String> filtered = optional.map(String::trim)
                .filter(value -> value.length() > 10);
        filtered.ifPresent(System.out::println);

    }
}
