package de.RaketenStart.V.Listener;

import de.RaketenStart.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onFinderClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Controller.getView().finder();
    }
}
