package EasyCodeHomeWork.lesson04;

/**
 * Created by vivat on 29.12.2016.
 */
public class Calculator {

    char opperation;
    {
        opperation = 1;
    }

    public Calculator (){
        System.out.println("constructor " + opperation);
    }



    public double plusAB(int namber1, int namber2 ) {
        opperation = '+';
        return namber1 + namber2;
    }

    public double plusAB(long namber1, long namber2 ) {
        opperation = '+';
        return namber1 + namber2;
    }

    public double minusAB(int namber1, int namber2 ) {
        opperation = '-';
        return namber1 - namber2;
    }

    public double minusAB(long namber1, long namber2 ) {
        opperation = '-';
        return namber1 - namber2;
    }

    public double delitAB(int namber1, int namber2 ) {
        opperation = '/';
        return namber1 / namber2;
    }
    public double delitAB(long namber1, long namber2 ) {
        opperation = '/';
        return namber1 / namber2;
    }

    public double umnozitAB(int namber1, int namber2 ) {
        opperation = '*';
        return namber1 * namber2;
    }
}
