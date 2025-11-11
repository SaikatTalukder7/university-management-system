package Home;

import javax.swing.*;
import java.awt.*;

public class Home {
    public Home() {
        JFrame frame = new JFrame();
        frame.setTitle("Metropolitan University");
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.getContentPane().setBackground(Color.WHITE);

        // Add all Photos for home Page
        Photos ph = new Photos(frame);

        // Add all buttons
        Buttons btn = new Buttons(frame);

        // Add all Labels
        Labels lbl =  new Labels(frame);

        frame.setVisible(true);
    }
}
