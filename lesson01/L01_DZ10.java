package EasyCodeHomeWork.lesson01;

import java.util.Scanner;

/*
 Т.к. до Нового Года осталось около 2х недель,
 пора нарисовать ёлку с помощью любого из циклов.
 Высота задаётся из консоли. Ёлка должна получитьсяровная, вида:
    *
   ***
  *****
 *******
*********
 */
public class L01_DZ10 {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту елочки");
        int height = in.nextInt();
        int width = (height%2==0)?(height*2+1):(height*2);//calculation width
        for (int carrentHeigth = 0; carrentHeigth < height; carrentHeigth++){
            for (int carrentWigth = 0; carrentWigth < width; carrentWigth++){
                if ((carrentWigth < (width/2-carrentHeigth)) || (carrentWigth > (width/2+carrentHeigth))){
                    System.out.print(" ");
                }else System.out.print("*");
            }
            System.out.println("");
        }
    }


}
