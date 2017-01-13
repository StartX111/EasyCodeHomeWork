package EasyCodeHomeWork.lesson03;

import java.util.Random;

/**
 * Created by vivat on 26.12.2016.
 */
public class TestClass {


    public static void main (String [] args){
        int [][] massiv = new int[5][5];
        Random generator = new Random();

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (i == j){
                    massiv[i][i] = 1;
                }
                if (j == (massiv[i].length-i-1)){
                    massiv[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println("");
        }
    }



}
