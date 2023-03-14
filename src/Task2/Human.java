package Task2;

import java.time.LocalDate;

public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthday, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", weight=" + weight +
                '}';
    }
}
