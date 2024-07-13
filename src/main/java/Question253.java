import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Question253 {
    public static void main(String[] args) {
        List<Persons> people = Arrays.asList(
                new Persons("Bob", 1),
                new Persons(2),
                new Persons("Jane", 3)
        );
        AtomicInteger x = new AtomicInteger();

        people.stream().reduce((e1, e2) -> {x.set(e1.id);
                    if (e1.id > e2.id) {
                        System.out.println(e1);
                        return e1;
                    }
                    x.set(e2.id);
                    System.out.println(e2);
                    return e2;
                })
                .flatMap(e -> Optional.ofNullable(e.name))
                .map(y -> new Persons(y, x.get()))
                .ifPresent(System.out::println);
    }
}