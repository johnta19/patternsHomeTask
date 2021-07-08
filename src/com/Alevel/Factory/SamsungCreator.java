package com.Alevel.Factory;

public class SamsungCreator extends Creator {
    public PhoneCreator factoryCreator() {
        return new Samsung();
    }
}
