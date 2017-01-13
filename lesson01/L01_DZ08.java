package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/*
 Посчитать выражение макс(а*б*с, а+б+с)+3
 */
public class L01_DZ08 {

    public static void main (String [] args){
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Введеите целое значение а:");
        a = in.nextInt();
        System.out.print("Введеите целое значение b:");
        b = in.nextInt();
        System.out.print("Введеите целое значение c:");
        c = in.nextInt();

        System.out.println("MAX = " + (3 + Math.max((a*b*c), (a+b+c))));
    }
}
