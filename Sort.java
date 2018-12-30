package Assignments.Assignment12;

import java.util.*;

public class Sort {

    static List<Person> personList;

    public static void main(String[] args) {

        personList = new ArrayList<>();

        personList.add(new Person("Sonu",10));
        personList.add(new Person("Matta",10));
        personList.add(new Person("Gurpreet",10));
       
        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);


    }

    static class Person implements Comparable<Person>{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && (name.toLowerCase().equals(person.name.toLowerCase()));
        }

        @Override
        public int compareTo(Person o) {
            return this.name.compareTo(o.name) + this.age - o.age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
