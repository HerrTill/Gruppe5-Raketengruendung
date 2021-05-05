package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Rechtsformenfinder.Exceptions.TooManyChildrenException;

public class FragenModel {
    Frage frage1;
    Frage frage2_1, frage2_2;
    Frage frage3_1_1, frage3_1_2, frage3_2_1, frage3_2_2,frage3_3_1, frage3_3_2,frage3_4_1, frage3_4_2;
    Frage frage4;
    Frage frage5;
    Frage frage6;
    Frage frage7;
    public FragenModel() {

        frage1 = new Frage("Wie viele Gründer gibt es?", null);

        frage2_1 = new Frage("Soll es eine persönliche Haftung geben?", "1");
        frage2_2 = new Frage("Soll es eine persönliche Haftung geben?", "2");
        try {
            frage1.addChild(frage2_1);
        } catch (TooManyChildrenException e) {
            System.out.println(e.getMessage());
        }
        try {
            frage1.addChild(frage2_2);
        } catch (TooManyChildrenException e) {
            System.out.println(e.getMessage());
        }

        frage3_1_1 = new Frage("EinzelU", "ja");
        frage3_1_2 = new Frage("Gibt es eine Stammeinlage?", "nein");
        try {
            frage2_1.addChild(frage3_1_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage2_1.addChild(frage3_1_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }

        frage3_2_1 = new Frage("Gibt es eine Stammeinlage?", "ja");
        frage3_2_2 = new Frage("Gibt es eine Stammeinlage?", "nein");
        try {
            frage2_2.addChild(frage3_2_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage2_2.addChild(frage3_2_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }


      /*  frage5 = new FragenModel("Einlagenhöhe?", ">25.000", "<25.000");
        frage5 = new FragenModel("Einlagenhöhe?", "=25.000", "=50.000", "<25.000");
        frage6 = new FragenModel("Buchführung?", "Buchführung nach EÜR, Bilanzierungspflicht, Offenlegung Jahresabschluss", "Bilanzierungspflicht", "Nein");
        frage7 = new FragenModel("Buchführung?", "Bilanzierungspflicht", "Nein");*/
    }

    public Frage getFrage(Frage frage) {
        return frage;
    }

    public Frage getFrage() {
        return frage1;
    }
}
