package at.ac.fhcampuswien;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//serial//

public class Board extends JFrame{

    private List<Card> cards;
    private Card selectedCard;
    private Card c1;
    private Card c2;
    private Timer t;

    public Board(){
        int pairs = 10;
        List<Card> cardsList = new ArrayList<Card>();
        List<Boolean> cardVals = new ArrayList<Boolean>();

        for (int i = 0; i < pairs; i++){
            boolean b = false;
            b = cardVals.add(b);
            cardVals.add(b);
        }
        Collections.shuffle(cardVals);

        for (boolean val : cardVals){
            Card c = new Card();
            c.setId(val);
            c.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    selectedCard = c;
                    doTurn();
                }
            });
            cardsList.add(c);
        }
        this.cards = cardsList;

        t = new Timer(750, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                checkCards();
            }
        });

        t.setRepeats(false);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 5));
        for (Card c : cards){
            pane.add(c);
        }
        setTitle("Memory Game");
    }


    public void doTurn(){

        if (c1 == null && c2 == null){

            String player1 = JOptionPane.showInputDialog(this, "Your Player Name, Player 1: ", "Choose your Name", 0);
            String player2 = JOptionPane.showInputDialog(this, "Your Player Name, Player 2: ", "Choose your Name", 0);
            JOptionPane.showMessageDialog(this, player1 + "s Turn" );
            JOptionPane.showMessageDialog(this, player2 + "s Turn" );

            c1 = selectedCard;
            c1.setText(String.valueOf(c1.getId()));
        }

        if (c1 != null && c1 != selectedCard && c2 == null){
            c2 = selectedCard;
            c2.setText(String.valueOf(c2.getId()));
            t.start();

        }
    }

    public void checkCards(){
        if (c1.getId() == c2.getId()){
            c1.setEnabled(false);
            c2.setEnabled(false);
            c1.setMatched(true);
            c2.setMatched(true);
            if (this.isGameWon()){
                JOptionPane.showMessageDialog(this, "You win!");
                System.exit(0);
            }
        }

        else{
            c1.setText("");
            c2.setText("");
        }
        c1 = null;
        c2 = null;
    }

    public boolean isGameWon(){
        for(Card c: this.cards){
            if (c.getMatched() == false){
                return false;
            }
        }
        return true;
    }

}