package at.ac.fhcampuswien;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;


class Main {
    public static void main(String[] args){
        Board b = new Board();
        b.setPreferredSize(new Dimension(500,500));
        b.setLocation(500, 250);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setIconImage(Toolkit.getDefaultToolkit()
                .getImage("C:\\Users\\queen\\IdeaProjects\\MemoryGame06" +
                        "\\src\\main\\java\\at\\ac\\fhcampuswien\\CardBack.jpg"));
        b.pack();
        b.setVisible(true);
    }
}