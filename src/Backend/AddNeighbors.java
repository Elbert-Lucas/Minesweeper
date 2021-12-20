package Backend;

import GUI.Elements.Bomb;

import java.util.ArrayList;
import java.util.List;

public class AddNeighbors{
    public static void addNeighbors(Bomb bomb, Bomb[][] field, int index, int index2D){
       int auxIndex = index -1;
       int auxIndex2D = index2D -1;

       while (auxIndex <= index &&
               auxIndex2D <= index2D + 1){

           try{
               bomb.addNeighbor(field[auxIndex][auxIndex2D]);
               field[auxIndex][auxIndex2D].addNeighbor(bomb);
           }catch (Exception ignored){
           };

           if (auxIndex2D >= index2D + 1){
               auxIndex++;
               auxIndex2D = index2D - 1;
           }else {
               auxIndex2D++;
           }
       }
    }
    public static void AddNumbers(){

    }
}