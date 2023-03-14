package Task2;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // вывод
        HumanApp humanApp = new HumanApp();
        Stream<Human> listHuman = humanApp.getHumans();
        humanApp.printHuman(listHuman);
        System.out.println();

        // суммарный возраст
        HumanApp humanApp1 = new HumanApp();
        Stream<Human> listHuman1 = humanApp1.getHumans();
        System.out.println(humanApp1.getSumAge(listHuman1));
        System.out.println();

        // сортировка по фамилии
        HumanApp humanApp2 = new HumanApp();
        Stream<Human> listHuman2 = humanApp2.getHumans();
        humanApp2.sortByLastName(listHuman2);

        // сортировка по имени
        HumanApp humanApp3 = new HumanApp();
        Stream<Human> listHuman3 = humanApp3.getHumans();
        humanApp3.sortByFirstName(listHuman3);

        // фильтрация
        HumanApp humanApp4 = new HumanApp();
        Stream<Human> listHuman4 = humanApp4.getHumans();
        humanApp3.filterByData(listHuman4);
    }
}
