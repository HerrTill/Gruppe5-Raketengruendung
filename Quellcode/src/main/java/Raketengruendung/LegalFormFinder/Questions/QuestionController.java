package Raketengruendung.LegalFormFinder.Questions;


import Raketengruendung.LegalFormFinder.FinderController;
import Raketengruendung.LegalFormFinder.LegalForm.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class QuestionController {
    private ArrayList<Question> previous_Questions = new ArrayList<>();
    private ArrayList<Question> answers = new ArrayList<>();
    private QuestionModel model;
    private QuestionView view;
    private FinderController parent;

    private ResourceBundle resourceBundle;

    public QuestionController(FinderController parent, QuestionModel model, QuestionView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;

        this.resourceBundle = ResourceBundle.getBundle("FINDER/FINDER", this.parent.getLocale());

        this.initListener();
        this.setText();

        this.addPrevious_Questions(model.getFirstQuestion());
        this.setQuestion(model.getFirstQuestion());
    }

    public void setText() {
        this.view.setBackText(resourceBundle.getString("back"));
        this.view.setMainmenuText(resourceBundle.getString("mainMenu"));
    }

    public void initListener() {
        this.view.setOnClickMainmenu(this::loadHomescreen);
        this.view.setOnClickBack(this::loadPreviousQuestion);

        this.view.setOnClickAnswerOne(()-> loadNextQuestion(answers.get(0)));
        this.view.setOnClickAnswerTwo(()-> loadNextQuestion(answers.get(1)));
        if (this.answers.size() == 3) {
            this.view.setOnClickAnswerThree(()-> loadNextQuestion(answers.get(2)));
        }
    }

    public void setQuestion(Question question) {
        this.answers.clear();
        this.view.setQuestionText(question.question);
        for (int i = 0; i < question.getChildren().length; i++) {
            if (question.getChildren()[i] != null) {
                this.answers.add(question.getChildren()[i]);
            }
        }
        this.view.setAnswerOneText(answers.get(0).getAnswer());
        this.view.setAnswerTwoText(answers.get(1).getAnswer());
        if (this.answers.size() == 3) {
            this.view.setAnswerThreeText(answers.get(2).getAnswer());
            this.view.setThreeQuestions(true);
        }else{
            this.view.setThreeQuestions(false);
        }
        this.initListener();
    }

    public void loadPreviousQuestion() {
        if (this.previous_Questions.get(this.previous_Questions.size()-1) == this.model.getFirstQuestion()) {
            this.parent.loadFinder();
        } else  {
            this.previous_Questions.remove(this.previous_Questions.size()-1);
            Question f = this.previous_Questions.get(this.previous_Questions.size()-1);
            loadQuestion(f);
        }
    }

    public void loadHomescreen() {
        this.parent.loadHomescreen();
    }

    public void loadQuestion(Question question) {
        this.setQuestion(question);
        this.initListener();
    }

    public void loadNextQuestion(Question question){
        this.addPrevious_Questions(question);
        if (question.getChildren()[0] == null){
            this.loadLegalForm(question.question);
        } else {
            this.loadQuestion(question);
        }

    }

    public void loadLegalForm(String legalFormString) {
        LegalForms legalForm;
        switch (legalFormString) {
            case ("GmbH"):
                legalForm = LegalForms.GMBH;
                break;
            case ("UG"):
                legalForm = LegalForms.UG;
                break;
            case ("KG"):
                legalForm = LegalForms.KG;
                break;
            case ("AG"):
                legalForm = LegalForms.AG;
                break;
            case ("OHG"):
                legalForm = LegalForms.OHG;
                break;
            case ("PartG"):
                legalForm = LegalForms.PARTG;
                break;
            case ("GbR"):
                legalForm = LegalForms.GBR;
                break;
            default:
                legalForm = LegalForms.EINZELU;
        }

        LegalFormModel model = new LegalFormModel(legalForm);
        LegalFormPanel view = new LegalFormPanel();
        LegalFormController controller = new LegalFormController(this, model, view);
        this.parent.changePanel(view);
    }

    public Locale getLocale() {
        return parent.getLocale();
    }

    public void addPrevious_Questions(Question question) {
        this.previous_Questions.add(question);
    }
}
