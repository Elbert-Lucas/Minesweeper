package Backend;

import GUI.Elements.Bomb;

import javax.swing.*;

public class Clear {
    public static void clearOne(JFrame frame, Bomb bomb, int x, int y){
        JLabel number = new JLabel(String.valueOf(bomb.getCloseBombs()));
        number.setBounds(x + 11, y + 3, 20, 25);
        frame.add(number);
    }
}
