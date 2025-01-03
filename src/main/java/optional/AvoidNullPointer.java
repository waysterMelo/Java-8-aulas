package optional;

import java.util.Optional;

public class AvoidNullPointer {

    public static void main(String[] args) {

        String nome = "Wayster";

        //maneira tradicional
        if (nome != null){
            System.out.println(nome.toUpperCase());
        }else {
            System.out.println("Nome nao esta definido.");
        }

        //com optional
        Optional.ofNullable(nome).ifPresentOrElse(value -> System.out.println(value.toUpperCase()),
                () -> System.out.println(("Nome nao encontrado")));

    }
}
