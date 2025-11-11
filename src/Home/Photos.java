package Home;

import javax.swing.*;
import java.awt.*;

public class Photos {
    public Photos(JFrame frame){

        // University Logo
        ImageIcon icon1 = new ImageIcon("image/Logo.png");
        Image image1 = icon1.getImage();
        Image newImage1 = image1.getScaledInstance(1000, 213, Image.SCALE_SMOOTH);
        JLabel p1 = new JLabel(new ImageIcon(newImage1));
        p1.setBounds(0, 0, 1000, 213);
        frame.add(p1);

        // Founder image
        ImageIcon icon2 = new ImageIcon("image/Chairman.png");
        Image image2 = icon2.getImage();
        Image newImage2 = image2.getScaledInstance(125, 150, Image.SCALE_SMOOTH);
        JLabel p2 = new JLabel(new ImageIcon(newImage2));
        p2.setBounds(20, 400, 125, 150);
        p2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(p2);

        // New Chairman image
        ImageIcon icon3 = new ImageIcon("image/NewChairman.jpg");
        Image image3 = icon3.getImage();
        Image newImage3 = image3.getScaledInstance(125, 150, Image.SCALE_SMOOTH);
        JLabel p3 = new JLabel(new ImageIcon(newImage3));
        p3.setBounds(535, 400, 125, 150);
        p3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(p3);



    }
}
