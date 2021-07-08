package com.Alevel.Decorator;

public class StandardBuilding implements Building {
    int numFloors = 5;
    int numEntrances = 4;
    @Override
    public int getNumFloors() {
        return this.numFloors;
    }

    @Override
    public int getNumEntrances() {
        return this.numEntrances;
    }
}
