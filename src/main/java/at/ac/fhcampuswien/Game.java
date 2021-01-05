package at.ac.fhcampuswien;

import java.awt.Dimension;
import javax.swing.JFrame;


class Main {
    public static void main(String[] args){
        Board b = new Board();
        b.setPreferredSize(new Dimension(500,500));
        b.setLocation(500, 250);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.pack();
        b.setVisible(true);
    }
}