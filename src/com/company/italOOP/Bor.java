package com.company.italOOP;

public class Bor {
    private String fajta;
    private int evjarat;

    /**
     * A Bor osztály konstruktorában bekérjük a fajtát és az évjárat, melyet a felhasználó
     * ad meg a létrehozás során.
     * @param fajta a felhasználó által megadott értéket kapja meg az adattag
     * @param evjarat a felhasználó által megadott évet adjuk át az adattagnak
     */


    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }

    /**
     * A getFajta eljárás a bor fajtájával tér vissza, amellyel olvashatóvá válik ez az adattag
     * @return visszatér a fajta adattag értékével
     */

    public String getFajta() {
        return fajta;
    }

    /**
     * A setFajta függvény a bor fajtáját módosíthatja a paraméterünk segítségével, mellyel
     * írható lesz a fajta adattagunk
     * @param fajta - a fajta paraméter az eredeti adattag értékét fogja módosítani
     */

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    /**
     * A getEvjarat metódus visszatér az évjárat adattag értékével, amellyel leolvasható lesz
     * a bor évjárata
     * @return visszatér az évjárat adattag értékével
     */

    public int getEvjarat() {
        return evjarat;
    }

    /**
     * A setEvjarat eljárás a megadott évjárattal módosíthatja az adattag értékét, ezáltal
     * az adattag írható lesz
     * @param evjarat a paraméterrel módosul az évjárat adattag értéke
     */

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    /**
     * A toString metódus egy szebb kiírást biztosít az osztály számára
     * @return - visszatér egy formázott kiírással, amely jobb kiíratást biztosít
     */

    @Override
    public String toString() {
        return String.format("Bor: %s, évjárata: %d", this.fajta, this.evjarat);
    }



}
