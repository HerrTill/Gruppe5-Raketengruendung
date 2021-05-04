package Raketengruendung.Master;

import Raketengruendung.Homescreen.HomescreenModel;
import Raketengruendung.Login.LoginModel;
import Raketengruendung.Rechtsformenfinder.FinderModel;

public class MasterModel {
    private LoginModel loginModel;
    private HomescreenModel homescreenModel;
    private FinderModel finderModel;

    public MasterModel() {
        homescreenModel = new HomescreenModel();
        finderModel = FinderModel.factory();
        loginModel = new LoginModel();
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public FinderModel getFinderModel() {
        return finderModel;
    }

    public HomescreenModel getHomescreenModel() {
        return homescreenModel;
    }
}
