package Raketengruendung.Login;


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
        resourceBundle = ResourceBundle.getBundle("LOGIN", parent.getLocale());
        setText();
    }

    public void setText() {
        loginView.getTitle().setText(resourceBundle.getString("login"));
        loginView.getLblUsername().setText(resourceBundle.getString("username"));
        loginView.getLblPassword().setText(resourceBundle.getString("password"));
        loginView.getLoginButton().setText(resourceBundle.getString("login"));
        loginView.getRegisterButton().setText(resourceBundle.getString("register"));
    }

    public void initListener() {
        loginView.getLoginButton().addActionListener(e->loginto());
        loginView.getRegisterButton().addActionListener(e->register());
    }

    public void loginto() {
        // compare entered data with database missing
        parent.loadHomescreen();
    }

    public void register() {
        RegisterModel model = new RegisterModel();
        RegisterView view = new RegisterView();
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