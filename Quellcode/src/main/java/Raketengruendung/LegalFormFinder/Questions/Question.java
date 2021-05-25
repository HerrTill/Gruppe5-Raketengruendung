package Raketengruendung.LegalFormFinder.Questions;

import Raketengruendung.LegalFormFinder.Exceptions.TooManyChildrenException;

public class Question {
    private Question[] children = new Question[3];
    public String question;

    public String answer;

    public Question(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public Question[] getChildren() {
        return children;
    }


    public void addChild(Question child) throws TooManyChildrenException {
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
