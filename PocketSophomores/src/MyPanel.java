/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel extends JPanel implements MouseListener {




    private int length;
    private int width;


    public MyPanel() {
        super();
        length = 100;
        width = 100;
        addMouseListener(this); 

    }

    public MyPanel(LayoutManager arg0) {
        super(arg0);
    }

    public MyPanel(boolean arg0) {
        super(arg0);
    }

    public MyPanel(LayoutManager arg0, boolean arg1) {
        super(arg0, arg1);
    }

    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.setColor(Color.RED);
//        g.fillOval(10, 10, width, length);
//
//    }

    //@Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getButton() == MouseEvent.BUTTON1) {
        length += 20;
        width += 20;
        repaint();
    }
        else if (e.getButton() == MouseEvent.BUTTON3) {
        length -= 20;
        width -= 20;
        repaint();
    }
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
