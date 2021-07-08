package com.Alevel.Singleton;

public interface PersonCreator {
    Person create();
    PersonCreator setFirstname(final String firstname);
    PersonCreator setLastname(final String lastname);
    PersonCreator setAge(final int age);
}
