package Home;

import About.About;
import Academics.Academics;
import Admission.Admission;
import CampusLife.CampusLife;
import Contact.Contact;
import Contact.Webmail;
import LogIn.LogIn;
import Programme.Programme;
import Reasearch.Reasearch;
import Useless.Error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {

    public Buttons(JFrame frame) {
        // Home Button
        JButton btnH = new JButton("Home");
        btnH.setFont(new Font("Arial", Font.BOLD, 16));
        btnH.setBounds(890, 20, 80, 25);
        btnH.setForeground(Color.BLACK);
        btnH.setFocusPainted(false);
        btnH.setContentAreaFilled(false);
        btnH.setOpaque(false);
        frame.add(btnH);
        btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Home();
            }
        });

        // WebMail Button
        JButton btnW = new JButton("Webmail");
        btnW.setFont(new Font("Arial", Font.BOLD, 16));
        btnW.setBounds(870, 55, 100, 25);
        btnW.setForeground(Color.BLACK);
        btnW.setFocusPainted(false);
        btnW.setContentAreaFilled(false);
        btnW.setOpaque(false);
        frame.add(btnW);
        btnW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Webmail();
            }
        });

        // About
        JButton btn1 = new JButton("About");
        btn1.setFont(new Font("Arial", Font.BOLD, 16));
        btn1.setBounds(15, 175, 80, 35);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new About();
            }
        });

        // Programmes
        JButton btn2 = new JButton("Programmes");
        btn2.setFont(new Font("Arial", Font.BOLD, 16));
        btn2.setBounds(105, 175, 130, 35);
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.BLACK);
        frame.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Programme();
            }
        });

        // Academics
        JButton btn3 = new JButton("Academics");
        btn3.setFont(new Font("Arial", Font.BOLD, 16));
        btn3.setBounds(245, 175, 125, 35);
        btn3.setBackground(Color.WHITE);
        btn3.setForeground(Color.BLACK);
        frame.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Academics();
            }
        });

        // Admission
        JButton btn4 = new JButton("Admission");
        btn4.setFont(new Font("Arial", Font.BOLD, 16));
        btn4.setBounds(380, 175, 120, 35);
        btn4.setBackground(Color.WHITE);
        btn4.setForeground(Color.BLACK);
        frame.add(btn4);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Admission();
            }
        });

        // Research
        JButton btn5 = new JButton("Research");
        btn5.setFont(new Font("Arial", Font.BOLD, 16));
        btn5.setBounds(510, 175, 115, 35);
        btn5.setBackground(Color.WHITE);
        btn5.setForeground(Color.BLACK);
        frame.add(btn5);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Reasearch();
            }
        });

        // Campus Life
        JButton btn6 = new JButton("Campus Life");
        btn6.setFont(new Font("Arial", Font.BOLD, 16));
        btn6.setBounds(635, 175, 130, 35);
        btn6.setBackground(Color.WHITE);
        btn6.setForeground(Color.BLACK);
        frame.add(btn6);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new CampusLife();
            }
        });

        // Contact
        JButton btn7 = new JButton("Contact");
        btn7.setFont(new Font("Arial", Font.BOLD, 16));
        btn7.setBounds(775, 175, 100, 35);
        btn7.setBackground(Color.WHITE);
        btn7.setForeground(Color.BLACK);
        frame.add(btn7);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Contact();
            }
        });

        // Log in
        JButton btn8 = new JButton("Log in");
        btn8.setFont(new Font("Arial", Font.BOLD, 16));
        btn8.setBounds(885, 175, 85, 35);
        btn8.setBackground(Color.WHITE);
        btn8.setForeground(Color.BLACK);
        frame.add(btn8);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LogIn();
            }
        });


        // Legal
        JButton btn9 = new JButton("Legal");
        btn9.setFont(new Font("Arial", Font.BOLD, 16));
        btn9.setBounds(289, 721, 95, 35);
        btn9.setOpaque(false);
        btn9.setBackground(Color.BLUE);
        btn9.setForeground(Color.WHITE);
        btn9.setFocusPainted(false);
        btn9.setBorderPainted(false);
        frame.add(btn9);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Error();
            }
        });

        // Privacy Policy
        JButton btn10 = new JButton("Privacy Policy");
        btn10.setFont(new Font("Arial", Font.BOLD, 16));
        btn10.setBounds(352, 721, 145, 35);
        btn10.setOpaque(false);
        btn10.setBackground(Color.BLUE);
        btn10.setForeground(Color.WHITE);
        btn10.setFocusPainted(false);
        btn10.setBorderPainted(false);
        frame.add(btn10);
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Error();
            }
        });

        // Cookie Statement
        JButton btn11 = new JButton("Cookie Statement");
        btn11.setFont(new Font("Arial", Font.BOLD, 16));
        btn11.setBounds(479, 721, 170, 35);
        btn11.setOpaque(false);
        btn11.setBackground(Color.BLUE);
        btn11.setForeground(Color.WHITE);
        btn11.setFocusPainted(false);
        btn11.setBorderPainted(false);
        frame.add(btn11);
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Error();
            }
        });

        // Facebook
        JButton btn12 = new JButton("Facebook");
        btn12.setFont(new Font("Arial", Font.BOLD, 16));
        btn12.setBounds(742, 721, 110, 35);
        btn12.setOpaque(false);
        btn12.setBackground(Color.BLUE);
        btn12.setForeground(Color.WHITE);
        btn12.setFocusPainted(false);
        btn12.setBorderPainted(false);
        frame.add(btn12);
        btn12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Error();
            }
        });

        // YouTube
        JButton btn13 = new JButton("YouTube");
        btn13.setFont(new Font("Arial", Font.BOLD, 16));
        btn13.setBounds(832, 721, 110, 35);
        btn13.setOpaque(false);
        btn13.setBackground(Color.BLUE);
        btn13.setForeground(Color.WHITE);
        btn13.setFocusPainted(false);
        btn13.setBorderPainted(false);
        frame.add(btn13);
        btn13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Error();
            }
        });
    }
}
