package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/**
 * Created by vivat on 24.12.2016.
 */
public class L02_DZ03 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String inputString = sc.nextLine();
        String outPutString = new String();
        for (int countChar = 0; countChar < inputString.length(); countChar++) {
            outPutString += inputString.charAt(inputString.length() - countChar - 1);
        }
        System.out.println(outPutString);
    }
}
