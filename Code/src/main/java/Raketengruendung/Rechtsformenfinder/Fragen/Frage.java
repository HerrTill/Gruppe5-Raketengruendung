package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Exceptions.TooManyChildrenException;

public class Frage {
    public Frage[] children = new Frage[3];
    public String Frage;

    public String Antwort_1;

    public Frage (String frage, String antwort_1) {
        this.Antwort_1 = antwort_1;
        this.Frage = frage;
    }

    public String getAnswer() {
        return Antwort_1;
    }
    public String getQuestion() {
        return Frage;
    }

    public void addChild(Frage child) throws TooManyChildrenException {
        if (this.children[0] == null){
            this.children[0] = child;

        } else if (this.children[1] == null) {
            this.children[1] = child;
        }else if (this.children[2] == null) {
            this.children[2] = child;
        } else {
            throw new TooManyChildrenException("Too many Children added");
        }
        //child.setParent(this);
    }
}
