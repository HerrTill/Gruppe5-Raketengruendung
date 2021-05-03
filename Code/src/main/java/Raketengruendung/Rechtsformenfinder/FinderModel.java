package Raketengruendung.Rechtsformenfinder;

public class FinderModel {
    private static FinderModel[] models = new FinderModel[1];


    public FinderModel() {

    }


    public static FinderModel factory() {
        if (models[0] == null) {
            models[0] = new FinderModel();
        }
        return models[0];
    }
}
