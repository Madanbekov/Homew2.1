package com.company;

public class Main {

    public static void main(String[] args) {
        Type type = new Type("Машина");
        Type type2 = new Type("Ауди");

        Cars objectA =new Cars(Enum.BUSINESS,type);
        objectA.norm();
        System.out.println(objectA.getInfo());
        System.out.println("\n");

        Audi objectB = new Audi(type2,200);
        System.out.println(objectB.getInfo());

        Audi objectC = new Audi(Enum.LUX,type2,10);
        System.out.println(objectC.getInfo());



    }
}
