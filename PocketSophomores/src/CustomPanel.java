import javax.swing.*;
import java.awt.*;

public class CustomPanel {

        public static void main(String[] args) {

            JFrame f = new JFrame();
            f.setSize(1000, 1000);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel p = new MyPanel();

            //f.add(p);
            f.setVisible(true);


            JLabel l=new JLabel(Sophmores.Mike.name);
            l.setFont(new Font("Calibre", Font.ITALIC, 50));
            l.setForeground(Color.BLUE);
            f.add(l);
        }

    }