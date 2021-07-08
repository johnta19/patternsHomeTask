package com.Alevel.Decorator;

public class LargeBuilding implements Building{
    private Building building;
    public LargeBuilding(Building building){
        this.building = building;
    }

    @Override
    public int getNumFloors() {
        return this.building.getNumFloors() + 5;
    }

    @Override
    public int getNumEntrances() {
        return this.building.getNumEntrances() + 4;
    }
}
