package GUI.Elements;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bomb extends JButton {

    int closeBombs;
    List<Bomb> neighbors;
    boolean isExplosive;

    public Bomb(){
        neighbors = new ArrayList<>();
    }

    public Bomb(boolean isExplosive){
        this.isExplosive = isExplosive;
    }

    public boolean isExplosive() {
        return isExplosive;
    }
    public void setExplosive(boolean explosive) {
        isExplosive = explosive;
    }

    public int getCloseBombs() {
        return closeBombs;
    }
    public void setCloseBombs(int closeBomb) {
        if (!isExplosive)this.closeBombs = closeBomb;
    }

    public void addNeighbor (Bomb bomb){
        if (bomb != null) neighbors.add(bomb);
    }

}
