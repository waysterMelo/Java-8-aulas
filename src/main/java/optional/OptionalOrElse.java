package optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOrElse {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();

        //valor alternativo usando orElse
        String valor = optional.orElse("");
        System.out.println(valor);

        //lancar uma exceção usando orElseThrow
        try {
            optional.orElseThrow( () -> new IllegalArgumentException("Valor ausente"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
