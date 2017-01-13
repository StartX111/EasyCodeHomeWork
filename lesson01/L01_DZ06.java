package EasyCodeHomeWork.lesson01;

import java.util.Random;

/*
 Напишите программу, которая вычислит простые числа в пределах от 2 до 100
 и выведет их в консоль в произвольном порядке.
 */
public class L01_DZ06 {

    public static void main (String [] args){
        int [] array = new int [99];
        int [] arrayPrimes = new int [25];
        Random randomise = new Random();

        for (int countMass = 0; countMass < 99; countMass++) {//create mass 2..100
            array[countMass] = 2 + countMass;
        }

        for (int countMass = 0; countMass < 99; countMass++) { //search primes, rest = 1
            for (int intoCountMass = countMass+1; intoCountMass < 99; intoCountMass++) {
                if ((array[countMass] != 1) && (array[intoCountMass] != 1)) {
                    if (array[intoCountMass]%array[countMass]==0){
                        array[intoCountMass] = 1;
                    }
                }
            }
        }

        for (int countMass = 0, count = 0; countMass < 99; countMass++) {//create massive primes
            if (array[countMass] != 1){
                arrayPrimes[count++] = array[countMass];
            }
        }

        for (int countMass = 0; countMass < 25; countMass++) { //random change of values
            int randTemp = randomise.nextInt(25);
            int template;
            if (randTemp > countMass){
                template = arrayPrimes[countMass];
                arrayPrimes[countMass] = arrayPrimes[randTemp];
                arrayPrimes[randTemp] = template;
            }
        }

        for (int count = 0; count < 25; count++) {//out
            System.out.print(arrayPrimes[count] + " ");
        }
    }
}
