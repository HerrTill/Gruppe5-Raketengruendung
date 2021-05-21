package Raketengruendung.Login.Register;

import Raketengruendung.Login.Login;
import Raketengruendung.Login.LoginController;
import Raketengruendung.Login.LoginModel;

import java.util.ResourceBundle;

public class RegisterController {
    private LoginController parent;
    private RegisterView view;
    private RegisterModel model;

    private ResourceBundle resourceBundle;

    public RegisterController(LoginController parent, RegisterView view, RegisterModel model) {
        this.parent = parent;
        this.view = view;
        this.model = model;

        this.resourceBundle  = ResourceBundle.getBundle("REGISTER/REGISTER", parent.getLocale());

        initListener();
        setText();
    }

    public void initListener() {
        this.view.setOnRegister(this::loadLogin);
    }

    public void loadLogin() {
        LoginModel loginModel = new LoginModel();
        Login loginView = new Login();
        LoginController loginController = new LoginController(parent.getMasterController(), loginModel, loginView);
        this.parent.getMasterController().changePanel(loginView);
    }

    public void setText() {
        this.view.setTitleText(resourceBundle.getString("register"));
        this.view.setEMailText(resourceBundle.getString("email"));
        this.view.setUsernameText(resourceBundle.getString("username"));
        this.view.setPasswordText(resourceBundle.getString("password"));
        this.view.setPasswordReppText(resourceBundle.getString("password"));
        this.view.setRegisterText(resourceBundle.getString("register"));
    }
}
