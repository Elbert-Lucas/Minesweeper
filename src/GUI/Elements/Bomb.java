package GUI.Elements;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Bomb extends JButton {

    int closeBombs;
    List<Bomb> neighbors;
    boolean isExplosive;

    {
        closeBombs = 0;
    }
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
        setCloseBombs();
    }

    public int getCloseBombs() {
        return closeBombs;
    }

    public void setCloseBombs() {
        if (!this.isExplosive) this.closeBombs++;
        else this.closeBombs = 6;
    }

    public void addNeighbor (Bomb bomb){
        if (bomb != null) neighbors.add(bomb);
    }

    public List<Bomb> getNeighbors() {
        return neighbors;
    }
}
