package com.etiya.rentacar.core.utilities.enums;


public enum States {
    AVAILABLE(1),
    RENTED(2),
    UNDER_MAINTENANCE(3);

    private int id;

    States(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

}
