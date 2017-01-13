package EasyCodeHomeWork.lesson04;

public class TestClass {

    public static void main (String [] args) {
        ComputerMause mause = new ComputerMause();
        mause.workTime = 2;
        mause.setModel("WM713");
        mause.setSpeedMause(3);
        mause.setWorkTime(10);
        float posX = mause.retPositionX();
        System.out.println(posX);
        System.out.println(mause.getModel());

        Calculator calc = new Calculator();
        calc.minusAB(5,4);
        calc.delitAB((long) 5, 2);

        System.out.println(calc.opperation);
    }
}
