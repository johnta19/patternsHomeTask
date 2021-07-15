package com.Alevel.Collections;

public class Cat implements Comparable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Cat other = (Cat) obj;
        if(name.equalsIgnoreCase(other.getName())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if(this.name.length() % 2 == 0){
            return 9;
        }
        return 1;
    }

    @Override
    public int compareTo(Object obj) {
        Cat entry = (Cat) obj;
        int result = name.compareTo(entry.name);
        if(result != 0)
            return -1;
        return 0;
    }
}
