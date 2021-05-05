package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Rechtsformenfinder.Exceptions.TooManyChildrenException;

public class Frage {
    private Frage[] children = new Frage[3];
    public String question;

    public String answer;

    public Frage(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public Frage getChildren1() {
        return children[1];
    }

    public Frage[] getChildren() {
        return children;
    }

    public Frage getChildren2() {
        return children[2];
    }
    public Frage getChildren0() {
        return children[0];
    }


    public void addChild(Frage child) throws TooManyChildrenException {
        if (this.children[0] == null) {
            this.children[0] = child;
        } else if (this.children[1] == null) {
            this.children[1] = child;
        } else if (this.children[2] == null) {
            this.children[2] = child;
        } else {
            throw new TooManyChildrenException("Too many Children added");
        }
    }
}
