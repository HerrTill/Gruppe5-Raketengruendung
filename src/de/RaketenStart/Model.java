package de.RaketenStart;

import de.RaketenStart.M.Finder.ModelFinder;
import de.RaketenStart.M.ModelHome;

public class Model {
    private static Model[] models = new Model[1];
    private ModelHome init;
    private ModelFinder finder;

    public Model() {
        init = new ModelHome();
        finder = new ModelFinder();
    }

    public ModelFinder getFinder() {
        return finder;
    }

    public ModelHome getInit() {
        return init;
    }

    public static Model factory() {
        if (models[0] == null) {
            models[0] = new Model();
        }
        return models[0];
    }
}
