package Raketengruendung.Login.Register;

public interface RegisterView {
    interface onRegister {
        void execute();
    }

    void setOnRegister(onRegister callback);

    void setTitleText(String title);
    void setUsernameText(String username);
    void setPasswordText(String password);
    void setPasswordReppText(String password);
    void setRegisterText(String register);
    void setEMailText(String email);
}
