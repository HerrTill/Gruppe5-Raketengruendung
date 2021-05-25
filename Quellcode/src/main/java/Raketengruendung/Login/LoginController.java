package Raketengruendung.Login;


import Raketengruendung.Login.Register.Register;
import Raketengruendung.Login.Register.RegisterController;
import Raketengruendung.Login.Register.RegisterModel;
import Raketengruendung.Master.MasterController;

import java.util.Locale;
import java.util.ResourceBundle;

public class LoginController {

    private MasterController parent;
    private LoginView view;
    private LoginModel model;

    private ResourceBundle resourceBundle;


    public LoginController(MasterController parent, LoginModel loginModel, LoginView loginView) {
        this.parent = parent;
        this.model = loginModel;
        this.view = loginView;

        this.resourceBundle = ResourceBundle.getBundle("LOGIN/LOGIN", this.getLocale());

        this.initListener();
        this.setText();
    }

    public void setText() {
        this.view.setTitleText(resourceBundle.getString("login"));
        this.view.setUsernameText(resourceBundle.getString("username"));
        this.view.setPasswordText(resourceBundle.getString("password"));
        this.view.setLoginText(resourceBundle.getString("login"));
        this.view.setRegisterText(resourceBundle.getString("register"));
    }

    public void initListener() {
        this.view.setOnLogin(this::loginto);
        this.view.setOnRegister(this::register);
    }

    public void loginto() {
        // compare entered data with database missing
        this.loadHomescreen();
    }

    public void register() {
        RegisterModel model = new RegisterModel();
        Register view = new Register();
        RegisterController controller = new RegisterController(this, view, model);
        parent.changePanel(view);
    }

    public void loadHomescreen() {
        parent.loadHomescreen();
    }

    public MasterController getMasterController() {
        return parent;
    }

    public Locale getLocale() {
        return this.parent.getLocale();
    }
}