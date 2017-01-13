package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/*
 Напишите простой консольный конвертер валют гривны/доллары и наоборот.
 Курс фиксированный хранится в переменной.
 Количество валюты для конвертации считывается с консоли.
 */
public class L01_DZ11 {

    final static double exchangeRates = 27.2;

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Курс $ на сегодня : " + exchangeRates + "грн. = 1$");
        System.out.println("Введите количество валюты для конвертации: ");
        System.out.println("Конвертация гривны в доллары");
        GrnToDollar(in.nextDouble());
        System.out.println("Конвертация долларов в гривны");
        DollarToGrn(in.nextDouble());

    }

    public static void DollarToGrn(double money){
        System.out.println(money * exchangeRates + "грн.");
    }

    public static void GrnToDollar(double money){
        System.out.println(money / exchangeRates + "$");
    }

}
