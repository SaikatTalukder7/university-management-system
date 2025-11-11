package LogIn;

import Home.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {
    public LogIn() {
        JFrame frame = new JFrame("Log in Page");
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);


        // Back button
        JButton backBtn = new JButton("Home");
        backBtn.setFont(new Font("Arial", Font.BOLD, 16));
        backBtn.setBounds(895, 720, 80, 35); // bottom-right corner
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
