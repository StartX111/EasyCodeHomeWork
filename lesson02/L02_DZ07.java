package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/**
 * Created by vivat on 24.12.2016.
 */
public class L02_DZ07 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        String inputString = sc.nextLine();
        for (int countChar = 0; countChar < inputString.length(); countChar++) {
            System.out.print(inputString.charAt(countChar) + ",");
        }
    }
}
