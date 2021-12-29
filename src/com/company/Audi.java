package com.company;

public final class Audi extends Cars{
    private int colichestvo;


    public Audi(Type type, int colichestvo) {
        super(type);
        this.colichestvo = colichestvo;
    }

    public Audi(Enum equipment, Type type, int colichestvo) {
        super(equipment, type);
        this.colichestvo = colichestvo;
    }

    public int getColichestvo() {
        return colichestvo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nКоличество: "+colichestvo +"\n";
    }
}
