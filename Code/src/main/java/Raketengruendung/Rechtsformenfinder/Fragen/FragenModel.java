package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Rechtsformenfinder.Exceptions.TooManyChildrenException;

import java.util.ResourceBundle;

public class FragenModel {


//    frage1: founders
//    |----frage2_1: liability
//    |    |----frage3_1_1: EinzelU
//    |    |----frage3_1_2: capital contribution
//    |         |----frage4_1_1: deposit amount
//    |         |    |----frage5_1_1: GmbH
//    |         |    |----frage5_1_2: UG
//    |         |----frage4_1_2: UG


//    |----frage2_2: liability
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//


    private ResourceBundle resourceBundle = ResourceBundle.getBundle("FINDER/FINDER");
    Frage frage1;
    Frage frage2_1, frage2_2;
    Frage frage3_1_1, frage3_1_2, frage3_2_1, frage3_2_2;
    Frage frage4_1_1, frage4_1_2, frage4_2_1, frage4_2_2, frage4_3_1, frage4_3_2;
    Frage frage5_1_1, frage5_1_2, frage5_2_1, frage5_2_2, frage5_2_3, frage5_3_1, frage5_3_2, frage5_3_3, frage5_4_1, frage5_4_2, frage5_5_1, frage5_5_2;
    public FragenModel() {

        frage1 = new Frage(resourceBundle.getString("founders"), null);

        frage2_1 = new Frage(resourceBundle.getString("liability"), "1");
        frage2_2 = new Frage(resourceBundle.getString("liability"), ">1");
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

        frage3_1_1 = new Frage("EinzelU", resourceBundle.getString("yes"));
        frage3_1_2 = new Frage(resourceBundle.getString("capital_contribution"), resourceBundle.getString("no"));
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

        frage3_2_1 = new Frage(resourceBundle.getString("capital_contribution"), resourceBundle.getString("no"));
        frage3_2_2 = new Frage(resourceBundle.getString("capital_contribution"), resourceBundle.getString("yes"));

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

        frage4_1_1 = new Frage(resourceBundle.getString("deposit_amount"), resourceBundle.getString("yes"));
        frage4_1_2 = new Frage("UG", resourceBundle.getString("no"));
        try {
            frage3_1_2.addChild(frage4_1_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage3_1_2.addChild(frage4_1_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        frage4_2_1 = new Frage(resourceBundle.getString("deposit_amount"), resourceBundle.getString("yes"));
        frage4_2_2 = new Frage(resourceBundle.getString("accounting"), resourceBundle.getString("no"));
        try {
            frage3_2_1.addChild(frage4_2_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage3_2_1.addChild(frage4_2_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        frage4_3_1 = new Frage(resourceBundle.getString("accounting"), resourceBundle.getString("yes"));
        frage4_3_2 = new Frage(resourceBundle.getString("accounting"), resourceBundle.getString("no"));
        try {
            frage3_2_2.addChild(frage4_3_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage3_2_2.addChild(frage4_3_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }

        frage5_1_1 = new Frage("GmbH", ">25.000€");
        frage5_1_2 = new Frage("UG", "<25.000€");
        try {
            frage4_1_1.addChild(frage5_1_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_1_1.addChild(frage5_1_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        frage5_2_1 = new Frage("GmbH", "=25.000€");
        frage5_2_2 = new Frage("AG", "=50.000€");
        frage5_2_3 = new Frage("UG", "<25.000€");
        try {
            frage4_2_1.addChild(frage5_2_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_2_1.addChild(frage5_2_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_2_1.addChild(frage5_2_3);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        frage5_3_1 = new Frage("UG", resourceBundle.getString("Accounting_EUR"));
        frage5_3_2 = new Frage("KG", resourceBundle.getString("Bilanzpflicht"));
        frage5_3_3 = new Frage("PartnerG", resourceBundle.getString("no"));
        try {
            frage4_2_2.addChild(frage5_3_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_2_2.addChild(frage5_3_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_2_2.addChild(frage5_3_3);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        frage5_4_1 = new Frage("OHG", resourceBundle.getString("Bilanzpflicht"));
        frage5_4_2 = new Frage("GbR", resourceBundle.getString("no"));
        try {
            frage4_3_1.addChild(frage5_4_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_3_1.addChild(frage5_4_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        frage5_5_1 = new Frage("OHG", resourceBundle.getString("Bilanzpflicht"));
        frage5_5_2 = new Frage("GbR", resourceBundle.getString("no"));
        try {
            frage4_3_2.addChild(frage5_5_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            frage4_3_2.addChild(frage5_5_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }



      /*  frage5 = new FragenModel("Einlagenhöhe?", ">25.000", "<25.000");
        frage5 = new FragenModel("Einlagenhöhe?", "=25.000", "=50.000", "<25.000");
        frage6 = new FragenModel("Buchführung?", "Buchführung nach EÜR, Bilanzierungspflicht, Offenlegung Jahresabschluss", "Bilanzierungspflicht", "Nein");
        frage7 = new FragenModel("Buchführung?", "Bilanzierungspflicht", "Nein");*/
    }

    public Frage getFirstQuestion() {
        return frage1;
    }
}
