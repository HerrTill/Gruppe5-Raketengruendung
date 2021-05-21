package Raketengruendung;

import Raketengruendung.Master.Master;
import Raketengruendung.Master.MasterController;
import Raketengruendung.Master.MasterModel;
import Raketengruendung.Master.MasterView;

import java.util.ResourceBundle;


public class Main {
    private static ResourceBundle resourceBundle;
    public static void main(String[] args) {
        resourceBundle = ResourceBundle.getBundle("MASTER/MASTER");
        MasterModel masterModel = new MasterModel();
        Master masterView = new Master(resourceBundle.getString("raketengruendung"));
        MasterController masterController= new MasterController(masterModel,masterView);
    }
}
