package EasyCodeHomeWork.lesson03;

import java.util.Scanner;

/*
 В одномерном массиве, состоящем из Nвещественных элементов, вычислить:
•1) сумму отрицательных элементов массива;
•2) произведение элементов массива, расположенных между максимальным и минимальным элементами.
 */
public class L03_DZ01 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива вещественных чисел N ");
        int sizeArrey = sc.nextInt();
        float [] array = new float [sizeArrey];
        float minusSum = 0;
        double maxMinPower = 1;
        int maxPosition = 1, minPosition = 1, startPosition;
        System.out.printf("Элементы массива буду заданы рандомно от -%d до %d", sizeArrey, sizeArrey);
        System.out.println("");
        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {//в следующей строке магия, оставляем один знак после запятой у рандома
            array[arrayCount] = ((float)((int)(10*(-sizeArrey/2 + (float)Math.random()*(sizeArrey)))))/10;
        }

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if (array[arrayCount] < 0){
                minusSum += -array[arrayCount];
            }
            if (array[minPosition] > array[arrayCount]){
                minPosition = arrayCount;
            }
            if (array[maxPosition] < array[arrayCount]){
                maxPosition = arrayCount;
            }
        }

        System.out.println("max" + maxPosition);
        System.out.println("min" + minPosition);
        if ((maxPosition - minPosition) > 0){
            startPosition = minPosition;
            maxMinPower = array[startPosition];
            for (; startPosition < maxPosition; ++startPosition) {
                if (array[startPosition] != 0) {
                    maxMinPower *= array[startPosition];
                }
            }
        }else {
            startPosition = maxPosition;
            maxMinPower = array[startPosition];
            for (; startPosition < minPosition; ++startPosition) {
                if (array[startPosition] != 0) {
                    maxMinPower *= array[startPosition];
                }
            }
        }

        System.out.println("массив: ");
        for (int countArray = 0; countArray < array.length; countArray++) {
            System.out.print(array[countArray] + " ");
        }

        System.out.println("");
        System.out.println("сумма отрицательных элементов = -" + minusSum);
        System.out.println("произведение между миримальным и максимальным значением = " + maxMinPower);

    }
}
