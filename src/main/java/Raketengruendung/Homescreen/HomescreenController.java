package Raketengruendung.Homescreen;

import Raketengruendung.Initial.Window;
import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.FinderView;

public class HomescreenController {
    private static HomescreenController[] controllers = new HomescreenController[1];
    private static HomescreenView view;
    private static HomescreenModel model;

    public HomescreenController() {
        model = HomescreenModel.factory();
        view = new HomescreenView(model);

    }
    public static HomescreenView getView() {
        return view;
    }
    public static HomescreenModel getModel() {
        return model;
    }
    public static HomescreenController factory() {
        if (controllers[0] == null) {
            controllers[0] = new HomescreenController();
        }
        return controllers[0];
    }
}
