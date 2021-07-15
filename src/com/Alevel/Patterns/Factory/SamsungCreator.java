package com.Alevel.Patterns.Factory;

public class SamsungCreator extends Creator {
    public PhoneCreator factoryCreator() {
        return new Samsung();
    }
}
