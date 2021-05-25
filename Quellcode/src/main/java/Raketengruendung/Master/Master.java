package Raketengruendung.Master;

import javax.swing.*;
import java.awt.*;

public class Master implements MasterView{

    private JFrame frame;
    private JPanel panel;

    public Master(String title) {
        this.frame = new JFrame(title);
        this.frame.getContentPane().setLayout(new BorderLayout());
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setBounds(450, 190, 1014, 597);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    @Override
    public void setTitle(String title) {
        this.frame.setTitle(title);
    }

    @Override
    public void setResizable(Boolean resizable) {
        this.frame.setResizable(resizable);
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        this.frame.setBounds(i,i1,i2,i3);
    }

    @Override
    public boolean isPanelNull() {
        return this.panel == null;
    }

    @Override
    public void remove(JPanel panel) {
        this.frame.remove(panel);
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void add(JPanel panel) {
        this.frame.add(panel);
    }

}
