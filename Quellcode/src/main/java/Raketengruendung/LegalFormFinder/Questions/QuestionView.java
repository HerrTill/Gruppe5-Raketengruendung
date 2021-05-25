package Raketengruendung.LegalFormFinder.Questions;

public interface QuestionView {
    interface onClickAnswerOne {
        void execute();
    }
    interface onClickAnswerTwo {
        void execute();
    }
    interface onClickAnswerThree {
        void execute();
    }
    interface onClickBack {
        void execute();
    }
    interface onClickMainmenu {
        void execute();
    }

    void setOnClickAnswerOne(onClickAnswerOne callback);
    void setOnClickAnswerTwo(onClickAnswerTwo callback);
    void setOnClickAnswerThree(onClickAnswerThree callback);
    void setOnClickBack(onClickBack callback);
    void setOnClickMainmenu(onClickMainmenu callback);

    void setThreeQuestions(boolean isThereAThirdQuestion);

    void setBackText(String backText);
    void setMainmenuText(String mainmenuText);

    void setQuestionText(String questionText);
    void setAnswerOneText(String answerOneText);
    void setAnswerTwoText(String answerTwoText);
    void setAnswerThreeText(String answerThreeText);

}
