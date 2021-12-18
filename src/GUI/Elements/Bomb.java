package GUI.Elements;

import javax.swing.*;

public class Bomb extends JButton {

    int closeBombs;
    Bomb[] neighbors;

    boolean isExplosive;

    public Bomb(){}
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
        this.closeBombs = closeBomb;
    }
}
