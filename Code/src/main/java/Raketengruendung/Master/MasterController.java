package Raketengruendung.Master;

import Raketengruendung.Homescreen.HomescreenController;
import Raketengruendung.Homescreen.HomescreenModel;
import Raketengruendung.Homescreen.HomescreenView;
import Raketengruendung.Login.LoginController;
import Raketengruendung.Login.LoginModel;
import Raketengruendung.Login.LoginView;

import javax.swing.*;

public class MasterController {
    private MasterModel masterModel;
    private MasterView view;

    public MasterController(MasterModel model, MasterView view) {
        this.masterModel = model;
        this.view = view;
        initView();
    }

    public void initView() {
        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(this, loginModel, loginView);
        changePanel(loginView);
    }

    public void loadHomescreen() {
        view.getFrame().setTitle("Raketengründung - Home");
        view.getFrame().setSize(400,300);

        HomescreenModel homescreenModel = new HomescreenModel();
        HomescreenView homescreenView = new HomescreenView();
        HomescreenController homescreenController = new HomescreenController(this, homescreenModel, homescreenView);
        changePanel(homescreenView);
    }
    public void loadFinder() {
        view.getFrame().setTitle("Raketengründung - Finder");
        view.getFrame().setSize(400,300);

        HomescreenModel homescreenModel = new HomescreenModel();
        HomescreenView homescreenView = new HomescreenView();
        HomescreenController homescreenController = new HomescreenController(this, homescreenModel, homescreenView);
        changePanel(homescreenView);
    }

    public void changePanel(JPanel panel) {
        if (view.getPanel() != null) {
            view.getFrame().remove(view.getPanel());
        }
        view.setPanel(panel);
        view.getFrame().add(panel);
        SwingUtilities.updateComponentTreeUI(view.getFrame());
    }



/*    public MasterModel getModel() {
        return masterModel;
    }

    public MasterView getView() {
        return view;
    }*/

   /* public static void loadHomescreen() {
        window = Window.factory();
        window.getContentPane().removeAll();

        window.setTitle("Raketengründung");
        window.setSize(500, 500);

        HomescreenController homescreenController = HomescreenController.factory();
        home = homescreenController.getView();
        window.add(home);

        Window.update();
    }

    public static void loadRechtsformenfinder() {
        window = Window.factory();
        window.remove(home);

        window.setTitle("Raketengründung - Rechtsformenfinder");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);

        finder = FinderView.factory();
        window.add(finder);

        Window.update();
    }

    public static void loadLogin() {
        window = Window.factory();
        window.getContentPane().removeAll();

        window.setTitle("Raketengründung - Login");

        window.setBounds(450, 190, 1014, 597);
        window.setResizable(false);

        LoginController loginController = LoginController.factory();
        login = loginController.getView();
        window.add(login);

        Window.update();
    }*/
}
