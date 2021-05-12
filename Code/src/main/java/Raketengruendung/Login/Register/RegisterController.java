package Raketengruendung.Login.Register;

import Raketengruendung.Login.LoginController;

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
        initListener();
        resourceBundle  = ResourceBundle.getBundle("REGISTER/REGISTER", parent.getMasterController().getLocale());
        setText();
    }

    public void initListener() {
        view.setOnRegister(this::loadHomescreen);
    }

    public void loadHomescreen() {
        parent.loadHomescreen();
    }

    public void setText() {
        view.setTitleText(resourceBundle.getString("register"));
        view.setEMailText(resourceBundle.getString("email"));
        view.setUsernameText(resourceBundle.getString("username"));
        view.setPasswordText(resourceBundle.getString("password"));
        view.setPasswordReppText(resourceBundle.getString("password"));
        view.setRegisterText(resourceBundle.getString("register"));
    }
}
