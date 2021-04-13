package main.V.Screens;

import main.Controller;
import main.M.ModelHome;
import main.V.Listener.onFinderClick;

import javax.swing.*;
import java.awt.*;

public class ViewHome extends JPanel {
    private static ViewHome[] screen = new ViewHome[1];

    public ViewHome() {
        ModelHome init = Controller.getModel().getInit();
        JButton but1 = new JButton();
        JButton but2 = new JButton();
        JButton but3 = new JButton();
        but1.setText(init.but1());
        but2.setText(init.but2());
        but3.setText(init.but3());
        but1.addActionListener(new onFinderClick());
        this.setLayout(new GridLayout(3, 1));
        this.add(but1);
        this.add(but2);
        this.add(but3);
    }

    public static ViewHome factory() {
        if (screen[0] == null) {
            screen[0] = new ViewHome();
        }
        return screen[0];
    }

    public static void loadHomescreen() {
        Controller.getView().setPanel(factory());
        Screen.factory().setHomescreen();
    }
}
