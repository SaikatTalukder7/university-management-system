package About;

import Home.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About {
    public About() {
        JFrame frame = new JFrame("About MU");
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Optional background color
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

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
