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
        int sizeArray = sc.nextInt();
        float [] array = new float [sizeArray];
        float minusSum = 0;
        double maxMinPower = 1;
        int maxPosition = 1, minPosition = 1, startPosition;
        System.out.printf("Элементы массива буду заданы рандомно от -%d до %d", sizeArray, sizeArray);
        System.out.println("");
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            array[arrayIndex] = randomFloatNamber(sizeArray);
        }

        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] < 0){
                minusSum += array[arrayIndex];
            }
            if (array[minPosition] > array[arrayIndex]){
                minPosition = arrayIndex;
            }
            if (array[maxPosition] < array[arrayIndex]){
                maxPosition = arrayIndex;
            }
        }

        System.out.println("max: " + maxPosition);
        System.out.println("min: " + minPosition);
        if ((maxPosition - minPosition) > 0){
            startPosition = minPosition;
        }else {
            startPosition = maxPosition;
            maxPosition = minPosition;
        }
        maxMinPower = array[startPosition];
        while (startPosition < maxPosition) {
            ++startPosition;
            if (array[startPosition] != 0) {
                maxMinPower *= array[startPosition];
            }
        }

        System.out.println("массив: ");
        for (int countArray = 0; countArray < array.length; countArray++) {
            System.out.print(array[countArray] + " ");
        }

        System.out.println("");
        System.out.println("сумма отрицательных элементов = " + minusSum);
        System.out.printf("произведение между миримальным и максимальным значением = %.2f", maxMinPower);

    }

    static float randomFloatNamber(int namber){
        return ((float)((int)(10*(-namber/2 + (float)Math.random()*(namber)))))/10;
    }

}
