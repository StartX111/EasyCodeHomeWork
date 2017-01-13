package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/**
 * Created by vivat on 24.12.2016.
 */
public class L02_DZ02 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String inputString = sc.nextLine();
        long summValue = 0;
        for (int countChar = 0; countChar < inputString.length(); countChar++) {
            summValue = inputString.charAt(countChar);
        }
        System.out.println(summValue);
    }
}
