package com.Alevel.Patterns.Factory;

public class Samsung implements PhoneCreator {
    @Override
    public void createPhone() {
        System.out.println("Create Samsung");
    }
}
