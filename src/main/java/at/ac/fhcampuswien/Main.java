package at.ac.fhcampuswien;

import at.ac.fhcampuswien.Card;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        class Board {
            private ArrayList<Card> cards; // Kartenliste
            private HashSet<Integer> cardCode; // Liste der Karten IDs
            private ArrayList<Card> matchedCards; //Liste der Karten die der/die Spieler/in erkennt
            private Card selectedCard; // ausgewählte Karten
            private Card c1, c2; // Karten, die geöffnet werden
            int pairs = 26;
            int count = 0;

            public Board() {
                cards = new ArrayList<>();
                cardCode = new HashSet<>();
                matchedCards = new ArrayList<>();

                for (int i = 1; i <= 26; i++) {
                    cardCode.add(i);
                }

                for (int code : cardCode) {
                    Card c = new Card();
                    c.setId(code);
                    selectedCard = c;
                    cards.add(c);
                    //doTurn();
                    checkCards();
                }

            }

        }
    }

    private static void checkCards() {
    }
}
