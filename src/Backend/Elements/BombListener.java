package Backend.Elements;

import Backend.Clear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BombListener implements ActionListener {
    JFrame frame;
    Bomb bomb;
    int x, y;
    static int count = 0;

    public BombListener(JFrame frame, Bomb bomb, int x, int y){
        this.frame = frame;
        this.bomb = bomb;
        this.x = x;
        this.y = y;
    }

    @Override
    public void actionPerformed(ActionEvent click) {
        /*
        after click, the button is removed and the number is showed
         */
        if (bomb.closeBombs > 0) {
            //Show the number just if it´s different from 0
            Clear.clearOne(frame, bomb, x, y);
        }else {
                Clear.clearSequence(frame, bomb);
        }
        frame.repaint();

        if (bomb.isExplosive){
            //LOSE
        }
    }
}
class blinkNeighbors{
    //test neighbors
    public void blink(Bomb bomb){
        for (int i=0; i<=bomb.neighbors.size(); i++){
            try {
                bomb.neighbors.get(i).setBackground(Color.BLUE);
            }catch (Exception e){
                break;
            }
        }}
}
