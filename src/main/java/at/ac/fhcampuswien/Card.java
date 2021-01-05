package at.ac.fhcampuswien;


import javax.swing.JButton;

@SuppressWarnings("serial")
public class Card extends JButton {
    private boolean id;
    private boolean matched = false;


    public void setId(boolean id){
        this.id = id;
    }

    public boolean getId(){
        return this.id;
    }


    public void setMatched(boolean matched){
        this.matched = matched;
    }

    public boolean getMatched(){
        return this.matched;
    }

    public void addActionListener() {
    }
}

