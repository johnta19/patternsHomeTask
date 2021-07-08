package com.Alevel.Decorator;

public class SmallBuilding implements Building{
    private Building building;
    public SmallBuilding(Building building){
        this.building = building;
    }


    @Override
    public int getNumFloors() {
        return this.building.getNumFloors() - 4;
    }

    @Override
    public int getNumEntrances() {
        return this.building.getNumEntrances() - 3;
    }
}
