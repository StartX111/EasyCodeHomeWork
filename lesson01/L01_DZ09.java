package EasyCodeHomeWork.lesson01;

/**
 * Created by vivat on 18.12.2016.
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
