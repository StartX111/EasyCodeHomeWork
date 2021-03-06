package EasyCodeHomeWork.lesson01;

/*
 Объявить 5 переменных с плавающей точкой с разными значениями. Среди них положительные и отрицательные.
Найти:
•сумму и произведение всех значений;
•сумму только положительных из значений;
•сумму значений модулей отрицательных значений;
 */
public class L01_DZ01 {

    public static void main(String [] args){
        float varOne = 0.25f;
        float varTwo = -0.25f;
        float varThree = 5.125f;
        float varFour = -7.6725f;
        float varFive = -0.1f;

        double varSumm = varOne + varTwo + varThree + varFour + varFive;
        System.out.println("сумма всех значений = " + varSumm);
        double varMulti = varOne * varTwo * varThree * varFour * varFive;
        System.out.println("произведение всех значений = " + varMulti);

        double positiveValues = 0, negativeValues = 0;
        float arrayTable [] = {varOne, varTwo, varThree, varFour, varFive};
        for (int tempCount = 0; tempCount < arrayTable.length; tempCount++){
            if (arrayTable[tempCount] > 0){
                positiveValues += arrayTable[tempCount];
            }
            else {
                negativeValues += -arrayTable[tempCount];
            }
        }
        System.out.println("сумма положительных значений = " + positiveValues);
        System.out.println("сумма отрицательных значений = " + negativeValues);

    }
}
