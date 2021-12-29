package com.company;

import java.util.Random;

public class Cars extends Motor{
    private Type type;

    public Cars(Enum equipment) {
        super(equipment);
    }

    public Cars(Type type) {
        this.type = type;
    }

    public Cars(Enum equipment, Type type) {
        super(equipment);
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    public void eating(String eat){
        System.out.println(eat);
    }
    public final void norm(){
        Random random = new Random();
        int dfsd = random.nextInt(2);
        if (dfsd == 0){
            System.out.println("Люкс");
        }
        if (dfsd == 1){
            System.out.println("Бомж пакет");
        }
    }
    public String getInfo (){
        return "Тип: "+type.getType() + "\nКомплектация: "+getEquipment();
    }

}