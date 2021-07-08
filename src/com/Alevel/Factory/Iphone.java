package com.Alevel.Factory;

public class Iphone implements PhoneCreator {
    @Override
    public void createPhone() {
        System.out.println("Create Iphone");
    }
}
