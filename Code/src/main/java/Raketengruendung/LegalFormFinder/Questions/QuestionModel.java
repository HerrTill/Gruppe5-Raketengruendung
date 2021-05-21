package Raketengruendung.LegalFormFinder.Questions;

import Raketengruendung.LegalFormFinder.Exceptions.TooManyChildrenException;

import java.util.ResourceBundle;

public class QuestionModel {


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
    Question question1;
    Question question2_1, question2_2;
    Question question3_1_1, question3_1_2, question3_2_1, question3_2_2;
    Question question4_1_1, question4_1_2, question4_2_1, question4_2_2, question4_3_1, question4_3_2;
    Question question5_1_1, question5_1_2, question5_2_1, question5_2_2, question5_2_3, question5_3_1,
             question5_3_2, question5_3_3, question5_4_1, question5_4_2, question5_5_1, question5_5_2;

    public QuestionModel() {

        this.question1 = new Question(resourceBundle.getString("founders"), null);

        this.question2_1 = new Question(resourceBundle.getString("liability"), "1");
        this.question2_2 = new Question(resourceBundle.getString("liability"), ">1");
        try {
            this.question1.addChild(this.question2_1);
        } catch (TooManyChildrenException e) {
            System.out.println(e.getMessage());
        }
        try {
            this.question1.addChild(this.question2_2);
        } catch (TooManyChildrenException e) {
            System.out.println(e.getMessage());
        }

        this.question3_1_1 = new Question("EinzelU", resourceBundle.getString("yes"));
        this.question3_1_2 = new Question(resourceBundle.getString("capital_contribution"), resourceBundle.getString("no"));
        try {
            this.question2_1.addChild(this.question3_1_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question2_1.addChild(this.question3_1_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }

        this.question3_2_1 = new Question(resourceBundle.getString("capital_contribution"), resourceBundle.getString("no"));
        this.question3_2_2 = new Question(resourceBundle.getString("capital_contribution"), resourceBundle.getString("yes"));

        try {
            this.question2_2.addChild(this.question3_2_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question2_2.addChild(this.question3_2_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }

        this.question4_1_1 = new Question(resourceBundle.getString("deposit_amount"), resourceBundle.getString("yes"));
        this.question4_1_2 = new Question("UG", resourceBundle.getString("no"));
        try {
            this.question3_1_2.addChild(this.question4_1_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question3_1_2.addChild(this.question4_1_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        this.question4_2_1 = new Question(resourceBundle.getString("deposit_amount"), resourceBundle.getString("yes"));
        this.question4_2_2 = new Question(resourceBundle.getString("accounting"), resourceBundle.getString("no"));
        try {
            this.question3_2_1.addChild(this.question4_2_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question3_2_1.addChild(this.question4_2_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        this.question4_3_1 = new Question(resourceBundle.getString("accounting"), resourceBundle.getString("yes"));
        this.question4_3_2 = new Question(resourceBundle.getString("accounting"), resourceBundle.getString("no"));
        try {
            this.question3_2_2.addChild(this.question4_3_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question3_2_2.addChild(this.question4_3_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }

        this.question5_1_1 = new Question("GmbH", ">25.000€");
        this.question5_1_2 = new Question("UG", "<25.000€");
        try {
            this.question4_1_1.addChild(this.question5_1_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_1_1.addChild(this.question5_1_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        this.question5_2_1 = new Question("GmbH", "=25.000€");
        this.question5_2_2 = new Question("AG", "=50.000€");
        this.question5_2_3 = new Question("UG", "<25.000€");
        try {
            this.question4_2_1.addChild(this.question5_2_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_2_1.addChild(this.question5_2_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_2_1.addChild(this.question5_2_3);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        this.question5_3_1 = new Question("UG", resourceBundle.getString("Accounting_EUR"));
        this.question5_3_2 = new Question("KG", resourceBundle.getString("Bilanzpflicht"));
        this.question5_3_3 = new Question("PartnerG", resourceBundle.getString("no"));
        try {
            this.question4_2_2.addChild(this.question5_3_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_2_2.addChild(this.question5_3_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_2_2.addChild(this.question5_3_3);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        this.question5_4_1 = new Question("OHG", resourceBundle.getString("Bilanzpflicht"));
        this.question5_4_2 = new Question("GbR", resourceBundle.getString("no"));
        try {
            this.question4_3_1.addChild(this.question5_4_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_3_1.addChild(this.question5_4_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        this.question5_5_1 = new Question("OHG", resourceBundle.getString("Bilanzpflicht"));
        this.question5_5_2 = new Question("GbR", resourceBundle.getString("no"));
        try {
            this.question4_3_2.addChild(this.question5_5_1);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
        try {
            this.question4_3_2.addChild(this.question5_5_2);
        } catch (TooManyChildrenException e) {
            e.printStackTrace();
        }
    }

    public Question getFirstQuestion() {
        return question1;
    }
}
