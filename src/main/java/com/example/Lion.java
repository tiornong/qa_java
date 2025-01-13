package com.example;

import java.util.List;

public class Lion {

    final Feline feline;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        if (sex.equalsIgnoreCase("male") || sex.equalsIgnoreCase("самец")) {
            hasMane = true;
        } else if (sex.equalsIgnoreCase("female") || sex.equalsIgnoreCase("самка")) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец/male или самка/female");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
