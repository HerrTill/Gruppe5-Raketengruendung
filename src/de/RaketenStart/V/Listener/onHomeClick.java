package de.RaketenStart.V.Listener;

import de.RaketenStart.V.Screens.ViewHome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onHomeClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ViewHome.loadHomescreen();
    }
}
