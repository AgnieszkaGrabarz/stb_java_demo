import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoApp {

    public static void main(String[] args) {

        // STREAMY - STRUMIENIE WARTOŚCI

        // METODY POŚREDNIE - ZWRACAJĄ NOWE STREAMY
        // filter - filtrownie elemetów
        // map - przekształcanie elemetów

        // METODY TERMINALNE - SĄ WYKONYWANE JAKO OSTATNIE - ZWRACAJĄ WARTOŚĆ, POZWALAJĄ ZEBRAĆ WARTOŚCI DO KOLEKCJI
        // forEach - wyświetlanie elementów
        // min | max | sum
        // anyMatch | allMatch | nonMatch
        // count
        // collect - zbieranie elemetów

        List<String> names = new ArrayList<>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Franek");
        names.add("Feliks");
        names.add("Romek");

//        for (String name : names) {
//            if(name.startsWith("F")){
//                System.out.println(name);
//            }
//        }

        names.stream()
                .filter(name -> name.startsWith("F"))
                .forEach(System.out::println);

        long numberOfFNames = names.stream()
                .filter(name -> name.startsWith("F"))
                .count();

        System.out.println(numberOfFNames);

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        names.stream()
                .map(name -> name + " jakiś text")
                .forEach(System.out::println);

        boolean anyMatchEndsWithK = names.stream()
                .anyMatch(name -> name.endsWith("k"));

        System.out.println(anyMatchEndsWithK);

        boolean allMatchEndsWithK = names.stream()
                .allMatch(name -> name.endsWith("k"));

        System.out.println(allMatchEndsWithK);

        List<String> namesStartsWithF = names.stream()
                .filter(name -> name.startsWith("F"))
                .filter(name -> !name.endsWith("k"))
                .collect(Collectors.toList());

        namesStartsWithF.stream()
                .forEach(System.out::println);

        // LISTA OBIEKTÓW

        List<User> users = new ArrayList<>();
        users.add(new User("Bartek", "Czarny", "bartek@test.pl", 38, true));
        users.add(new User("Tomek", "Biały", "tomek@test.com", 17, true));
        users.add(new User("Michał", "Brązowy", "michal@o2.pl", 21, false));
        users.add(new User("Łukasz", "Czerwony", "lukasz@gmail.com", 25, true));
        users.add(new User("Krzysiek", "Fioletowy", "krzysiek@test.eu", 56, false));
        users.add(new User("Marcin", "Zielony", "marcin@wp.pl", 30, true));


        System.out.println(" ");
        System.out.println("Użytkownicy, których email kończy się na .pl");
        users.stream()
                .filter(user -> user.getEmail().endsWith(".pl"))
                .forEach(System.out::println);


        System.out.println(" ");
        System.out.println("Użytkownicy, którzy nie lubią lodów");
        users.stream()
                .filter(user -> user.getLikeIceCream().equals(false))
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Dorośli użytkownicy");
        users.stream()
                .filter(user -> user.getAge() > 18)
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Najmłodszy użytkownik");
        User theYoungestUser = users.stream()
                .min(Comparator.comparing(user -> user.getAge()))
                .get();

        theYoungestUser.introduceYourself();

    }

}
