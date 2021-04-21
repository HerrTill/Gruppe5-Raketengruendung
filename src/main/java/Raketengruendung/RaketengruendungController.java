package Raketengruendung;

import Raketengruendung.Homescreen.HomescreenController;
import Raketengruendung.Rechtsformenfinder.FinderController;

public class RaketengruendungController {



    private static RaketengruendungModel raketengruendungModel;
    private static RaketengruendungView view;



    public static void main(String[] args) {
        HomescreenController homescreenController = HomescreenController.factory();
        FinderController finderController = FinderController.factory();
        raketengruendungModel = RaketengruendungModel.factory();
        view = new RaketengruendungView(raketengruendungModel);
    }

    public static RaketengruendungModel getModel() {
        return raketengruendungModel;
    }

    public static RaketengruendungView getView() {
        return view;
    }
}
