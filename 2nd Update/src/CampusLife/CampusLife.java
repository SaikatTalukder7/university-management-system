package CampusLife;

import Home.Home;
import SubButtons.SubButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampusLife {
    public CampusLife() {
        JFrame frame = new JFrame("Campus Life");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        SubButtons btn = new SubButtons(frame);

        frame.setVisible(true);
    }
}
