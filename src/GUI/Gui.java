package GUI;
import javax.swing.*;
import java.awt.*;

public class Gui {
    public  void initFrame(){
        /*
        This method initialize the javax frame, and calls the method to create the board
         */
        JFrame frame = new JFrame("Minesweeper");
        frame.setLayout(null);

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createBoard(frame);

        frame.setVisible(true);
    }

    public JButton[][] createBoard(JFrame frame){
        /*
        This method create the board using buttons
         */
        JButton [][] field = new JButton[12][12];
        JButton mine;

        int minesQty = 0;
        int x = 60, y = 40;
        int index = 0, index2D = 0;

        /*
            12*12 == board size
         */
        while (minesQty < 12*12 ){
            mine = new JButton();
            mine.setBounds(x,y, 30,30);
            mine.addActionListener(new BombListener(frame, mine));

            field [index][index2D] = mine;
            frame.add(mine);

            x += 30;
            index2D++;
            minesQty++;

            if (minesQty % 12 == 0 ){
                y += 30;
                x = 60;

                index ++;
                index2D = 0;
             /*
                new column
             */
            }
        }
        return field;
    }
}
