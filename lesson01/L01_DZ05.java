package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/**
 * Created by vivat on 18.12.2016.
 */
public class L01_DZ05 {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        if ((0 < value) & (value < 19)){
            System.out.println("F");
        }else if ((20 < value) & (value < 39)){
            System.out.println("E");
        }else if ((40 < value) & (value < 59)){
            System.out.println("D");
        }else if ((60 < value) & (value < 74)){
            System.out.println("C");
        }else if ((75 < value) & (value < 89)){
            System.out.println("B");
        }else if ((90 < value) & (value < 100)){
            System.out.println("A");
        }
    }
}
