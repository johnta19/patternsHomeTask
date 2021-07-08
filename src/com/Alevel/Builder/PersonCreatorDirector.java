package com.Alevel.Builder;

public class PersonCreatorDirector {
    private PersonCreator builder;

    public PersonCreatorDirector(final PersonCreator builder) {
        this.builder = builder;
    }
    public Person create(){
        return builder.setFirstname("John").
                       setLastname("Smith").
                       setAge(24).
                       create();
    }
}
