package EasyCodeHomeWork.lesson02;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by vivat on 24.12.2016.
 * последняя задача
 */
public class L02_DZ08 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину строки символов");
        int lenghtSting = sc.nextInt();
        System.out.println("Введите строки для форматирования");
        String inputString = sc.nextLine();
        StringTokenizer strToken = new StringTokenizer(inputString);
        StringBuffer strBuffer = new StringBuffer();
        do {

        } while (strBuffer.length() < lenghtSting);
    }
}
