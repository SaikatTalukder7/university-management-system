package LogIn;

import Home.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {
    public LogIn() {
        JFrame frame = new JFrame("Log in Page");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setFont(new Font("Arial", Font.BOLD, 16));
        lblUser.setBounds(550, 300, 100, 30);
        frame.add(lblUser);
        JTextField txtUser = new JTextField();
        txtUser.setBounds(640, 300, 200, 30);
        frame.add(txtUser);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setFont(new Font("Arial", Font.BOLD, 16));
        lblPass.setBounds(550, 350, 100, 30);
        frame.add(lblPass);
        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(640, 350, 200, 30);
        frame.add(txtPass);


        JButton backBtn = new JButton("Home");
        backBtn.setFont(new Font("Arial", Font.BOLD, 20));
        backBtn.setBounds(1400, 700, 120, 35);
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(Color.BLACK);
        backBtn.setFocusPainted(false);
        backBtn.setOpaque(false);
        frame.add(backBtn);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Home();
                frame.dispose();
            }
        });




        // saikat
        JPanel saikatpanel = new JPanel();
        saikatpanel.setLayout(null);
        saikatpanel.setBackground(Color.LIGHT_GRAY);
        saikatpanel.setVisible(false);
        frame.add(saikatpanel);
        ImageIcon icon1 = new ImageIcon("src/Login/Sp/st.png");
        Image image1 = icon1.getImage();
        Image newImage1 = image1.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        JLabel st = new JLabel(new ImageIcon(newImage1));
        st.setBounds(590, 40, 350, 350);
        st.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        frame.add(st);
        saikatpanel.add(st);
        JLabel sl1 = new JLabel("Name: Saikat Talukder",SwingConstants.CENTER);
        sl1.setFont(new Font("Arial", Font.BOLD, 18));
        sl1.setBounds(590, 420, 350, 25);
        saikatpanel.add(sl1);
        JLabel sl2 = new JLabel("ID: 241-115-051",SwingConstants.CENTER);
        sl2.setFont(new Font("Arial", Font.BOLD, 18));
        sl2.setBounds(590, 445, 350, 25);
        saikatpanel.add(sl2);
        JLabel sl3 = new JLabel("Programme: B.Sc. in CSE - 60th",SwingConstants.CENTER);
        sl3.setFont(new Font("Arial", Font.BOLD, 18));
        sl3.setBounds(590, 470, 350, 25);
        saikatpanel.add(sl3);
        JLabel sl4 = new JLabel("Section: B",SwingConstants.CENTER);
        sl4.setFont(new Font("Arial", Font.BOLD, 18));
        sl4.setBounds(590, 495, 350, 25);
        saikatpanel.add(sl4);
        JLabel sl5 = new JLabel("email: saikat60mu@gmail.com",SwingConstants.CENTER);
        sl5.setFont(new Font("Arial", Font.BOLD, 18));
        sl5.setBounds(590, 520, 350, 25);
        saikatpanel.add(sl5);
        JLabel sl6 = new JLabel("Blood Group: B+ve",SwingConstants.CENTER);
        sl6.setFont(new Font("Arial", Font.BOLD, 18));
        sl6.setBounds(590, 545, 350, 25);
        saikatpanel.add(sl6);


        // Ma'am
        JPanel mampanel = new JPanel();
        mampanel.setLayout(null);
        mampanel.setBackground(Color.LIGHT_GRAY);
        mampanel.setVisible(false);
        frame.add(mampanel);
        ImageIcon icon2 = new ImageIcon("src/Academics/All/Cse/cPhoto/c5.png");
        Image image2 = icon2.getImage();
        Image newImage2 = image2.getScaledInstance(350, 381, Image.SCALE_SMOOTH);
        JLabel kka = new JLabel(new ImageIcon(newImage2));
        kka.setBounds(590, 40, 350, 381);
        kka.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        frame.add(kka);
        mampanel.add(kka);
        JLabel mm1 = new JLabel("Name: Khudeja Khanom Anwara",SwingConstants.CENTER);
        mm1.setFont(new Font("Arial", Font.BOLD, 18));
        mm1.setBounds(590, 451, 350, 25);
        mampanel.add(mm1);
        JLabel mm2 = new JLabel("Lecturer",SwingConstants.CENTER);
        mm2.setFont(new Font("Arial", Font.BOLD, 18));
        mm2.setBounds(590, 476, 350, 25);
        mampanel.add(mm2);
        JLabel mm3 = new JLabel("Department of CSE",SwingConstants.CENTER);
        mm3.setFont(new Font("Arial", Font.BOLD, 18));
        mm3.setBounds(590, 501, 350, 25);
        mampanel.add(mm3);
        JLabel mm4 = new JLabel("email: anwara@metrouni.edu.bd",SwingConstants.CENTER);
        mm4.setFont(new Font("Arial", Font.BOLD, 18));
        mm4.setBounds(590, 526, 350, 25);
        mampanel.add(mm4);
        JLabel mm5 = new JLabel("Blood Group: Unknown",SwingConstants.CENTER);
        mm5.setFont(new Font("Arial", Font.BOLD, 18));
        mm5.setBounds(590, 551, 350, 25);
        mampanel.add(mm5);




        JPanel pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBounds(50, 230, 1290, 800);
        pnl1.setOpaque(false);
        pnl1.setVisible(false);
        frame.add(pnl1);

        ImageIcon i1 = new ImageIcon("src/Login/Sp/st.png");
        Image im1 = i1.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        JLabel lbl1 = new JLabel(new ImageIcon(im1));
        lbl1.setBounds(30, 20, 180, 180);
        lbl1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl1);
        JLabel lbl2 = new JLabel("Saikat Talukder", SwingConstants.CENTER);
        lbl2.setBounds(30, 205, 180, 18);
        lbl2.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl1.add(lbl2);
        JLabel lbl3 = new JLabel("ID: 241-115-051", SwingConstants.CENTER);
        lbl3.setBounds(30, 223, 180, 18);
        lbl3.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl1.add(lbl3);


        ImageIcon i2 = new ImageIcon("src/Academics/All/Cse/cPhoto/c2.png");
        Image im2 = i2.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl4 = new JLabel(new ImageIcon(im2));
        lbl4.setBounds(280, 20, 150, 180);
        lbl4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl4);
        JLabel lbl5 = new JLabel("Md. Mushtaq Shahriyar Rafee", SwingConstants.CENTER);
        lbl5.setBounds(260, 210, 200, 20);
        lbl5.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl5);
        JLabel lbl6 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl6.setBounds(260, 230, 200, 20);
        lbl6.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl6);

        ImageIcon i3 = new ImageIcon("src/Academics/All/Cse/cPhoto/c3.jpg");
        Image im3 = i3.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl7 = new JLabel(new ImageIcon(im3));
        lbl7.setBounds(530, 20, 150, 180);
        lbl7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl7);
        JLabel lbl8 = new JLabel("Archi Arani Basak", SwingConstants.CENTER);
        lbl8.setBounds(490, 210, 230, 20);
        lbl8.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl8);
        JLabel lbl9 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl9.setBounds(510, 230, 200, 20);
        lbl9.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl9);

        ImageIcon i4 = new ImageIcon("src/Academics/All/Cse/cPhoto/c4.jpg");
        Image im4 = i4.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl10 = new JLabel(new ImageIcon(im4));
        lbl10.setBounds(800, 20, 150, 180);
        lbl10.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl10);
        JLabel lbl11 = new JLabel("Abu Jafar Md Jakaria", SwingConstants.CENTER);
        lbl11.setBounds(780, 210, 200, 20);
        lbl11.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl11);
        JLabel lbl12 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl12.setBounds(770, 230, 230, 20);
        lbl12.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl12);


        ImageIcon i5 = new ImageIcon("src/Academics/All/Cse/cPhoto/c5.png");
        Image im5 = i5.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl13 = new JLabel(new ImageIcon(im5));
        lbl13.setBounds(30, 250, 150, 180);
        lbl13.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl13);
        JLabel lbl14 = new JLabel("Khudeja Khanom Anwara", SwingConstants.CENTER);
        lbl14.setBounds(10, 430, 200, 20);
        lbl14.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl14);
        JLabel lbl15 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl15.setBounds(10, 450, 200, 20);
        lbl15.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl15);

        ImageIcon i6 = new ImageIcon("src/Academics/All/Cse/cPhoto/c6.jpg");
        Image im6 = i6.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl16 = new JLabel(new ImageIcon(im6));
        lbl16.setBounds(280, 250, 150, 180);
        lbl16.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl16);
        JLabel lbl17 = new JLabel("Ruhul Amin", SwingConstants.CENTER);
        lbl17.setBounds(260, 430, 200, 20);
        lbl17.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl17);
        JLabel lbl18 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl18.setBounds(260, 450, 200, 20);
        lbl18.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl18);

        ImageIcon i7 = new ImageIcon("src/Academics/All/Cse/cPhoto/c7.jpg");
        Image im7 = i7.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl19 = new JLabel(new ImageIcon(im7));
        lbl19.setBounds(530, 250, 150, 180);
        lbl19.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl19);
        JLabel lbl20 = new JLabel("Nowshin Sharmin", SwingConstants.CENTER);
        lbl20.setBounds(480, 430, 290, 20);
        lbl20.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl20);
        JLabel lbl21 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl21.setBounds(510, 450, 200, 20);
        lbl21.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl21);

        ImageIcon i8 = new ImageIcon("src/Academics/All/Cse/cPhoto/c8.jpg");
        Image im8 = i8.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl22 = new JLabel(new ImageIcon(im8));
        lbl22.setBounds(800, 250, 150, 180);
        lbl22.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl22);
        JLabel lbl23 = new JLabel("Muhammad Muzammil", SwingConstants.CENTER);
        lbl23.setBounds(780, 430, 200, 20);
        lbl23.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl23);
        JLabel lbl24 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl24.setBounds(770, 450, 230, 20);
        lbl24.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl24);


        ImageIcon i9 = new ImageIcon("src/Academics/All/Cse/cPhoto/c1.jpg");
        Image im9 = i9.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl25 = new JLabel(new ImageIcon(im9));
        lbl25.setBounds(30, 480, 150, 180);
        lbl25.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl25);
        JLabel lbl26 = new JLabel("Md. Mahfujul Hasan", SwingConstants.CENTER);
        lbl26.setBounds(10, 670, 200, 20);
        lbl26.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl26);
        JLabel lbl27 = new JLabel("Associate Professor Head,CSE", SwingConstants.CENTER);
        lbl27.setBounds(10, 690, 200, 20);
        lbl27.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl27);

        ImageIcon i10 = new ImageIcon("src/Academics/All/Cse/cPhoto/c2.png");
        Image im10 = i10.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl28 = new JLabel(new ImageIcon(im10));
        lbl28.setBounds(280, 480, 150, 180);
        lbl28.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl28);
        JLabel lbl29 = new JLabel("Md. Mushtaq Shahriyar Rafee", SwingConstants.CENTER);
        lbl29.setBounds(260, 670, 200, 20);
        lbl29.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl29);
        JLabel lbl30 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl30.setBounds(260, 690, 200, 20);
        lbl30.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl30);

        ImageIcon i11 = new ImageIcon("src/Academics/All/Cse/cPhoto/c3.jpg");
        Image im11 = i11.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl31 = new JLabel(new ImageIcon(im11));
        lbl31.setBounds(530, 480, 150, 180);
        lbl31.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl31);
        JLabel lbl32 = new JLabel("Archi Arani Basak", SwingConstants.CENTER);
        lbl32.setBounds(490, 670, 230, 20);
        lbl32.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl32);
        JLabel lbl33 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl33.setBounds(510, 690, 200, 20);
        lbl33.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl33);

        ImageIcon i12 = new ImageIcon("src/Academics/All/Cse/cPhoto/c4.jpg");
        Image im12 = i12.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl34 = new JLabel(new ImageIcon(im12));
        lbl34.setBounds(800, 480, 150, 180);
        lbl34.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl1.add(lbl34);
        JLabel lbl35 = new JLabel("Abu Jafar Md Jakaria", SwingConstants.CENTER);
        lbl35.setBounds(780, 670, 200, 20);
        lbl35.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl35);
        JLabel lbl36 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl36.setBounds(770, 690, 230, 20);
        lbl36.setFont(new Font("Arial", Font.BOLD, 15));
        pnl1.add(lbl36);












        // LogOut
        JButton logout = new JButton("Log Out");
        logout.setFont(new Font("Arial", Font.BOLD, 20));
        logout.setBounds(1400, 640, 120, 35);
        logout.setBackground(Color.lightGray);
        logout.setForeground(Color.BLACK);
        logout.setFocusPainted(false);
        logout.setOpaque(false);
        logout.setVisible(false);
        frame.add(logout);

        // Login
        JButton loginBtn = new JButton("Login");
        loginBtn.setFont(new Font("Arial", Font.BOLD, 16));
        loginBtn.setBounds(640, 400, 100, 30);
        loginBtn.setBackground(Color.WHITE);
        loginBtn.setForeground(Color.BLACK);
        frame.add(loginBtn);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtUser.getText();
                String password = new String(txtPass.getPassword());

                if (username.equals("saikat") && password.equals("1234")) {
                    logout.setOpaque(true);
                    logout.setVisible(true);

                    lblUser.setVisible(false);
                    txtUser.setVisible(false);
                    lblPass.setVisible(false);
                    txtPass.setVisible(false);
                    loginBtn.setVisible(false);

                    frame.setTitle("Welcome"+" "+username);
                    saikatpanel.setBounds(0, 0, frame.getContentPane().getWidth(), frame.getContentPane().getHeight());
                    saikatpanel.setVisible(true);


                    logout.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            frame.setTitle("Log in Page");
                            lblUser.setVisible(true);
                            txtUser.setVisible(true);
                            lblPass.setVisible(true);
                            txtPass.setVisible(true);

                            txtUser.setText("");
                            txtPass.setText("");

                            saikatpanel.setVisible(false);
                            mampanel.setVisible(false);
                            pnl1.setVisible(false);

                            loginBtn.setVisible(true);
                            logout.setVisible(false);

                        }
                    });
                }
                else if (username.equals("anwara") && password.equals("1234")) {
                    logout.setOpaque(true);
                    logout.setVisible(true);

                    lblUser.setVisible(false);
                    txtUser.setVisible(false);
                    lblPass.setVisible(false);
                    txtPass.setVisible(false);
                    loginBtn.setVisible(false);

                    frame.setTitle("Welcome"+" "+username);
                    mampanel.setBounds(0, 0, frame.getContentPane().getWidth(), frame.getContentPane().getHeight());
                    mampanel.setVisible(true);

                    logout.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            frame.setTitle("Log in Page");
                            lblUser.setVisible(true);
                            txtUser.setVisible(true);
                            lblPass.setVisible(true);
                            txtPass.setVisible(true);

                            txtUser.setText("");
                            txtPass.setText("");

                            saikatpanel.setVisible(false);
                            mampanel.setVisible(false);
                            pnl1.setVisible(false);

                            loginBtn.setVisible(true);
                            logout.setVisible(false);

                        }
                    });
                }
                else if (username.equals("1") && password.equals("1")) {
                    logout.setOpaque(true);
                    logout.setVisible(true);

                    lblUser.setVisible(false);
                    txtUser.setVisible(false);
                    lblPass.setVisible(false);
                    txtPass.setVisible(false);
                    loginBtn.setVisible(false);


                    frame.setTitle("Dashboard of"+" "+username);
                    pnl1.setBounds(0, 0, frame.getContentPane().getWidth(), frame.getContentPane().getHeight());
                    pnl1.setVisible(true);

                    logout.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            frame.setTitle("Log in Page");
                            lblUser.setVisible(true);
                            txtUser.setVisible(true);
                            lblPass.setVisible(true);
                            txtPass.setVisible(true);

                            txtUser.setText("");
                            txtPass.setText("");

                            saikatpanel.setVisible(false);
                            mampanel.setVisible(false);
                            pnl1.setVisible(false);

                            loginBtn.setVisible(true);
                            logout.setVisible(false);

                        }
                    });
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password!");
                }
            }
        });


        frame.setVisible(true);
    }
}
