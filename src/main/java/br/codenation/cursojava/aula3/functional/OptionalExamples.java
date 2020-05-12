package br.codenation.cursojava.aula3.functional;

import br.codenation.cursojava.aula3.exceptions.Cat;
import br.codenation.cursojava.aula3.exceptions.Dog;
import br.codenation.cursojava.aula3.exceptions.Run;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        Optional<Run> optionalRun = Optional.empty();

        Dog dog = new Dog();
        Optional<Dog> optionalDog = Optional.of(dog);

        Cat cat = null;
        Optional<Cat> optionalCat = Optional.ofNullable(cat);

        Optional<Dog> optionalDog1 = optionalDog.filter(d -> d.getBreed() == null);

        if (optionalRun.isPresent()) {
            System.out.println(optionalRun.get());
        }

        optionalDog.ifPresent(d -> System.out.println(d));

        Optional<String> optString1 = optionalDog.map(d -> d.getName());

        Optional<String> optString2 = optionalDog.flatMap(d -> Optional.ofNullable(d.getName()));

        Cat cat1 = optionalCat.orElse(new Cat());

        Optional<Cat> newOptCat = Optional.of(new Cat());
        Cat cat2 = optionalCat.orElseGet(() -> newOptCat.get());

        Cat cat3 = optionalCat.orElseThrow(() -> new RuntimeException());
    }
}
