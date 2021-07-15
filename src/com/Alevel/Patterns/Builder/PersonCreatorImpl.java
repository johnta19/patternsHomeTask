package com.Alevel.Patterns.Builder;


public class PersonCreatorImpl implements PersonCreator {
    private Person newPerson;
    public PersonCreatorImpl(){
        newPerson = new Person();
    }

    @Override
    public Person create() {
        Person person = new Person();
        person.setFirstname(newPerson.getFirstname());
        person.setLastname(newPerson.getLastname());
        person.setAge(newPerson.getAge());
        return person;
    }

    @Override
    public PersonCreator setFirstname(final String firstname) {
        newPerson.setFirstname(firstname);
        return this;
    }

    @Override
    public PersonCreator setLastname(final String lastname) {
        newPerson.setLastname(lastname);
        return this;
    }

    @Override
    public PersonCreator setAge(final int age) {
        newPerson.setAge(age);
        return this;
    }
}
