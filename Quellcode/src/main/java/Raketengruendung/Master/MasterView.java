package Raketengruendung.Master;

import javax.swing.*;
import java.awt.*;

public interface MasterView {
     JFrame getFrame();
     JPanel getPanel();
//     void setPanel(JPanel panel);

     void setTitle(String title);
     void setResizable(Boolean resizable);
     void setBounds(int i, int i1, int i2, int i3);
     boolean isPanelNull();
     void remove(JPanel panel);
     void setPanel(JPanel panel);
     void add(JPanel panel);
}
