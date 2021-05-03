package Raketengruendung.Rechtsformenfinder;

import Raketengruendung.Rechtsformenfinder.Fragen.FragenModel;

public class FinderModel {
    private static FinderModel[] models = new FinderModel[1];
    FragenModel frage1;
    public FinderModel() {
        frage1 = new FragenModel("Test?", "1", "2", "3","4");
    }

    public FragenModel getFrage1() {
        return frage1;
    }
    public static FinderModel factory() {
        if (models[0] == null) {
            models[0] = new FinderModel();
        }
        return models[0];
    }
}
