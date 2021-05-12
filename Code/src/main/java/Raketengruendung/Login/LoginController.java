package Raketengruendung.Login;


import Raketengruendung.Login.Register.Register;
import Raketengruendung.Login.Register.RegisterController;
import Raketengruendung.Login.Register.RegisterModel;
import Raketengruendung.Login.Register.RegisterView;
import Raketengruendung.Master.MasterController;

import java.util.ResourceBundle;

public class LoginController {

    private MasterController parent;
    private LoginView loginView;
    private LoginModel loginModel;

    private ResourceBundle resourceBundle;


    public LoginController(MasterController parent, LoginModel loginModel, LoginView loginView) {
        this.parent = parent;
        this.loginModel = loginModel;
        this.loginView = loginView;
        initListener();
        resourceBundle = ResourceBundle.getBundle("LOGIN/LOGIN", parent.getLocale());
        setText();
    }

    public void setText() {
        loginView.setTitleText(resourceBundle.getString("login"));
        loginView.setUsernameText(resourceBundle.getString("username"));
        loginView.setPasswordText(resourceBundle.getString("password"));
        loginView.setLoginText(resourceBundle.getString("login"));
        loginView.setRegisterText(resourceBundle.getString("register"));
    }

    public void initListener() {
        loginView.setOnLogin(this::loginto);
        loginView.setOnRegister(this::register);
    }

    public void loginto() {
        // compare entered data with database missing
        parent.loadHomescreen();
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

}