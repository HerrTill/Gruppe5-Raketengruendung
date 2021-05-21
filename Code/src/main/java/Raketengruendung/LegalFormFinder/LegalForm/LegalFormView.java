package Raketengruendung.LegalFormFinder.LegalForm;
public interface LegalFormView {
    interface onClickBack {
        void execute();
    }

    void setOnClickBack(onClickBack callback);

    void setTitleText(String titleText);
    void setDescriptionText(String descriptionText);
    void setBackText(String backText);

}
