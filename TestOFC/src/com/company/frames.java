package com.company;
import javax.swing.*;
import java.awt.*;

public class frames {

    static JFrame getFrame() {
        JFrame Jframe = new JFrame() {};
        Jframe.setVisible(true);
        Jframe.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Jframe.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        return Jframe;

    }
}


