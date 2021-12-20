package Backend;

import GUI.Elements.Bomb;

public class DrawBombs {
    public static int explosivesQty = 0;


    public static void draw(Bomb bomb){
        if ((int) (Math.random() * 12) == 3){
            bomb.setExplosive(true);
            explosivesQty ++;
        }
    }

    public static void confirmDraw(Bomb[][] field){
        for (Bomb[] bombs : field){
            for (Bomb bomb:bombs){
                if (explosivesQty >= 40){
                    return;
                }
                else if (! bomb.isExplosive() && (int) (Math.random() * 12)==3){
                    bomb.setExplosive(true);
                    explosivesQty ++;
                }
            }
        }
    }
}
