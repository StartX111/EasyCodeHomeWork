package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/*
 Определить какой четверти принадлежит любая точка с координатами [х;у].
 Переменные x и унельзя инициализировать непосредственно в коде.
 Должны быть считаны из консоли.
 На экран вывести название четверти в произвольном виде.
 */
public class L01_DZ07 {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Введите значение координат");
        System.out.println("точка с координатами: [" + (x = in.nextInt()) + ";" + (y = in.nextInt()) + "]");
        if ((x>=0) && (y>=0)){
            System.out.println("I четверть");
        }else if ((x<0) && (y>0)){
            System.out.println("II четверть");
        }if ((x<0) && (y<0)){
            System.out.println("III четверть");
        }if ((x>0) && (y<0)){
            System.out.println("IV четверть");
        }
    }
}
