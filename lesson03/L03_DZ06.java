package EasyCodeHomeWork.lesson03;

import java.util.Arrays;
/*
1. С помощью двумерных массивов создать подобие шахматной доски,
   в которой белым и чёрным клеткам будут соответствовать строки "W"and "B"соответственно.
2. «Обвести» шахматную доску с помощью символов "-" (сверху и снизу) и "|"(слева и справа).
 */

public class L03_DZ06 {

    public static void main (String [] args) {
        char [][] chessBoard = new char [10][10];
        char [] charMass = {'W','B'};
        boolean charMassState = false;

        for (int counterArray = 0; counterArray < 10; counterArray++) {
            for (int internalCounterArray = 0; internalCounterArray < 10; internalCounterArray++) {
                if ((internalCounterArray==0)||(internalCounterArray==chessBoard.length-1)){
                    chessBoard[counterArray][internalCounterArray] = '|';
                }else if ((counterArray==0)||(counterArray==chessBoard.length-1)){
                    chessBoard[counterArray][internalCounterArray] = '-';
                }else if ((counterArray!=0)||(counterArray!=chessBoard.length-1)){
                    if (charMassState == false){
                        chessBoard[counterArray][internalCounterArray] = charMass[0];
                        charMassState = true;
                    }else if (charMassState == true){
                        chessBoard[counterArray][internalCounterArray] = charMass[1];
                        charMassState = false;
                    }
                    if ((internalCounterArray==8)&&(counterArray%2!=0)&&(charMassState==false)){
                        charMassState = true;
                    }else if ((internalCounterArray==8)&&(counterArray%2==0)&&(charMassState==true)){
                        charMassState = false;
                    }
                }
            }
        }

        for (int counterArray = 0; counterArray < 10; counterArray++) {
            for (int internalCounterArray = 0; internalCounterArray < 10; internalCounterArray++) {
                System.out.print(chessBoard[counterArray][internalCounterArray] + " ");
            }
            System.out.println("");
        }
    }
}
