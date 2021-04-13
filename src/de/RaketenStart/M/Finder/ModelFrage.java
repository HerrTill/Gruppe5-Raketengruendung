package de.RaketenStart.M.Finder;

public class ModelFrage {
    public String Frage;

    public String Antwort_1;

    public String Antwort_2;

    public String Antwort_3;

    public String Antwort_4;

    public ModelFrage (String frage, String antwort_1, String antwort_2, String antwort_3, String antwort_4) {
        this.Antwort_1 = antwort_1;
        this.Antwort_2 = antwort_2;
        this.Antwort_3 = antwort_3;
        this.Antwort_4 = antwort_4;
        this.Frage = frage;
    }

}
