package com.company.italOOP;

public class Aszu extends Bor{
    private int puttony;

    /**
     * Az Aszu osztály a Bor osztály leszármazottja, így az évjárat adattagot a Bor osztálytól
     * örökli meg
     * Az Aszu konstruktorban bekérjük az aszu évjáratát és a puttonyát, amely az osztály
     * privát int (egész szám) típusú adattagja
     * @param evjarat a felhasználó által megadott értéket adjuk át az évjárat számára
     * @param puttony a felhasználó által megadott számot kapja meg a puttony adattag
     */
    public Aszu(int evjarat, int puttony) {
        super("Aszu", evjarat);
        this.puttony = puttony;
    }

    /**
     * A getPuttony metódus feladata, hogy visszaadja az osztály puttony adattagjának értékét, ez a
     * metódus olvashatóvá teszi a puttony adattagot
     * @return puttony - visszaadja a puttony adattag értéket
     */

    public int getPuttony() {
        return puttony;
    }

    /**
     * A setPuttony függvény során módosítható lesz a puttony adattag a megadott paraméterrel így
     * írhatóvá váik a puttony adattag
     * @param puttony a paraméter segítségével módosul az eredeti adattag értéke
     */
    public void setPuttony(int puttony) {
        this.puttony = puttony;
    }

    /**
     * A toString eljárás egy formázott kiírást biztosít, mellyel szebbé tehető a
     * az adatok kiírása, ha a konzolon megjelenítjük
     * @return visszaad egy formázott stringet, mely szebb kiírást biztosít az osztály adattagjai
     * számára
     */

    @Override
    public String toString() {
        return String.format("Aszu: évjárata: %d, puttonyainak száma: %d",super.getEvjarat(),this.puttony);
    }
}
