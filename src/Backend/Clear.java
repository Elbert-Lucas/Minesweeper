package Backend;

import Backend.Elements.Bomb;
import GUI.Elements.SoundEffects;

import javax.swing.*;
import java.awt.*;

public class Clear {
    public static void clearOne(JFrame frame, Bomb bomb, int x, int y){
        /*
            This simple method reveal a number field
         */
        JLabel number = new JLabel();

        bomb.setChecked(true);

        if (bomb.isExplosive()){
            /*
                This if statement set and resize the image of explosive bombs, and call the explosion sound effect.
                The else show the numbers of neighbors.
             */
            ImageIcon bombImage = new ImageIcon("src/GUI/Elements/Media/bomb.png");
            Image resizeImage = bombImage.getImage().getScaledInstance(22,22, Image.SCALE_DEFAULT);
            bombImage = new ImageIcon(resizeImage);

            SoundEffects.explosiion();
            number.setIcon(bombImage);

        }
        else number.setText(String.valueOf(bomb.getCloseBombs()));

        number.setBounds(x + 10, y + 3, 20, 25);

        frame.remove(bomb);
        frame.add(number);
}

    public static void clearSequence(JFrame frame, Bomb bomb) {
        /*
            This recursive method reveal empty fields until find number fields.
            bomb.checked is a variable to prevent useless recursion calls.
         */

        bomb.setChecked(true);
        frame.remove(bomb);

        for (Bomb neighbor : bomb.getNeighbors()) {
            if (!neighbor.isChecked() && neighbor.getCloseBombs() > 0){
                clearOne(frame, neighbor, neighbor.getX(), neighbor.getY());
                Bomb.setCountBombsAvoid(Bomb.getCountBombsAvoid() - 1);
            }
            else if (!neighbor.isChecked()){
                clearSequence(frame, neighbor);
            }
        }
        Bomb.setCountBombsAvoid(Bomb.getCountBombsAvoid() - 1);
    }
}
