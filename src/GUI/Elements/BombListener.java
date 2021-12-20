package GUI.Elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BombListener implements ActionListener {

    JFrame frame;
    Bomb bomb;

    public BombListener(JFrame frame, Bomb bomb){
        this.frame = frame;
        this.bomb = bomb;
    }

    @Override
    public void actionPerformed(ActionEvent click) {
        frame.remove(bomb);
        if (bomb.isExplosive)System.out.println("PERDEU");
        new blinkNeighbors().blink(bomb);
    }
}
class blinkNeighbors{
    public void blink(Bomb bomb){
        for (int i=0; i<=bomb.neighbors.size(); i++){
            try {
                bomb.neighbors.get(i).setBackground(Color.BLUE);
            }catch (Exception e){
                break;
            }
        }}
}
