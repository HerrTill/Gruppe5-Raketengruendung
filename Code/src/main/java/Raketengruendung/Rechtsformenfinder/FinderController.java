package Raketengruendung.Rechtsformenfinder;

import Raketengruendung.Master.MasterController;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenModel;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenView;

public class FinderController {
    private FinderModel model;
    private FinderView view;
    private MasterController masterController;
    private FragenModel fragenModel;
    private FragenView fragenView;
    private FragenController fragenController;

    public FinderController(MasterController parent, FinderModel model, FinderView view) {
        this.masterController = parent;
        this.model = model;
        this.view = view;
        initListener();
    }

    public void initListener() {
        view.getStart().addActionListener(e->startFinder());
        view.getHome().addActionListener(e->loadHomescreen());
    }

    public void startFinder() {
        fragenModel = new FragenModel();
        fragenView = new FragenView();
        fragenController = new FragenController(this, fragenModel, fragenView);

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
