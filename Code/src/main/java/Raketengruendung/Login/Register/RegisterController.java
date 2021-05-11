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
        resourceBundle  = ResourceBundle.getBundle("REGISTER", parent.getMasterController().getLocale());
        setText();
    }

    public void initListener() {
        view.getRegisterButton().addActionListener(e->loadHomescreen());
    }

    public void loadHomescreen() {
        parent.loadHomescreen();
    }

    public void setText() {
        view.getRegisterButton().setText(resourceBundle.getString("register"));
        view.getEmailText().setText(resourceBundle.getString("email"));
        view.getPasswordText2().setText(resourceBundle.getString("password"));
        view.getPasswordText().setText(resourceBundle.getString("password"));
        view.getUserText().setText(resourceBundle.getString("username"));
        view.getTitle().setText(resourceBundle.getString("register"));
    }
}
