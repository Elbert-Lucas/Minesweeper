package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BombListener implements ActionListener {
    JFrame frame;
    JButton mine;
    public BombListener(JFrame frame, JButton mine){
        this.frame = frame;
        this.mine = mine;
    }
    @Override
    public void actionPerformed(ActionEvent click) {
        frame.remove(mine);

    }
}
