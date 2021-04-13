package main.V.Listener;

import main.V.Screens.Finder.ViewFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onStartClick implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ViewFinder.start();
    }
}
