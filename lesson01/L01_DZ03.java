package EasyCodeHomeWork.lesson01;

/*
 Вывести в консоль русский и латинский алфавиты с использованием char.
 */
public class L01_DZ03 {

    public static void main (String [] args){
        System.out.print("латинский алфавит : ");
        for (char carrentCharEn = 'a'; ((carrentCharEn >= 'a') & (carrentCharEn < 'z')); carrentCharEn ++) {
            System.out.print(carrentCharEn + " ");
        }
        System.out.println("");
        System.out.print("русский алфавит : ");
        for (char carrentCharRu = 'а'; ((carrentCharRu >= 'а') & (carrentCharRu < 'я')); carrentCharRu ++){
            System.out.print(carrentCharRu + " ");
        }
    }
}
