package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/**
 * Created by vivat on 18.12.2016.
 */
public class L01_DZ07 {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Введите значение координат");
        System.out.println("точка с координатами: [" + (x = in.nextInt()) + ";" + (y = in.nextInt()) + "]");
        if ((x>=0) && (y>=0)){
            System.out.println("I четверть");
        }else if ((x<0) && (y>0)){
            System.out.println("II четверть");
        }if ((x<0) && (y<0)){
            System.out.println("III четверть");
        }if ((x>0) && (y<0)){
            System.out.println("IV четверть");
        }
    }
}
