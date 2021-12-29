package com.company;

public class Motor {
    private Enum equipment;

    public Motor(){}

    public Motor(Enum equipment) {
        this.equipment = equipment;
    }

    public Enum getEquipment() {
        return equipment;
    }

}
