package com.Alevel;

import com.Alevel.Decorator.LargeBuilding;
import com.Alevel.Decorator.SmallBuilding;
import com.Alevel.Decorator.StandardBuilding;
import com.Alevel.Factory.*;
import com.Alevel.Singleton.PersonCreator;
import com.Alevel.Singleton.PersonCreatorDirector;
import com.Alevel.Singleton.PersonCreatorImpl;
import com.Alevel.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        //Singleton
        Singleton.getInstance();

        //Builder
        final PersonCreator builder = new PersonCreatorImpl();
        final PersonCreatorDirector personCreatorDirector = new PersonCreatorDirector(builder);
        System.out.println(personCreatorDirector.create());

        //Factory
        Creator[] creators = {new IphoneCreator(), new SamsungCreator()};
        for (Creator creator : creators){
            PhoneCreator phoneCreator = creator.factoryCreator();
            System.out.println("Created from " + phoneCreator.getClass());
        }
        PhoneCreator creatorSamsung = new Samsung();
        PhoneCreator creatorIphone = new Iphone();
        creatorSamsung.createPhone();
        creatorIphone.createPhone();

        /*Decorator pattern example.
        We has standard building with 2 parameters: number of floors, number of entrances.
        We can increase and decrease their number.*/
        StandardBuilding standardBuilding = new StandardBuilding();
        System.out.println("Number of floors in standard building is: " + standardBuilding.getNumFloors());
        System.out.println("Number of entrances in standard building is: " + standardBuilding.getNumEntrances());

        SmallBuilding smallBuilding = new SmallBuilding(standardBuilding);
        System.out.println("Number of floors in small building is: " + smallBuilding.getNumFloors());
        System.out.println("Number of entrances in small building is: " + smallBuilding.getNumEntrances());

        LargeBuilding largeBuilding = new LargeBuilding(standardBuilding);
        System.out.println("Number of floors in large building is: " + largeBuilding.getNumFloors());
        System.out.println("Number of entrances in large building is: " + largeBuilding.getNumEntrances());
    }
}
