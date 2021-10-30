package com.company.italOOP;

public class Main {
    /**
     * A fő Main osztályban meghívjuk a tesztelő osztályt (TesztBor) és annak
     * azon függvényét a (TesztBor.main), mellyel megjelenik a futtatás során a
     * példányok kiíratása
     * @param args - statkius Main függvény paramétere, így az egész osztályon belül láthatóak a
     *             mainben szereplő funkciók
     */

    public static void main(String[] args) {
        TesztBor tesztBor = new TesztBor();
        TesztBor.main(args);


    }
}
