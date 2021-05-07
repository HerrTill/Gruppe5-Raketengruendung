package Raketengruendung.Login.Register;

import Raketengruendung.Login.LoginController;

public class RegisterController {
    private LoginController parent;
    private RegisterView view;
    private RegisterModel model;

    public RegisterController(LoginController parent, RegisterView view, RegisterModel model) {
        this.parent = parent;
        this.view = view;
        this.model = model;
    }
}
