package GUI;
import Backend.DrawBombs;
import Backend.Elements.Bomb;
import Backend.Elements.BombListener;
import Backend.AddNeighbors;
import javax.swing.*;

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

    public void createBoard(JFrame frame){

        /*
        This method create the board using buttons
         */

        Bomb [][] field = new Bomb[12][12];
        Bomb bomb;

        int minesQty = 0;
        int x = 60, y = 40;
        int index = 0, index2D = 0;


        //12*12 == board size
        while (minesQty < 12*12 ){
            bomb = new Bomb();
            bomb.setBounds(x,y, 30,30);
            bomb.addMouseListener(new BombListener(frame, bomb, x, y));

            DrawBombs.draw(bomb);
            // This function call puts dangerous bombs on random places


            AddNeighbors.addNeighbors(bomb, field,index, index2D);

            field [index][index2D] = bomb;
            frame.add(bomb);

            x += 30;
            index2D++;
            minesQty++;

            if (minesQty % 12 == 0 ){
                y += 30;
                x = 60;

                index ++;
                index2D = 0;
           // new column
            }
        }

        while (DrawBombs.explosivesQty < 20) DrawBombs.confirmDraw(field);
        //this loop confirms if it has 20 bombs on game
    }
}
