package com.Alevel.Factory;

public class Samsung implements PhoneCreator {
    @Override
    public void createPhone() {
        System.out.println("Create Samsung");
    }
}
