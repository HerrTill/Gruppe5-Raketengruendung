package Raketengruendung.Rechtsformenfinder.Fragen;


import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.RechtsformView;

import java.awt.event.ActionListener;

public class FragenController {
    private FragenModel model;
    private FragenView view;
    private FinderController finderController;
    private RechtsformView rechtsform;

    public FragenController(FinderController parent, FragenModel model, FragenView view) {
        this.finderController = parent;
        this.model = model;
        this.view = view;
        view.setText(model.getFirstQuestion());
        initListener();
    }

    public void initListener() {
        Frage[] answers = view.getAnswers();
        for (ActionListener al : view.getAntwort1().getActionListeners()) {
            view.getAntwort1().removeActionListener(al);
        }
        for (ActionListener al : view.getAntwort2().getActionListeners()) {
            view.getAntwort2().removeActionListener(al);
        }
        for (ActionListener al : view.getBack().getActionListeners()) {
            view.getAntwort2().removeActionListener(al);
        }
        for (ActionListener al : view.getMainMenu().getActionListeners()) {
            view.getAntwort2().removeActionListener(al);
        }

        view.getBack().addActionListener(e -> lastQuestion());
        view.getMainMenu().addActionListener(e -> loadHomescreen());

        view.getAntwort1().addActionListener(e -> nextQuestion(view.getAnswers()[0]));
        view.getAntwort2().addActionListener(e -> nextQuestion(view.getAnswers()[1]));
        if (answers[2] != null) {
            for (ActionListener al : view.getAntwort2().getActionListeners()) {
                view.getAntwort2().removeActionListener(al);
            }
            view.getAntwort3().addActionListener(e -> nextQuestion(view.getAnswers()[2]));
        }
    }

    public void lastQuestion() {

    }

    public void loadHomescreen() {
        finderController.getMasterController().loadHomescreen();
    }

    public void nextQuestion(Frage frage){
        System.out.println("Nächste Frage:"+ frage.getQuestion());
        if (frage.getChildren()[0] == null){
            System.out.println("Ist Rechtsform");
            loadRechtsform(frage.question);
        } else {

            view.setText(frage);
            initListener();
//            finderController.getMasterController().changePanel(view);
        }

    }

    public void loadRechtsform(String rechtsform) {
        System.out.println("Rechtsform = " +rechtsform);
        this.rechtsform = new RechtsformView(rechtsform);
        finderController.getMasterController().changePanel(this.rechtsform);
    }
}
