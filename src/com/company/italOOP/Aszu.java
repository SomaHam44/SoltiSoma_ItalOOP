package com.company.italOOP;

public class Aszu extends Bor{
    private int puttony;

    public Aszu(int evjarat, int puttony) {
        super("Aszu", evjarat);
        this.puttony = puttony;
    }

    public int getPuttony() {
        return puttony;
    }

    public void setPuttony(int puttony) {
        this.puttony = puttony;
    }

    @Override
    public String toString() {
        return String.format("Aszu: évjárata: %d, puttonyainak száma: %d",super.getEvjarat(),this.puttony);
    }
}
