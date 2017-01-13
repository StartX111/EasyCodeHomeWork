package EasyCodeHomeWork.lesson02;

import java.util.Scanner;

/*
 Палиндро́м — буквосочетание, слово или текст,
 одинаково читающееся в обоих направлениях
 (https://ru.wikipedia.org/wiki/Палиндром).
 Напишите программу, которая определит, является ли введенный текст палиндромом.
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
