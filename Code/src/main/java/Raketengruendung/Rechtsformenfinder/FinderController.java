package Raketengruendung.Rechtsformenfinder;

import Raketengruendung.Master.MasterController;
import Raketengruendung.Rechtsformenfinder.Fragen.Fragen;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenModel;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenView;

import java.util.ResourceBundle;

public class FinderController {
    private FinderModel model;
    private FinderView view;
    private MasterController masterController;

    private ResourceBundle resourceBundle;

    public FinderController(MasterController parent, FinderModel model, FinderView view) {
        this.masterController = parent;
        this.model = model;
        this.view = view;
        initListener();
        resourceBundle  = ResourceBundle.getBundle("FINDER/FINDER", parent.getLocale());
        setText();
    }

    public void setText() {
        view.setMainmenuText(resourceBundle.getString("mainMenu"));
        view.setTitleText(resourceBundle.getString("welcome"));
        view.setStartText(resourceBundle.getString("start"));
    }

    public void initListener() {
        view.setOnClickMainmenu(this::loadHomescreen);
        view.setOnClickStart(this::startFinder);
    }

    public void startFinder() {
        FragenModel fragenModel = new FragenModel();
        Fragen fragenView = new Fragen();
        FragenController fragenController = new FragenController(this, fragenModel, fragenView);

        masterController.changePanel(fragenView);
    }

    public void loadHomescreen() {
        masterController.loadHomescreen();
    }

    public FinderView getView() {
        return view;
    }
    public FinderModel getModel() {
        return model;
    }

    public MasterController getMasterController() {
        return masterController;
    }

    public void setMasterController(MasterController masterController) {
        this.masterController = masterController;
    }
}
