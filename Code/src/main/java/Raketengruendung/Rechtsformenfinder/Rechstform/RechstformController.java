package Raketengruendung.Rechtsformenfinder.Rechstform;

import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;

import java.util.ResourceBundle;

public class RechstformController {
    private FragenController parent;
    private RechtsformModel model;
    private RechtsformView view;
    private ResourceBundle resourceBundle;

    public RechstformController(FragenController parent, RechtsformModel model, RechtsformView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;
        initListener();
        resourceBundle = ResourceBundle.getBundle("FINDER", parent.getLocale());
        setText();
    }

    public void initListener() {
        view.setOnClickBack(this::loadHomescreen);
    }

    public void loadHomescreen() {
        parent.loadHomescreen();
    }

    public void setText() {
        view.setBackText(resourceBundle.getString("back"));
    }
}
