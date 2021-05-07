package Raketengruendung.Rechtsformenfinder.Fragen;


import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.Rechstform.RechstformController;
import Raketengruendung.Rechtsformenfinder.Rechstform.RechtsformModel;
import Raketengruendung.Rechtsformenfinder.Rechstform.RechtsformView;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FragenController {
    private ArrayList<Frage> previous_Questions = new ArrayList<>();
    private FragenModel model;
    private FragenView view;
    private FinderController finderController;
    private RechtsformView rechtsform;

    public FragenController(FinderController parent, FragenModel model, FragenView view) {
        this.finderController = parent;
        this.model = model;
        this.view = view;
        addPrevious_Questions(model.getFirstQuestion());
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
        if (previous_Questions.get(previous_Questions.size() - 1) == model.getFirstQuestion()) {
            finderController.getMasterController().loadFinder();
        } else {
            Frage f = previous_Questions.get(previous_Questions.size()-2);
            loadQuestion(f);
        }
    }

    public void loadHomescreen() {
        finderController.getMasterController().loadHomescreen();
    }

    public void loadQuestion(Frage frage) {
        view.setText(frage);
        initListener();
    }

    public void nextQuestion(Frage frage){
        addPrevious_Questions(frage);
        System.out.println("Nächste Frage:"+ frage.getQuestion());
        if (frage.getChildren()[0] == null){
            System.out.println("Ist Rechtsform");
            loadRechtsform(frage.question);
        } else {
            loadQuestion(frage);
        }

    }

    public void loadRechtsform(String rechtsform) {
        System.out.println("Rechtsform = " +rechtsform);
        RechtsformModel model = new RechtsformModel(rechtsform);
        RechtsformView view = new RechtsformView();
        RechstformController controller = new RechstformController(this, model, view);
        finderController.getMasterController().changePanel(view);
    }

    public ArrayList<Frage> getPrevious_Questions() {
        return previous_Questions;
    }

    public void addPrevious_Questions(Frage frage) {
        this.previous_Questions.add(frage);
    }
}
