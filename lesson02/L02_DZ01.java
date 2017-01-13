package EasyCodeHomeWork.lesson02;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 Напишите код, заменяющий в введённой строке все вхождения слова «ссылка» на «вырезано цензурой»
 */
public class L02_DZ01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String inputString = sc.nextLine();
        final String searchWord = "ссылка";
        final String rewriteWord = "вырезано цензурой";

        StringTokenizer stringToken = new StringTokenizer(inputString);
        while (stringToken.hasMoreTokens()) {
            String tokenTemp = stringToken.nextToken();
            if (searchWord.equalsIgnoreCase(tokenTemp)) {
                System.out.print(rewriteWord + " ");
            }else System.out.print(tokenTemp + " ");
        }
    }
}
