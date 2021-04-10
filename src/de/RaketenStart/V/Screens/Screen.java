package de.RaketenStart.V.Screens;

import javax.swing.*;

public class Screen extends JFrame {
    private static Screen[] screens = new Screen[1];

    public Screen() {
        setHomescreen();
    }

    public void setFullscreen() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public void setHomescreen() {
        this.setTitle("RaketenStart");
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
    }

    public static Screen factory() {
        if (screens[0] == null) {
            screens[0] = new Screen();
        }
        return screens[0];
    }


}
