package Raketengruendung.Login;


import Raketengruendung.Homescreen.HomescreenView;
import Raketengruendung.Master.MasterController;

public class LoginController {
    private MasterController parent;
    private LoginView loginView;
    private LoginModel loginModel;


    public LoginController(MasterController parent, LoginModel loginModel, LoginView loginView) {
        this.parent = parent;
        this.loginModel = loginModel;
        this.loginView = loginView;
        initListener();
    }

    public void initListener() {
        loginView.getBtnNewButton().addActionListener(e->loginto());
        // register button implementation
    }

    public void loginto() {
        // compare entered data with database missing
        parent.loadHomescreen();
    }

}