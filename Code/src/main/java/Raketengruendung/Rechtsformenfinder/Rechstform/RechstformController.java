package Raketengruendung.Rechtsformenfinder.Rechstform;

import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;

import java.util.ResourceBundle;

public class RechstformController {
    private FragenController parent;
    private RechtsformModel model;
    private RechtsformView view;
    private ResourceBundle resourceBundle;

    public RechstformController(FragenController parent, RechtsformModel model, RechtsformView view) {
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
                view.setDescriptionText(resourceBundle.getString("EINZELU_description"));
                break;
            case GMBH:
                view.setTitleText(resourceBundle.getString("GMBH"));
                view.setDescriptionText(resourceBundle.getString("GMBH_description"));
                break;
            case UG:
                view.setTitleText(resourceBundle.getString("UG"));
                view.setDescriptionText(resourceBundle.getString("UG_description"));
                break;
            case KG:
                view.setTitleText(resourceBundle.getString("KG"));
                view.setDescriptionText(resourceBundle.getString("KG_description"));
                break;
            case AG:
                view.setTitleText(resourceBundle.getString("AG"));
                view.setDescriptionText(resourceBundle.getString("AG_description"));
                break;
            case OHG:
                view.setTitleText(resourceBundle.getString("OHG"));
                view.setDescriptionText(resourceBundle.getString("OHG_description"));
                break;
            case PARTG:
                view.setTitleText(resourceBundle.getString("PARTG"));
                view.setDescriptionText(resourceBundle.getString("PARTG_description"));
                break;
            case GBR:
                view.setTitleText(resourceBundle.getString("GBR"));
                view.setDescriptionText(resourceBundle.getString("GBR_description"));
                break;
        }
    }
}
