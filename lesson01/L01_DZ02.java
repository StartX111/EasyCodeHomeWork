package EasyCodeHomeWork.lesson01;

/*
 Марсианская гравитация составляет 38% от Земной. Написать программу,
 которая подсчитывает Ваш собственный вес на марсе и выводит в консоль.
 Ваш вес можно задать константой в коде.
 */
public class L01_DZ02 {

    public static void main (String [] args){
        final float myWeight = 0.38f;
        System.out.printf("мой весс на Марсе = %.2f", (62.5 * myWeight));
    }
}
