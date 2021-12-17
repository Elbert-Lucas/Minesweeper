package GUI.Elements;

import javax.swing.*;

public class Bomb extends JButton {


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
}
