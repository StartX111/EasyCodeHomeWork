package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/**
 * Created by vivat on 24.12.2016.
 */
public class L02_DZ05 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String inputString = sc.nextLine();
        String reversString = new StringBuffer(inputString).reverse().toString();
        if (inputString.equals(reversString)){
            System.out.println("Введеная текст - палиндром.");
        }else System.out.println("Просто текст.");

    }
}
