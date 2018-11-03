package sda.java12poz.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private static final String[] NAMES = {"Marek", "Darek", "Jarek", "Anna", "Kasia", "Aneta", "Jan", "Maria"};
    private static final String[] LAST_NAMES = {"Kowal", "Perek", "Kaczor", "Krych", "Gożdżon", "Pryber", "Tabaka"};
    private static final int MIN_YEAR = 1950;
    private static final int MAX_YEAR = 2010;
    private String name;
    private String lastName;
    private LocalDate birthDate;

    public Person(String name, String lastName, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person(String name, String lastName, int day, int month, int year) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return String.format("\n%s %s (%s)", name, lastName, birthDate);
    }

    @Override
    public int compareTo(Person o) {
        String localValue = lastName + name;
        String anotherValue = o.lastName + o.name;
        return localValue.compareTo(anotherValue);
    }

    public static Person[] exampleArray(int size) {
        Person[] persons = new Person[size];
        for (int i = 0; i < size; i++) {
            persons[i] = examplePerson();
        }
        return persons;
    }

    public static Person examplePerson() {
        return new Person(
                NAMES[(int) (Math.random() * NAMES.length)],
                LAST_NAMES[(int) (Math.random() * LAST_NAMES.length)],
                LocalDate.ofYearDay(MIN_YEAR + (int) (Math.random() * (MAX_YEAR - MIN_YEAR)), 1 + (int) (Math.random() * 364))
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
