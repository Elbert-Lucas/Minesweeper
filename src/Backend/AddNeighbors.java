package Backend;

import GUI.Elements.Bomb;

import java.util.ArrayList;
import java.util.List;

public class AddNeighbors{
    public static void addNeighbors(Bomb bomb, Bomb[][] field, int index, int index2D){

        /*
        This method create bomb´s neighbors.
        Neighbors represent the close buttons/bombs, it´s useful for clearing sequential whitespace,
        and to numerate buttons next to bombs.
         */

       int auxIndex = index -1;
       int auxIndex2D = index2D -1;

       while (auxIndex <= index &&
               auxIndex2D <= index2D + 1){

           try{
               bomb.addNeighbor(field[auxIndex][auxIndex2D]);
               field[auxIndex][auxIndex2D].addNeighbor(bomb);
               //first line add the previous buttons
               //second line add next buttons
               if (bomb.isExplosive()){
                   field[auxIndex][auxIndex2D].setCloseBombs(field[auxIndex][auxIndex2D].getCloseBombs() + 1);
               }else if(field[auxIndex][auxIndex2D].isExplosive()){
                   bomb.setCloseBombs(bomb.getCloseBombs() + 1);
               }
           }catch (Exception ignored){
               //Just ignore if not exist the button
           };

           if (auxIndex2D >= index2D + 1){
               auxIndex++;
               auxIndex2D = index2D - 1;
           }else {
               auxIndex2D++;
           }
       }
       //This loop walk among next buttons
    }
    public static void AddNumbers(){

    }
}