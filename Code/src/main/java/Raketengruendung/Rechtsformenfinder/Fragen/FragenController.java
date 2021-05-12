package Raketengruendung.Rechtsformenfinder.Fragen;


import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.Rechstform.RechstformController;
import Raketengruendung.Rechtsformenfinder.Rechstform.Rechtsform;
import Raketengruendung.Rechtsformenfinder.Rechstform.RechtsformModel;
import Raketengruendung.Rechtsformenfinder.Rechstform.RechtsformView;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class FragenController {
    private ArrayList<Frage> previous_Questions = new ArrayList<>();
    private ArrayList<Frage> answers = new ArrayList<>();
    private FragenModel model;
    private FragenView view;
    private FinderController finderController;

    private ResourceBundle resourceBundle;

    public FragenController(FinderController parent, FragenModel model, FragenView view) {
        this.finderController = parent;
        this.model = model;
        this.view = view;
        addPrevious_Questions(model.getFirstQuestion());
        this.setQuestion(model.getFirstQuestion());
        initListener();
        resourceBundle = ResourceBundle.getBundle("FINDER", finderController.getMasterController().getLocale());
        setText();
    }

    public void setText() {
        view.setBackText(resourceBundle.getString("back"));
        view.setMainmenuText(resourceBundle.getString("mainMenu"));
    }

    public void initListener() {
        view.setOnClickMainmenu(this::loadHomescreen);
        view.setOnClickBack(this::lastQuestion);

        view.setOnClickAnswerOne(()->nextQuestion(answers.get(0)));
        view.setOnClickAnswerTwo(()->nextQuestion(answers.get(1)));
        if (answers.size() == 3) {
            view.setOnClickAnswerThree(()->nextQuestion(answers.get(2)));
        }
    }

    public void setQuestion(Frage frage) {
        answers.clear();
        view.setQuestionText(frage.question);
        for (int i = 0; i < frage.getChildren().length; i++) {
            if (frage.getChildren()[i] != null) {
                answers.add(frage.getChildren()[i]);
            }
        }
       view.setAnswerOneText(answers.get(0).getAnswer());
       view.setAnswerTwoText(answers.get(1).getAnswer());
        if (answers.size() == 3) {
            view.setAnswerThreeText(answers.get(2).getAnswer());
            view.setThreeQuestions(true);
        }else{
            view.setThreeQuestions(false);
        }
        initListener();
    }

    public void lastQuestion() {
        if (previous_Questions.get(previous_Questions.size()-1) == model.getFirstQuestion()) {
            finderController.getMasterController().loadFinder();
        } else  {
            previous_Questions.remove(previous_Questions.size()-1);
            Frage f = previous_Questions.get(previous_Questions.size()-1);
            loadQuestion(f);
        }
    }

    public void loadHomescreen() {
        finderController.getMasterController().loadHomescreen();
    }

    public void loadQuestion(Frage frage) {
        this.setQuestion(frage);
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
        Rechtsform view = new Rechtsform();
        RechstformController controller = new RechstformController(this, model, view);
        finderController.getMasterController().changePanel(view);
    }

    public Locale getLocale() {
        return finderController.getMasterController().getLocale();
    }

    public void addPrevious_Questions(Frage frage) {
        this.previous_Questions.add(frage);
    }
}
