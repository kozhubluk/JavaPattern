package Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HumanApp {

    public Stream<Human> getHumans() {
        List<Human> input = new ArrayList<>();
        input.add(new Human(20, "Ivan", "Ivanov", LocalDate.of(2003, 1, 1), 50));
        input.add(new Human(19, "Olga", "Klochkova", LocalDate.of(2003, 3, 28), 49));
        input.add(new Human(23, "Loran", "Novak", LocalDate.of(2000, 2, 2), 56));
        input.add(new Human(30, "Sergey", "Petrov", LocalDate.of(1992, 10, 10), 60));
        Stream<Human> stream = input.stream();
        return stream;
    }

    //сортировка по фамилии
    public void sortByFirstName(Stream<Human> stream) {
        stream.sorted((humanA, humanB) -> humanA.getFirstName().compareTo(humanB.getFirstName()))
                .forEach(System.out::println);
        System.out.println();
    }
    // получить суммарный возраст
    public int getSumAge(Stream<Human> stream) {

        return stream.mapToInt(Human::getAge).sum();
    }

    // фильтрация по дате рождения
    public void filterByData(Stream<Human> stream) {
        stream.filter(human -> human.getBirthday().isBefore(LocalDate.of(2000, 6, 24)))
                .forEach(System.out::println);
    }

    // вывод
    public void printHuman(Stream<Human> stream) {
        stream.forEach(System.out::println);
    }

    //сортировка по фамилии
    public void sortByLastName(Stream<Human> stream) {
        stream.sorted((humanA, humanB) -> humanA.getLastName().compareTo(humanB.getLastName()))
                .forEach(System.out::println);
        System.out.println();
    }

}
