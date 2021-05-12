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
        resourceBundle = ResourceBundle.getBundle("HOME/HOME", parent.getLocale());
        setText();
    }

    public void setText() {
        view.setWelcomeText(resourceBundle.getString("welcome"));
        view.setFinderText(resourceBundle.getString("finder"));
        view.setFinderInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("finder-info") + resourceBundle.getString("finder") + "</div></html>");
        view.setNewFoundingText(resourceBundle.getString("new_founding"));
        view.setNewFoundingInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("new_founding-info") + resourceBundle.getString("new_founding") + "</div></html>");
        view.setCurrentFoundingText(resourceBundle.getString("current_foundings"));
        view.setCurrentFoundingInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("current_foundings-info") + resourceBundle.getString("current_foundings") + "</div></html>");
        view.setFinishedFoundingText(resourceBundle.getString("finished_foundings"));
        view.setFinishedFoundingInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("finished_foundings-info") + resourceBundle.getString("finished_foundings") + "</div></html>");
    }

    public void initListener() {
        view.setOnClickFinder(()->parent.loadFinder());

        view.setOnLanguageSwitch(this::switchLocale);
        // buttons implementation missing for But 2 and 3
    }

    public void switchLocale() {
        System.out.println("Language Change");
        parent.switchLocale();
    }
}
