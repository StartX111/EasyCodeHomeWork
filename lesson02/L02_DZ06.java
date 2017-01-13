package EasyCodeHomeWork.lesson02;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 Напишите программу, «капитализирующую» введённый текст.
 Каждое слово во введённом тесте после работы программы
 должно начинаться с большой буквы.
 */
public class L02_DZ06 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        StringTokenizer inputString = new StringTokenizer(sc.nextLine());
        while (inputString.hasMoreTokens()){
            StringBuffer stringBuf = new StringBuffer(inputString.nextToken());
            String tempString = new String("" + stringBuf.charAt(0));
            stringBuf.replace(0,1,tempString.toUpperCase());
            System.out.print(stringBuf + " ");
        }
    }
}
