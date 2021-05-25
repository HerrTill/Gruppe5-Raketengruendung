package Raketengruendung.Login;

import Raketengruendung.Master.Master;
import Raketengruendung.Master.MasterController;
import Raketengruendung.Master.MasterModel;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    @Test
    public void testGetLocale() {
        Master view = new Master("Title");
        MasterModel model = new MasterModel();
        MasterController masterController = new MasterController(model, view);

        Login login = new Login();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(masterController, loginModel, login);

        assertEquals(Locale.US, loginController.getLocale());
    }


    @Test
    public void testSwitchLocale() {
        Master view = new Master("Title");
        MasterModel model = new MasterModel();
        MasterController masterController = new MasterController(model, view);

        Login login = new Login();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(masterController, loginModel, login);

        masterController.switchLocale();

        assertEquals(Locale.GERMAN, loginController.getLocale());
    }

}