package EasyCodeHomeWork.lesson03;

/*
Водномерном массиве, состоящем из Nцелых элементов, вычислить:
–1) минимальный по модулю элемент массива;
–2) сумму модулей элементов массива, расположенных после первого элемента, равного нулю.
Преобразовать массив таким образом, чтобы в первой его половине располагались элементы,
стоявшие в четных позициях, а во второй половине —элементы, стоявшие в нечетных позициях.
 */

public class L03_DZ04 {

    public static void main (String [] args) {
        int [] array = {1, 4, -2, 5, 0, 9, -6, 7, 0, 3, 10};
        int minAbsValue = array[0];
        boolean state = false;
        int sumAbs = 0;

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if ((array[arrayCount] > 0) && (Math.abs(array[arrayCount]) < Math.abs(minAbsValue))){
                minAbsValue = array[arrayCount];
            }
        }
        System.out.println("минимальный по модулю элемент массива: " + Math.abs(minAbsValue));

        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            if (array[arrayCount] == 0){
                state = true;
            }
            if (state){
                sumAbs += Math.abs(array[arrayCount]);
            }
        }
        System.out.println("сумму модулей элементов массива, расположенных после первого элемента, равного нулю: " + sumAbs);

        for (int arrayCount = 0, temp, lengthArray = array.length-1; arrayCount < array.length/2; arrayCount++) {
            while ((array.length-1)%2 != 0){//если масив четный
                temp = array[lengthArray-1];
                array[lengthArray-1] = array[lengthArray];
                array[lengthArray] = temp;
                lengthArray--;
            }
            if (arrayCount % 2 == 0){
                temp = array[arrayCount];
                array[arrayCount] = array[lengthArray];
                array[lengthArray] = temp;
                lengthArray -= 2;
            }
        }
        System.out.println("преобразованый массив, в первой половине четные, во второй нечетные:");
        for (int arrayCount = 0; arrayCount < array.length; arrayCount++) {
            System.out.print(array[arrayCount] + " ");
        }
    }
}
