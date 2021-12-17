package GUI;
import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void initFrame(){
        JFrame frame = new JFrame("Minesweeper");
        frame.setLayout(null);

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createBoard(frame);

        frame.setVisible(true);
    }

    public static void createBoard(JFrame frame){
        JButton mine;
        int minesQty = 0;
        int x = 60, y = 40;

        while (minesQty < 12*12 ){
            mine = new JButton();
            mine.setBounds(x,y, 30,30);
            frame.add(mine);

            x += 30;
            minesQty++;

            if (minesQty % 12 == 0 ){
                y += 30;
                x = 60;
            }
        }
    }
}
