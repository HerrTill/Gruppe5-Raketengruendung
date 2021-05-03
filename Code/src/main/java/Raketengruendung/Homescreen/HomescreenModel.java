package Raketengruendung.Homescreen;

import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.FinderView;

public class HomescreenModel {
    private static HomescreenModel[] models = new HomescreenModel[1];
    public HomescreenModel() {

    }
    public String but1() {
        return "Rechtsformenfinder";
    }

    public String but2() {
        return "Neue Gründung";
    }

    public String but3() {
        return "Laufende Gründungen";
    }

    public static HomescreenModel factory() {
        if (models[0] == null) {
            models[0] = new HomescreenModel();
        }
        return models[0];
    }
}
