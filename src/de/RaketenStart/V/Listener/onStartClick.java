package de.RaketenStart.V.Listener;

import de.RaketenStart.Controller;
import de.RaketenStart.V.Screens.Finder.ViewFinder;
import de.RaketenStart.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onStartClick implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ViewFinder.start();
    }
}
