package Backend;

import GUI.Elements.Bomb;

public class AddNeighbors{
    public static void addNeighbors(Bomb[][] fild){
        Bomb [] neighbors;
        for (int index = 0; index <= fild.length; index++){

            for (int index2D = 0; index2D <= fild[index].length; index2D++){

                  if (index2D == 0){
                    //Is the first column and row
                      neighbors = new Bomb[]{fild[index][index2D + 1],
                                             fild[index + 1][index2D],
                                             fild[index + 1][index2D + 1]};

                  }else if (index == fild.length-1){
                      //Is the column and row
                      neighbors = new Bomb[]{fild[index][index2D - 1],
                                             fild[index - 1][index2D],
                                             fild[index - 1 ][index2D - 1]};

                  }else if (index == 0) {
                      //Is the first row
                      neighbors = new Bomb[]{fild[index][index2D - 1],
                                             fild[index][index2D + 1],
                                             fild[index - 1][index2D],
                                             fild[index - 1 ][index2D - 1]};


                  } else if (index2D == fild[0].length - 1) {
                      //Is the last row

                      neighbors = new Bomb[6];

                  }

                  }
                  else neighbors = new Bomb[8];

                  fild[index][index2D].setCloseBombs();
                  // Check if the index is the ends of board
            }

        }
    }
    public static void AddNumbers(){

    }
}