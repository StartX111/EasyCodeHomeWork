package EasyCodeHomeWork.lesson02;

import java.util.Scanner;
import java.util.StringTokenizer;

/* TODO:It needs to be redone
 Напишите программу простого «форматирования» текста с
 использованием StringBuffer/Builder.
 Пользователь вводит целое число – ширину условной страницы
 и какое-либо число строк произвольной длины
 (ввод строки «stop» означает конец ввода).
 Программа должна отформатировать текст таким образом, чтобы строки не вылезали за ширину страницы.
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
