package Raketengruendung.Rechtsformenfinder.Fragen;


import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.RechtsformView;

public class FragenController {
    private FragenModel model;
    private FragenView view;
    private FinderController finderController;
    private RechtsformView rechtsform;

    public FragenController(FinderController parent, FragenModel model, FragenView view) {
        this.finderController = parent;
        this.model = model;
        this.view = view;
        initListener();
    }

    public void initListener() {
        view.setText(model.getFrage());

        Frage[] answers = view.getAnswers();
        view.getAntwort1().addActionListener(e -> nextQuestion(answers[0]));
        view.getAntwort2().addActionListener(e -> nextQuestion(answers[1]));
        if (answers[2] == null) {
            view.getAntwort3().addActionListener(e -> nextQuestion(answers[2]));
        }
    }

    public void nextQuestion(Frage frage){
        System.out.println("Nächste Frage:"+ frage.getQuestion());
        if (frage.children[0] == null){
            System.out.println("Ist Rechtsform");
            loadRechtsform(frage.Frage);
        } else {
            view.setText(frage);
            finderController.getMasterController().changePanel(view);
        }
    }

    public void loadRechtsform(String rechtsform) {
        System.out.println("Rechtsform = " +rechtsform);
        this.rechtsform = new RechtsformView();
        finderController.getMasterController().changePanel(this.rechtsform);
    }
}
