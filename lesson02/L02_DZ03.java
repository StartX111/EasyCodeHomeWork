package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/*
 Ана́ним — частный случай анаграммы, способ словообразования псевдонимов
 и авторских неологизмов путём написания слова в обратном порядке
 (https://ru.wikipedia.org/wiki/Ананим).
 С использованием цикла составьте и выведите ананим введённой пользователем строки.
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
