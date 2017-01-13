package EasyCodeHomeWork.lesson03;

import java.util.Arrays;
/*
Дана целочисленная прямоугольная матрица. Определить:
–количество строк, не содержащих ни одного нулевого элемента;
–максимальное из чисел, встречающихся в заданной матрице более одного раза.
 */

public class L03_DZ05 {

    public static void main (String [] args) {
        int[][] array = {{1, 2, 0, 4}, {1, 5, 6, 4,}, {0, 3, 1, 8}};
        int stringNotZero = 0;
        boolean stateStringNotZero = false;
        int lengtharrays = 0;


        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            for (int arrayInCount = 0; arrayInCount < array[arrayCount].length; arrayInCount++) {
                if (array[arrayCount][arrayInCount] == 0) {
                    stateStringNotZero = true;
                }
            }
                if (stateStringNotZero) {
                    stateStringNotZero = false;
                } else stringNotZero++;
        }
        System.out.println("количество строк, не содержащих ни одного нулевого элемента:" + stringNotZero);

        for (int counterArray = 0; counterArray < array.length; counterArray++) {
            lengtharrays += array[counterArray].length;
        }
        int [] longArray = new int [lengtharrays+1];
        int numberMaxRepeat = 0;
        for (int counterArray = 0; counterArray < array.length; counterArray++) {
            for (int inernalCounterArray = 0; inernalCounterArray < array[counterArray].length; inernalCounterArray++) {
                longArray[lengtharrays--] = array[counterArray][inernalCounterArray];
            }
        }
        Arrays.sort(longArray);
        for (int temp, counterArray = longArray.length-1; counterArray > 0; counterArray--) {
            temp = longArray[counterArray];
            if (temp == longArray[counterArray-1]){
                numberMaxRepeat = temp;
                break;
            }
        }
        System.out.println("максимальное из чисел, встречающихся в заданной матрице более одного раза: " + numberMaxRepeat);

        System.out.println("элементы прямоугольного массива:");
        for (int counterArray = 0; counterArray < array.length; counterArray++) {
            for (int internalCounterArray = 0; internalCounterArray < array[counterArray].length; internalCounterArray++) {
                System.out.print(array[counterArray][internalCounterArray] + " ");
            }
            System.out.println("");
        }
    }
}
