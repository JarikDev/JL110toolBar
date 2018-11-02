package com;

import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JToolBar jToolBar = new JToolBar("Title");
        JButton jButton1 = new JButton("One");
        jButton1.setToolTipText("First");
        jToolBar.add(jButton1);
        jToolBar.add(new JButton("Two"));
        jToolBar.addSeparator();
        jToolBar.add(new JButton("Three"));
        jPanel.add(jToolBar);


    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
