package Contact;

import Home.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Webmail {
    public Webmail() {
        JFrame frame = new JFrame("Webmail");
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Optional background color
        frame.getContentPane().setBackground(Color.lightGray);

        // Back button
        JButton backBtn = new JButton("Home");
        backBtn.setFont(new Font("Arial", Font.BOLD, 16));
        backBtn.setBounds(895, 720, 80, 35); // bottom-right corner
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(Color.BLACK);
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
