package de.RaketenStart;

import de.RaketenStart.V.Screens.Finder.ViewFinder;
import de.RaketenStart.V.Screens.ViewHome;
import de.RaketenStart.V.Screens.Screen;

import javax.swing.*;

public class View {
    private Screen screen;
    private JPanel panel;
    private Model model;

    public View(Model model) {
        this.model = model;
        // initialises JFrame and loads Homescreen JPanel
        screen = Screen.factory();
        panel = ViewHome.factory();
        screen.add(panel);
        screen.setVisible(true);
    }

    public void finder() {
        JPanel finder = ViewFinder.factory();
        screen.setFullscreen();
        screen.setTitle(screen.getTitle() + " - " + model.getInit().but1());
        setPanel(finder);
    }

    public void setPanel(JPanel panel) {
        screen.remove(this.panel);
        this.panel = panel;
        screen.add(this.panel);
        screen.setVisible(true);
    }
}
