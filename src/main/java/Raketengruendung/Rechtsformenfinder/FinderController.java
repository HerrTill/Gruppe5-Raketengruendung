package Raketengruendung.Rechtsformenfinder;

import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;

public class FinderController {
    private static FinderController[] controllers = new FinderController[1];
    private static FinderModel model;
    private static FinderView view;
    public FinderController() {
        FragenController controller = new FragenController();
        model = new FinderModel();
        view = FinderView.factory();
    }

    public FinderView getView() {
        return view;
    }
    public static FinderModel getModel() {
        return model;
    }
    public static FinderController factory() {
        if (controllers[0] == null) {
            controllers[0] = new FinderController();
        }
        return controllers[0];
    }
}
