package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/*
 Напишите программу, которая будет считывать число из консоли
 и выводить отдельные цифры, из которого оно состоит:
 Например: ввод числа 357951
 вывод программы: 3,5,7,9,5,1
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
