package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/*
 Дополнение к конвертеру валют. Добавьте возможность высчитывать сдачу клиенту
  при проведении операции только с целыми купюрами долларов в наличии.
  Программа должна вывести результат в виде строкиформата: "N грн= K$ + Xгрнсдачи.".
  Для вывода строки такого формата использовать спецификаторы форматирования вывода.
Пример: хочу обменять гривны на доллары. На руках имею 500 гривен.Курс 27.2
Вывод: "500грн = 18$ + 10.40грн сдачи."
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
