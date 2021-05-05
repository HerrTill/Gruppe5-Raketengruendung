package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Rechtsformenfinder.FinderView;

public class FragenController {
    private static FragenController[] controllers = new FragenController[1];
    private static FragenModel model;
    private static FragenView view;
    public FragenController() {
        model = new FragenModel();
        view = new FragenView(model, this);
    }
    public static FragenView getView() {
        return view;
    }


    public static FragenController factory() {
        if (controllers[0] == null) {
            controllers[0] = new FragenController();
        }
        return controllers[0];
    }

    public static void nextQuestion(Frage frage){
        System.out.println("Nächste Frage:"+ frage.getQuestion());
        FragenController.view.loadQuestion(frage);
    }
}
