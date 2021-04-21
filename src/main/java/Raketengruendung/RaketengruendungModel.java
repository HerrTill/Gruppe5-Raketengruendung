package Raketengruendung;

import Raketengruendung.Homescreen.HomescreenModel;
import Raketengruendung.Rechtsformenfinder.FinderModel;

public class RaketengruendungModel {
    private static RaketengruendungModel[] raketengruendungModels = new RaketengruendungModel[1];

    public RaketengruendungModel() {
        HomescreenModel homescreenModel = HomescreenModel.factory();
        FinderModel finderModel = FinderModel.factory();
    }
    public static RaketengruendungModel factory() {
        if (raketengruendungModels[0] == null) {
            raketengruendungModels[0] = new RaketengruendungModel();
        }
        return raketengruendungModels[0];
    }
}
