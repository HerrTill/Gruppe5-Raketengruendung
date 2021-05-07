package Raketengruendung.Homescreen;

import Raketengruendung.Master.MasterController;

import java.util.ResourceBundle;

public class HomescreenController {
    private MasterController parent;
    private HomescreenView view;
    private HomescreenModel model;

    private ResourceBundle resourceBundle;

    public HomescreenController(MasterController parent, HomescreenModel homescreenModel, HomescreenView homescreenView) {
        this.parent = parent;
        this.model = homescreenModel;
        this.view = homescreenView;
        initListener();
        resourceBundle = ResourceBundle.getBundle("HOME", parent.getLocale());
        setText();
    }

    public void setText() {
        view.getWelcome().setText(resourceBundle.getString("welcome"));
        view.getBut1().setText(resourceBundle.getString("finder"));
        view.getBut2().setText(resourceBundle.getString("new_founding"));
        view.getBut3().setText(resourceBundle.getString("current_foundings"));
        view.getBut4().setText(resourceBundle.getString("finished_foundings"));

        view.getFinderL().setText("<html><div style='text-align: center;'>" + resourceBundle.getString("finder-info") + resourceBundle.getString("finder") +  "</div></html>");
        view.getNew_foundingL().setText("<html><div style='text-align: center;'>" +resourceBundle.getString("new_founding-info") +  resourceBundle.getString("new_founding")+ "</div></html>");
        view.getCurrent_foundingL().setText("<html><div style='text-align: center;'>" + resourceBundle.getString("current_foundings-info") +  resourceBundle.getString("current_foundings") + "</div></html>");
        view.getFinished_foundingsL().setText("<html><div style='text-align: center;'>" + resourceBundle.getString("finished_foundings-info") +  resourceBundle.getString("finished_foundings") + "</div></html>");
    }

    public void initListener() {
        view.getBut1().addActionListener(e->parent.loadFinder());
        // buttons implementation missing for But 2 and 3
    }
}
