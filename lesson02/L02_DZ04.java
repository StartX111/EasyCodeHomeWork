package EasyCodeHomeWork.lesson02;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by vivat on 24.12.2016.
 */
public class L02_DZ04 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        StringTokenizer inputString = new StringTokenizer(sc.nextLine());
        if (inputString.countTokens() > 3){
            System.out.println("Ошибка, слишком длинное ФИО, попробуйте вводить имя без титулов и званий");
        }else {
            for (int countToken = 0; countToken < 3; countToken++) {
                System.out.print(inputString.nextToken().toUpperCase().charAt(0) + ".");
            }
        }
    }
}
