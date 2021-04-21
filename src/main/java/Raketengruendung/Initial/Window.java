package Raketengruendung.Initial;

import javax.swing.*;

public class Window extends JFrame {
    private static Window[] screens = new Window[1];

    public Window() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static Window factory() {
        if (screens[0] == null) {
            screens[0] = new Window();
        }
        return screens[0];
    }
    public static void update(){
        screens[0].setVisible(true);
        System.out.println("done");
    }
}
