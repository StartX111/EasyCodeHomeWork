package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/*
 Написать программу, отвечающую Вам на ввод из консоли.
 Ввод в консоль имени студента ("Евгений"), вывод на консоль строки вида:
«Hello, Евгений!".
Конкатенировать строки обычным плюсом.
 */
public class L01_DZ04 {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, " + in.nextLine() + "!");
    }
}
