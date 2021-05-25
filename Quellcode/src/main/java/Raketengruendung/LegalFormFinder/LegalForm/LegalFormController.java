package Raketengruendung.LegalFormFinder.LegalForm;

import Raketengruendung.LegalFormFinder.Questions.QuestionController;

import java.util.ResourceBundle;

public class LegalFormController {
    private QuestionController parent;
    private LegalFormModel model;
    private LegalFormView view;
    private ResourceBundle resourceBundle;

    public LegalFormController(QuestionController parent, LegalFormModel model, LegalFormView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;
        initListener();
        resourceBundle = ResourceBundle.getBundle("LegalForm/LegalForm", parent.getLocale());
        setText();
    }

    public void initListener() {
        view.setOnClickBack(this::loadHomescreen);
    }

    public void loadHomescreen() {
        parent.loadHomescreen();
    }

    public void setText() {
        view.setBackText(resourceBundle.getString("back"));
        switch (model.getRechtsform()) {
            case EINZELU:
                view.setTitleText(resourceBundle.getString("EINZELU"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("EINZELU_description") + "</div></html>");
                break;
            case GMBH:
                view.setTitleText(resourceBundle.getString("GMBH"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("GMBH_description") + "</div></html>");
                break;
            case UG:
                view.setTitleText(resourceBundle.getString("UG"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("UG_description") + "</div></html>");
                break;
            case KG:
                view.setTitleText(resourceBundle.getString("KG"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("KG_description") + "</div></html>");
                break;
            case AG:
                view.setTitleText(resourceBundle.getString("AG"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("AG_description") + "</div></html>");
                break;
            case OHG:
                view.setTitleText(resourceBundle.getString("OHG"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("OHG_description") + "</div></html>");
                break;
            case PARTG:
                view.setTitleText(resourceBundle.getString("PARTG"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("PARTG_description") + "</div></html>");
                break;
            case GBR:
                view.setTitleText(resourceBundle.getString("GBR"));
                view.setDescriptionText("<html><div style='text-align: center;'>" + resourceBundle.getString("GBR_description") + "</div></html>");
                break;
        }
    }
}
