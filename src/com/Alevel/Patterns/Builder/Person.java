package com.Alevel.Patterns.Builder;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(){

    }
    public void setFirstname(final String firstname){
        this.firstname = firstname;
    }
    public void setLastname(final String lastname){
        this.lastname = lastname;
    }
    public void setAge(final int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }

    @Override
    public String toString(){
        return "Firstname: " + firstname + "\n" +
                "Lastname: " + lastname + "\n" +
                "Age: " + age;
    }
}
