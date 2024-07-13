package StreamProcessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "StreamProcessing.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tek", 40));
        people.add(new Person("Hema", 36));
        people.add(new Person("Prajol", 6));
        people.add(new Person("Prinsa", 12));



        //Collections.sort(people, Collections.reverseOrder());

        // Comment for natural compare/sort
        // Sorting using a custom comparator (by name)
        Collections.sort(people, new PersonComparator());

        for(Person person : people){
            System.out.println(person);
        }
    }
}
class PersonComparator implements Comparator<Person> {
    public int compare(Person person1, Person person2) {
        // Compare based on name
        return person1.getName().compareTo(person2.getName());
    }
}
