package Useless;

import Home.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error {
    public Error() {
        JFrame frame = new JFrame("Page Not Found");
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);

        ImageIcon icon11 = new ImageIcon("image/Error.png");
        Image image11 = icon11.getImage();
        Image newImage11 = image11.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        JLabel p11 = new JLabel(new ImageIcon(newImage11));
        p11.setBounds(0, 0, 1000, 800);
        p11.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(p11);


        // Back button
        JButton backBtn = new JButton("Home");
        backBtn.setFont(new Font("Arial", Font.BOLD, 16));
        backBtn.setBounds(895, 720, 80, 35);
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(Color.BLACK);
        backBtn.setFocusPainted(false);
        frame.add(backBtn);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Home();
            }
        });
        frame.setVisible(true);
    }
}
