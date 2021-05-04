package Raketengruendung;

import Raketengruendung.Master.MasterController;
import Raketengruendung.Master.MasterModel;
import Raketengruendung.Master.MasterView;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        MasterModel masterModel = new MasterModel();
        MasterView masterView = new MasterView("Raketengruendung");
        MasterController masterController= new MasterController(masterModel,masterView);
    }
}
