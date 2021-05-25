package Raketengruendung;

import Raketengruendung.Master.Master;
import Raketengruendung.Master.MasterController;
import Raketengruendung.Master.MasterModel;
import Raketengruendung.Master.MasterView;

import java.util.ResourceBundle;


public class Main {
    private static ResourceBundle resourceBundle;
    private static MasterModel model;
    private static MasterView view;
    public static void main(String[] args) {
        resourceBundle = ResourceBundle.getBundle("MASTER/MASTER");
        model = new MasterModel();
        view = new Master(resourceBundle.getString("raketengruendung"));
        MasterController masterController= new MasterController(model,view);
    }
}
