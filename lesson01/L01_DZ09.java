package EasyCodeHomeWork.lesson01;

/*
 Написать 3 версии программы с использованием разных циклов,
 «шагающей» по числам, начиная с 1 до 1000
 с интервалом 1,3,5,1,3,5,1,3,5,1…
 */
public class L01_DZ09 {

    public static void LoopWhile () {
        int startValue = 1, outValue = 1000;
        int incrementCount = 0;
        int arrayInc [] = {1, 3, 5};
        while (startValue < outValue){
            switch (incrementCount){
                case 0:
                    incrementCount++;
                    break;
                case 1:
                    startValue += arrayInc[incrementCount-1];
                    incrementCount++;
                    break;
                case 2:
                    startValue += arrayInc[incrementCount-1];
                    incrementCount++;
                    break;
                case 3:
                    startValue += arrayInc[incrementCount-1];
                    incrementCount = 1;
                    break;
                default:
                    break;
            }
            System.out.print(startValue + " ");
        }
    }

    public static void LoopFor (){
        int outValue = 1000;
        int incrementCount = 0;
        int arrayInc [] = {1, 3, 5};
        for (int startValue =1; startValue < outValue; incrementCount++){
            switch (incrementCount){
                case 0:
                    break;
                case 1:
                    startValue += arrayInc[incrementCount-1];
                    break;
                case 2:
                    startValue += arrayInc[incrementCount-1];
                    break;
                case 3:
                    startValue += arrayInc[incrementCount-1];
                    incrementCount = 0;
                    break;
                default:
                    break;
            }
            System.out.print(startValue + " ");
        }
    }

    public static void main (String [] args){
        L01_DZ09.LoopWhile();
        System.out.println("");
        L01_DZ09.LoopFor();

    }


}
