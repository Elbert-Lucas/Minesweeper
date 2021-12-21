package Backend;
import GUI.Elements.Bomb;


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

               //this method call set the numbers:
               addNumbers( bomb,  field, auxIndex, auxIndex2D);

           }catch (Exception ignored){
               //Just ignore if not exist the button
           };

           // If statement to update row and columns neighbors:
           if (auxIndex2D >= index2D + 1){
               auxIndex++;
               auxIndex2D = index2D - 1;
           }else {
               auxIndex2D++;
           }
       }
        System.out.println("------------");
       //This loop walk among next buttons
    }

    public static void addNumbers(Bomb bomb, Bomb[][] field, int auxIndex, int auxIndex2D){
        if (bomb.isExplosive()){
            field[auxIndex][auxIndex2D].setCloseBombs();
        }else if(field[auxIndex][auxIndex2D].isExplosive()){
            bomb.setCloseBombs();
        }
    }
    public static void addNumbersInConfirmDraw(Bomb bomb){
        for (Bomb neighbor:bomb.getNeighbors()){
            neighbor.setCloseBombs();
        }
    }
}