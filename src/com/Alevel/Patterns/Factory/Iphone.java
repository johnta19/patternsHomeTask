package com.Alevel.Patterns.Factory;

public class Iphone implements PhoneCreator {
    @Override
    public void createPhone() {
        System.out.println("Create Iphone");
    }
}
