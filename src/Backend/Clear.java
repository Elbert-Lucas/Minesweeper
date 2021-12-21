package Backend;

import Backend.Elements.Bomb;

import javax.swing.*;

public class Clear {
    public static void clearOne(JFrame frame, Bomb bomb, int x, int y){

        JLabel number;

        if (bomb.isExplosive()) number = new JLabel("x");
        else number = new JLabel(String.valueOf(bomb.getCloseBombs()));

        number.setBounds(x + 11, y + 3, 20, 25);

        frame.remove(bomb);

        frame.add(number);

    }

    public static void clearSequence(JFrame frame, Bomb bomb) {
        bomb.setChecked(true);
        frame.remove(bomb);

        for (Bomb neighbor : bomb.getNeighbors()) {
            if (neighbor.getCloseBombs() > 0){
                clearOne(frame, neighbor, neighbor.getX(), neighbor.getY());
            }
            else if (!neighbor.isChecked()){
                clearSequence(frame, neighbor);
            }
        }
    }
}
