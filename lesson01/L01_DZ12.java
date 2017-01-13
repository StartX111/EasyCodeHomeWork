package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/**
 * Created by vivat on 18.12.2016. +
 */
public class L01_DZ12 {

    final static float exchangeRates = 27.2f;

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Курс $ на сегодня : " + exchangeRates + "грн. = 1$");
        System.out.println("Введите количество валюты для конвертации: ");
        System.out.println("Конвертация гривны в доллары");
        GrnToDollar(in.nextInt());
        System.out.println("Конвертация долларов в гривны");
        DollarToGrn(in.nextInt());
    }


    static void DollarToGrn(int money){
        System.out.printf("%d$ = %dгрн. + %.2f$", money,  (int)(money * exchangeRates),(money - ((int)(money * exchangeRates)/ exchangeRates)));
        System.out.println("");
    }


    static void GrnToDollar(int money){
        System.out.printf("%d$ = %d$ + %.2fгрн.", money, (int)(money / exchangeRates), (money % exchangeRates));
        System.out.println("");
    }

}
