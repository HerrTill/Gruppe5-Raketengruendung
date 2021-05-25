package Raketengruendung.Master;

import Raketengruendung.Homescreen.Homescreen;
import Raketengruendung.Homescreen.HomescreenController;
import Raketengruendung.Homescreen.HomescreenModel;
import Raketengruendung.Login.Login;
import Raketengruendung.Login.LoginController;
import Raketengruendung.Login.LoginModel;
import Raketengruendung.LegalFormFinder.Finder;
import Raketengruendung.LegalFormFinder.FinderController;
import Raketengruendung.LegalFormFinder.FinderModel;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class MasterController {

    private MasterModel model;
    private MasterView view;
    private Locale locale= Locale.US;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("MASTER/MASTER", locale);

    public MasterController(MasterModel model, MasterView view) {
        this.model = model;
        this.view = view;
        initView();
    }

    public void initView() {
        view.setTitle(resourceBundle.getString("raketengruendung") + resourceBundle.getString("login"));
        view.setResizable(false);
        view.setBounds(450, 190, 1000, 600);

        //Icon oben links verändern
//        ImageIcon img = new ImageIcon("C:\\Users\\Günter\\Desktop\\Theme.jpg");
//        setIconImage(img.getImage());

        LoginModel loginModel = new LoginModel();
        Login loginView = new Login();
        LoginController loginController = new LoginController(this, loginModel, loginView);
        changePanel(loginView);
    }

    public void loadHomescreen() {
        view.setTitle(resourceBundle.getString("raketengruendung") + resourceBundle.getString("home"));
        view.setResizable(false);

        HomescreenModel homescreenModel = new HomescreenModel();
        Homescreen homescreenView = new Homescreen();
        HomescreenController homescreenController = new HomescreenController(this, homescreenModel, homescreenView);
        changePanel(homescreenView);
    }
    public void loadFinder() {
        view.setTitle(resourceBundle.getString("raketengruendung")+resourceBundle.getString("finder"));
        view.setResizable(false);
//        view.getFrame().setBounds(450, 190, 1000, 600);

        FinderModel finderModel = new FinderModel();
        Finder finderView = new Finder();
        FinderController finderController = new FinderController(this, finderModel, finderView);
        changePanel(finderView);
    }

    public void changePanel(JPanel panel) {
        if (!view.isPanelNull()) {
            view.remove(view.getPanel());
        }
        view.setPanel(panel);
        view.add(panel);
        SwingUtilities.updateComponentTreeUI(view.getFrame());
    }

    public Locale getLocale() {
        return locale;
    }

    public void switchLocale() {
        if (this.locale == Locale.US) {
            this.locale = Locale.GERMAN;
        } else {
            this.locale = Locale.US;
        }
        loadHomescreen();
    }
}
