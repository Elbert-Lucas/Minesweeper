package GUI.Elements;

import javax.swing.*;

public class Result {
    public static void victory(){
        JOptionPane.showMessageDialog(null,"Parabéns! Você venceu!", "Vitoria!", JOptionPane.PLAIN_MESSAGE);
    }
    public static void lose(){
        JOptionPane.showMessageDialog(null,"Que pena, tudo explodiu.", "Derrota!", JOptionPane.PLAIN_MESSAGE);
    }
}
