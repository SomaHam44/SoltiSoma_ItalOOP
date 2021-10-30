package com.company.italOOP;

public class TesztBor {

    public static void kiirBor(Bor bor) {
        System.out.println(bor);
    }

    public static void main(String[] args) {
        Bor bor1 = new Bor("Édes bor", 2016);
        Bor bor2 = new Bor("Száraz fehér bor", 2020);
        Bor bor3 = new Bor("Édes vörös bor", 2012);
        Bor bor4 = new Bor("Félédes fehér bor cukor nélkül", 2018);
        Aszu aszu1 = new Aszu(2014, 2);
        Aszu aszu2 = new Aszu(2013, 4);
        Aszu aszu3 = new Aszu(2019, 3);
        Aszu aszu4 = new Aszu(2011, 5);
        kiirBor(bor1);
        kiirBor(bor2);
        kiirBor(bor3);
        kiirBor(bor4);
        kiirBor(aszu1);
        kiirBor(aszu2);
        kiirBor(aszu3);
        kiirBor(aszu4);




    }
}
