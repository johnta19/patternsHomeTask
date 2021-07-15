package com.Alevel.Collections;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        Person person = new Person(20,"John");
        Person person2 = new Person(13,"Donald");
        Person person3 = new Person(65,"Michael");
        Person person4 = new Person(42,"Aaron");
        HashMap<Integer, Person> passportAndName = new HashMap<>();
        passportAndName.put(51851, person);
        passportAndName.put(41422, person2);
        passportAndName.put(12923, person3);
        passportAndName.put(74282, person4);

        Map<Integer, Person> sorted = new TreeMap<>(passportAndName);
        sorted.entrySet().stream()
                .sorted(Map.Entry.<Integer, Person>comparingByValue())
                .forEach(System.out::println);

        System.out.println();

        List<Person> mapValues = new ArrayList<>(passportAndName.values());
        Collections.sort(mapValues);
        mapValues.forEach(System.out::println);

        System.out.println();



        Cat cat = new Cat("Barsik");
        Cat cat2 = new Cat("Barsik");
        Cat cat3 = new Cat("Murchik");
        LinkedList<Cat> myLinkedList = new LinkedList<>();
        myLinkedList.add(cat);
        myLinkedList.add(cat2);
        myLinkedList.add(cat3);


        System.out.println(cat.equals(cat2));
        System.out.println(cat2.equals(cat3));

        System.out.println();

        System.out.println(cat3.hashCode());
        System.out.println(cat2.hashCode());

        System.out.println();

        System.out.println(cat.compareTo(cat2));
        System.out.println(cat2.compareTo(cat3));

    }
}
