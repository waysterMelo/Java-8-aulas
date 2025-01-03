package optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class FlatMap {

    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User("John", "john.doe@example.com"));

        // Obter o email de forma segura
        String email = user.flatMap(User::getEmail).orElse("Email nao disponivel");
        System.out.println(email);
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

}
