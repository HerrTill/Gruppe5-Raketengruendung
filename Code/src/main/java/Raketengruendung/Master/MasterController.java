package Raketengruendung.Master;

import Raketengruendung.Homescreen.HomescreenController;
import Raketengruendung.Homescreen.HomescreenModel;
import Raketengruendung.Homescreen.HomescreenView;
import Raketengruendung.Login.LoginController;
import Raketengruendung.Login.LoginModel;
import Raketengruendung.Login.LoginView;
import Raketengruendung.Rechtsformenfinder.FinderController;
import Raketengruendung.Rechtsformenfinder.FinderModel;
import Raketengruendung.Rechtsformenfinder.FinderView;

import javax.swing.*;
import java.util.ResourceBundle;

public class MasterController {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("MASTER");
    private MasterModel masterModel;
    private MasterView view;

    public MasterController(MasterModel model, MasterView view) {
        this.masterModel = model;
        this.view = view;
        initView();
    }

    public void initView() {
        view.getFrame().setTitle(resourceBundle.getString("raketengruendung") + resourceBundle.getString("login"));

        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(this, loginModel, loginView);
        changePanel(loginView);
    }

    public void loadHomescreen() {
        view.getFrame().setTitle(resourceBundle.getString("raketengruendung") + resourceBundle.getString("home"));
        view.getFrame().setSize(400,300);

        HomescreenModel homescreenModel = new HomescreenModel();
        HomescreenView homescreenView = new HomescreenView();
        HomescreenController homescreenController = new HomescreenController(this, homescreenModel, homescreenView);
        changePanel(homescreenView);
    }
    public void loadFinder() {
        view.getFrame().setTitle(resourceBundle.getString("raketengruendung")+resourceBundle.getString("finder"));
        view.getFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);

        FinderModel finderModel = new FinderModel();
        FinderView finderView = new FinderView();
        FinderController finderController = new FinderController(this, finderModel, finderView);
        changePanel(finderView);
    }

    public void changePanel(JPanel panel) {
        if (view.getPanel() != null) {
            view.getFrame().remove(view.getPanel());
        }
        view.setPanel(panel);
        view.getFrame().add(panel);
        SwingUtilities.updateComponentTreeUI(view.getFrame());
    }
}
