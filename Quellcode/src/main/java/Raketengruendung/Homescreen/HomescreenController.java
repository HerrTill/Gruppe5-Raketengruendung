package Raketengruendung.Homescreen;

import Raketengruendung.Master.MasterController;

import java.util.Locale;
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

        this.resourceBundle = ResourceBundle.getBundle("HOME/HOME", parent.getLocale());

        this.initListener();
        this.setText();
    }

    public void setText() {
        this.view.setWelcomeText(resourceBundle.getString("welcome"));
        this.view.setFinderText("<html><div style='text-align: center;'>" + resourceBundle.getString("finder") + "</div></html>");
        this.view.setFinderInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("finder-info") + " " + resourceBundle.getString("finder") + "</div></html>");
        this.view.setNewFoundingText("<html><div style='text-align: center;'>" + resourceBundle.getString("new_founding") + "</div></html>");
        this.view.setNewFoundingInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("new_founding-info") + " " + resourceBundle.getString("new_founding") + "</div></html>");
        this.view.setCurrentFoundingText("<html><div style='text-align: center;'>" + resourceBundle.getString("current_foundings") + "</div></html>");
        this.view.setCurrentFoundingInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("current_foundings-info") + " " + resourceBundle.getString("current_foundings") + "</div></html>");
        this.view.setFinishedFoundingText("<html><div style='text-align: center;'>" + resourceBundle.getString("finished_foundings") + "</div></html>");
        this.view.setFinishedFoundingInformationText("<html><div style='text-align: center;'>" + resourceBundle.getString("finished_foundings-info") + " " + resourceBundle.getString("finished_foundings") + "</div></html>");
        if (parent.getLocale() == Locale.GERMAN) {
            this.view.setLanguageSwitchText(resourceBundle.getString("languageSwitchDE"));
        } else {
            this.view.setLanguageSwitchText(resourceBundle.getString("languageSwitchEN"));
        }

    }

    public void initListener() {
        this.view.setOnClickFinder(()->parent.loadFinder());

        //implementation for founding needs to be implemented
        this.view.setOnClickNewFounding(this::doNothing);
        this.view.setOnClickCurrentFoundings(this::doNothing);
        this.view.setOnClickFinishedFoundings(this::doNothing);

        this.view.setOnLanguageSwitch(this::switchLocale);
    }

    public void switchLocale() {
        this.parent.switchLocale();
    }

    public void doNothing() {

    }
}
