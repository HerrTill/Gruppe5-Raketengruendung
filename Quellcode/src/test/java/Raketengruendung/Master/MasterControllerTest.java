package Raketengruendung.Master;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MasterControllerTest {

    @Test
    public void testInitialLocale() {
        Master view = new Master("Title");
        MasterModel model = new MasterModel();
        MasterController masterController = new MasterController(model, view);

        assertEquals(Locale.US, masterController.getLocale());
    }

    @Test
    public void testSwitchLocale(){
        Master view = new Master("Title");
        MasterModel model = new MasterModel();
        MasterController masterController = new MasterController(model, view);

        masterController.switchLocale();

        assertEquals(Locale.GERMAN, masterController.getLocale());
    }

}