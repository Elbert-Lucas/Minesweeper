package Backend.Elements;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Bomb extends JButton {
    /*
        Bomb fields are just JButton with a few extra elements
     */
    //This static int is useful to declare victory
    private static int countBombsAvoid;

    int closeBombs;
    List<Bomb> neighbors;
    boolean isExplosive;
    boolean checked;

    static {
        Bomb.countBombsAvoid = 12*12;
    }
    {
        this.closeBombs = 0;
        neighbors = new ArrayList<>();
    }

    public boolean isExplosive() {
        return isExplosive;
    }
    public void setExplosive(boolean explosive) {
        isExplosive = explosive;
        setCloseBombs();
    }

    public int getCloseBombs() {
        return closeBombs;
    }
    public void setCloseBombs() {
        if (!this.isExplosive) this.closeBombs++;
        else this.closeBombs = 9;
    //Explosives bombs receives 9 in closeBombs var
    }

    public void addNeighbor (Bomb bomb){
        if (bomb != null) neighbors.add(bomb);
    }
    public List<Bomb> getNeighbors() {
        return neighbors;
    }


    public boolean isChecked() {
        return checked;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public static int getCountBombsAvoid() {
        return countBombsAvoid;
    }
    public static void setCountBombsAvoid(int countChecked) {
        Bomb.countBombsAvoid = countChecked;
    }
}
