package de.aimbier;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(String title) {
        super(title);

        setLayout(new BorderLayout());
        Container c = getContentPane();
        JButton btnStart = new JButton("Start");
        c.add(btnStart, BorderLayout.PAGE_START);

        JTextField m1Text = new JTextField("M1");
        m1Text.setPreferredSize(new Dimension(320,150));
        c.add(m1Text, BorderLayout.LINE_START);

        JTextField m2Text = new JTextField("M2");
        m2Text.setPreferredSize(new Dimension(320,150));
        c.add(m2Text, BorderLayout.NORTH);

        JTextField m3Text = new JTextField("M3");
        m3Text.setPreferredSize(new Dimension(320,150));
        c.add(m3Text, BorderLayout.SOUTH);

        JTextField m4Text = new JTextField("M4");
        m4Text.setPreferredSize(new Dimension(320,150));
        c.add(m4Text, BorderLayout.LINE_END);

        JButton btnEnd = new JButton("Quit");
        c.add(btnEnd, BorderLayout.PAGE_END);
    }
}
