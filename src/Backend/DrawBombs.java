package Backend;

import Backend.Elements.Bomb;

public class DrawBombs {
    public static int explosivesQty = 0;


    public static void draw(Bomb bomb){
        /*
        This method create explosives bombs using Math.random
         */
        if ((int) (Math.random() * 12) == 3 && explosivesQty < 20){
            bomb.setExplosive(true);
            explosivesQty ++;
        }
    }

    public static void confirmDraw(Bomb[][] field){
        /*
        This method is used if the first method don't create all bombs
         */
        for (Bomb[] bombs : field){
            for (Bomb bomb:bombs){
                if (explosivesQty >= 20){
                    return;
                }
                else if (!bomb.isExplosive() && (int) (Math.random() * 12)==3){
                    bomb.setExplosive(true);
                    AddNeighbors.addNumbersInConfirmDraw(bomb);
                    explosivesQty ++;
                }
            }
        }
    }
}
