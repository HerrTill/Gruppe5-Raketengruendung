package Raketengruendung.Homescreen;

import Raketengruendung.Master.MasterController;

public class HomescreenController {
    private MasterController parent;
    private HomescreenView view;
    private HomescreenModel model;

    public HomescreenController(MasterController parent, HomescreenModel homescreenModel, HomescreenView homescreenView) {
        this.parent = parent;
        this.model = homescreenModel;
        this.view = homescreenView;
        initListener();
    }

    public void initListener() {
        view.getBut1().addActionListener(e->parent.loadFinder());
        // buttons implementation missing for But 2 and 3
    }
}
