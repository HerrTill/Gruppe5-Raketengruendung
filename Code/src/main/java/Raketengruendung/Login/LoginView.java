package Raketengruendung.Login;

public interface LoginView {

    interface onRegister {
        void execute();
    }
    interface onLogin {
        void execute();
    }

    void setTitleText(String title);
    void setUsernameText(String username);
    void setPasswordText(String password);
    void setRegisterText(String register);
    void setLoginText(String login);

    void setOnLogin(onLogin callback);
    void setOnRegister(onRegister callback);

}
