package de.RaketenStart.M.Finder;

public class ModelFrage1 implements ModelFrage {

    @Override
    public String Frage() {
        return "Wie viele Mitarbeiter";
    }

    @Override
    public String Antwort_1() {
        return "1";
    }

    @Override
    public String Antwort_2() {
        return "<5";
    }

    @Override
    public String Antwort_3() {
        return ">100";
    }

    @Override
    public String Antwort_4() {
        return ">1000";
    }
}
