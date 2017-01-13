package EasyCodeHomeWork.lesson03;

/*
Водномерном массиве, состоящем из Nвещественных элементов, вычислить:
•1) максимальный элемент массива;
•2) сумму элементов массива, расположенных до последнего положительного элемента;
Сжать массив, удалив из него все элементы, модуль которых находится в интервале [a,b].
Освободившиеся в конце массива элементы заполнить нулями.
 */
public class L03_DZ03 {

    public static void main (String [] args) {
        float [] array = {1.26f, 4.25f, -2.54f, 5.364f, 0.1f, 9.5f, -6.36f, 7.56f, 0f, 3.24f, 0.265f};
        float maxNamber = array[0];
        float sumPositive = 0;
        float [] arrayLimit = {-2f, 2f};

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if (maxNamber < array[arrayCount]){
                maxNamber = array[arrayCount];
            }
        }
        System.out.println("максимальный элемент массива: " + maxNamber);

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if (array[arrayCount] > 0){
                sumPositive += array[arrayCount];
            }else break;
        }
        System.out.println("сумму элементов массива, расположенных до последнего положительного элемента: " + sumPositive);

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if ((Math.abs(array[arrayCount]) > arrayLimit[0]) && (Math.abs(array[arrayCount]) < arrayLimit[1])){
                array[arrayCount] = 0;
            }
        }
        for (int arrayCount = 0, oldNamber = array.length - 1; arrayCount < oldNamber; arrayCount++) {
            if (array[arrayCount] == 0f){
                while (array[oldNamber] == 0){
                    oldNamber--;
                }
                float temp = array[oldNamber];
                array[oldNamber] = array[arrayCount];
                array[arrayCount] = temp;
                oldNamber--;
            }
        }
        System.out.printf("сжатый масив, без чисел идспазона [%.2f , %.2f]: \n", arrayLimit[0], arrayLimit[1]);
        for (int arrayCount = 0; arrayCount < array.length; arrayCount++){
            System.out.print(array[arrayCount] + " ");
        }

    }
}
