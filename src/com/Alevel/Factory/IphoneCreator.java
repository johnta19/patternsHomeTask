package com.Alevel.Factory;

public class IphoneCreator extends Creator {
    public PhoneCreator factoryCreator() {
        return new Iphone();
    }
}
