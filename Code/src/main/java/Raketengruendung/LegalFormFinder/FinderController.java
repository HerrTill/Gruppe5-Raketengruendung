package Raketengruendung.LegalFormFinder;

import Raketengruendung.Master.MasterController;
import Raketengruendung.LegalFormFinder.Questions.QuestionsPanel;
import Raketengruendung.LegalFormFinder.Questions.QuestionController;
import Raketengruendung.LegalFormFinder.Questions.QuestionModel;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class FinderController {
    private FinderModel model;
    private FinderView view;
    private MasterController parent;

    private ResourceBundle resourceBundle;

    public FinderController(MasterController parent, FinderModel model, FinderView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;

        this.resourceBundle  = ResourceBundle.getBundle("FINDER/FINDER", getLocale());

        this.initListener();
        this.setText();
    }

    public void setText() {
        this.view.setMainmenuText(resourceBundle.getString("mainMenu"));
        this.view.setTitleText(resourceBundle.getString("welcome"));
        this.view.setStartText(resourceBundle.getString("start"));
        this.view.setPictureNotFoundText(resourceBundle.getString("pictureNotFound"));
    }

    public void initListener() {
        this.view.setOnClickMainmenu(this::loadHomescreen);
        this.view.setOnClickStart(this::startFinder);
    }

    public void startFinder() {
        QuestionModel fragenModel = new QuestionModel();
        QuestionsPanel fragenView = new QuestionsPanel();
        QuestionController fragenController = new QuestionController(this, fragenModel, fragenView);

        this.parent.changePanel(fragenView);
    }

    public void loadHomescreen() {
        this.parent.loadHomescreen();
    }


    public Locale getLocale() {
        return this.parent.getLocale();
    }

    public void changePanel(JPanel panel) {
        this.parent.changePanel(panel);
    }

    public void loadFinder() {
        this.parent.loadFinder();
    }

}
