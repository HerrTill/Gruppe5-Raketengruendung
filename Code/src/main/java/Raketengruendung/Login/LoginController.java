package Raketengruendung.Login;


import Raketengruendung.Login.Register.RegisterController;
import Raketengruendung.Login.Register.RegisterModel;
import Raketengruendung.Login.Register.RegisterView;
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
        loginView.getLoginButton().addActionListener(e->loginto());
        loginView.getRegisterButton().addActionListener(e->register());
        // register button implementation
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

}