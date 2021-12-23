package Backend.Elements;

import Backend.Clear;
import GUI.Elements.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BombListener implements MouseListener {

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
    public void mouseClicked(MouseEvent click) {
        /*
            If the right button is clicked, put or remove a bomb checkmark.
            Else If is the left button, show the button content.
            Scroll button does anything
         */
        if (click.getButton() == MouseEvent.BUTTON3) {
            Checkmark.checkmark(bomb);
        } else if (click.getButton() == MouseEvent.BUTTON1){

            if (bomb.closeBombs > 0) {
                //Show the number just if it´s different from 0
                Clear.clearOne(frame, bomb, x, y);
                Bomb.setCountBombsAvoid(Bomb.getCountBombsAvoid() - 1);
            } else {
                //Clear sequential zeros
                Clear.clearSequence(frame, bomb);
            }
            frame.repaint();


            if (bomb.isExplosive) {
                //LOSE
                Result.lose();
            }else if (Bomb.getCountBombsAvoid() <= 20){
                //WIN
                //All fields checked, except the explosive ones
                Result.victory();
            }
        }
   }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
class Checkmark{
    //put or remove checkmarks
    public static void checkmark(Bomb bomb) {
        if (bomb.getBackground() == Color.RED)bomb.setBackground(Color.getColor("238,238,238"));
        else bomb.setBackground(Color.RED);
    }
}
