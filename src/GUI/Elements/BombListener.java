package GUI.Elements;

import javax.swing.*;
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
    }
}
