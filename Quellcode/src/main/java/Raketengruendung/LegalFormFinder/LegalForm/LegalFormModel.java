package Raketengruendung.LegalFormFinder.LegalForm;

public class LegalFormModel {
    private LegalForms rechtsform;
    public LegalFormModel(LegalForms rechtsform) {
        this.rechtsform = rechtsform;
    }

    public LegalForms getRechtsform() {
        return rechtsform;
    }
}
