package com.Alevel.Collections;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person (String name) {
        this.name = name;
    }

    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if (age > person.getAge()) {
            return 1;
        }
        else if (age == person.getAge()) {
            return 0;
        }
        return -1;
    }

}

