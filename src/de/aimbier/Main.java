package de.aimbier;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //InputReader ir = new InputReader();
        //ir.startReader();
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame mainFrame = new MainFrame("SM-Ueberwachung");
            mainFrame.setSize(1280, 720);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
        }
    });

    }
}
