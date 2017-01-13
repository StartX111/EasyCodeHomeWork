package EasyCodeHomeWork.lesson03;

import java.util.Arrays;

/*
В одномерном массиве, состоящем из Nцелых элементов, вычислить:
•1) произведение элементов массива с четными номерами;
•2) сумму элементов массива, расположенных между первым и последним нулевыми элементами.
Преобразовать массив таким образом, чтобы сначала располагались все положительные элементы,
а потом —все отрицательные (элементы, равные 0, считать положительными).
 */
public class L03_DZ02 {

    public static void main (String [] args) {
        int [] array = {1, -2, 5, 0, 9, -6, 7, 0, 3, 0};
        int multiplDefinetionNamber = 1;
        int sumNamber = 0;

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if ((array[arrayCount] !=0) && (arrayCount%2 ==1)){
                multiplDefinetionNamber *= array[arrayCount];
            }
        }
        System.out.println("произведение элементов массива с четныи номерами : " + multiplDefinetionNamber);

        int minZero = 0, maxZero= 0;
        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if (array[arrayCount] == 0){
                minZero = arrayCount;
                break;
            }
        }
        for (int arrayCount = array.length - 1; arrayCount > 0; arrayCount--) {
            if (array[arrayCount] == 0){
                maxZero = arrayCount;
                break;
            }
        }
        for (; minZero < maxZero; minZero++) {
            sumNamber += array[minZero];
        }
        System.out.println("сумма элементов массива, расположенных между первым и последним нулевыми элементами : " + sumNamber);

        Arrays.sort(array);
        System.out.print("сортированный массив : ");
        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            System.out.print(array[arrayCount] + " ");
        }

    }
}
