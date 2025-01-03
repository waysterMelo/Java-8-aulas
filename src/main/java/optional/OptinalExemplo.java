package optional;

import java.util.Optional;

public class OptinalExemplo {

    public static void main(String[] args) {

        //criando um optional com um valor presente
        Optional<String> optional = Optional.of("Valor presente");
        System.out.println("Valor: " + optional.get());


        //criando um optional com um valor ausente
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Esta presente ? " + emptyOptional.isPresent());

        //usando ofNullable
        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println("Esta presente ?  " + nullableOptional.isPresent());
    }


}
