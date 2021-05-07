package Raketengruendung.Rechtsformenfinder.Rechstform;

import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;

public class RechstformController {
    private FragenController parent;
    private RechtsformModel model;
    private RechtsformView view;

    public RechstformController(FragenController parent, RechtsformModel model, RechtsformView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;
        initListener();
    }

    public void initListener() {
        view.getBack().addActionListener(e-> loadHomescreen());
    }

    public void loadHomescreen() {
        parent.loadHomescreen();
    }

    public void setTitel() {
        view.getTitel().setText(model.getTitle());
    }
}
