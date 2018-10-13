package org.practice.enumeration;

/**
 * Created by estifen on 10/13/2018.
 */
public enum  Location {

    LONDON("London,uk")
    ,SAN_FRANCISCO("San Francisco,us")
    ,PRAGUE("Prague,cz");

    private String name;

    Location(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
