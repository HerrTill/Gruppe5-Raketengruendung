package de.RaketenStart.V.Screens.Finder;

import de.RaketenStart.Controller;
import de.RaketenStart.M.Finder.ModelFrage1;

public class ViewFrage1 extends ViewFrage {
    public ViewFrage1() {
        ModelFrage1 frage = Controller.getModel().getFinder().getFrage1();

        setFrage(frage.Frage());
        setAntwort1(frage.Antwort_1());
        setAntwort2(frage.Antwort_2());
        setAntwort3(frage.Antwort_3());
        setAntwort4(frage.Antwort_4());
    }

}
