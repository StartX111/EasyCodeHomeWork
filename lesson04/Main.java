package EasyCodeHomeWork.lesson04;

public class Main {

    public static void main(String[] args) {



        Student student01 = new Student("Ivanov", "Ivan", "Ivanovich", (short) 25);
        Student student02 = new Student("Ivanov", "Ivan", "Petrovoch", (short) 22);
        Student student03 = new Student("Kirilenko", "Semen", "Ivanovoch", (short) 26);
//        one
//        System.out.println(student01.toString());
//        System.out.println(student02.toString());
//        System.out.println(student03.toString());
//
//        System.out.println(student01.equals(student02));
//        System.out.println(student01.equals(student03));
//        System.out.println(student02.equals(student03));

//        two
        Student [] studentu = {student01, student02, student03};
        Group javaGroup = new Group("javaGroup", "Yevhen", studentu);
        Group javaScriptGroup = new Group("javaScriptGroup", "Ilya", student01);

        System.out.println(javaGroup.toString());
        System.out.println(javaScriptGroup.toString());

//        three
        HomeWork three1Homework = new HomeWork("Массивы", (short) 1, "В одномерном массиве вычислить", "В одномерном массиве, состоящем из N-вещественных элементов, вычислить: сумму и призведение элементов");
        HomeWork three2Homework = new HomeWork("Массивы", (short) 2, "В одномерном массиве вычислить из целых чисел", "В одномерном массиве, состоящем из N-целых элементов, вычислить:произведение элементов массива с четными номерами");
        HomeWork three3Homework = new HomeWork("Массивы", (short) 3, "В одномерном массиве вещественных элементов", "В одномерном массиве, состоящем из N-вещественных элементов, вычислить: максимальный элемент вассива");
        HomeWork four1Homework = new HomeWork("Классы, методы, параметры", (short) 1, "Написать класс, описывающий студента", "Класс должен содержать необходимые, по вашему мнению поля, соответствующие геттеры и сеттеры, валидные конструкторы класса.");
        HomeWork four2Homework = new HomeWork("Классы, методы, параметры", (short) 2, "Написать класс, описывающий группу студентов", "Класс должен содержать необходимые, по вашему мнению поля, соответствующие геттеры и сеттеры, валидные конструкторы класса.");
        HomeWork four3Homework = new HomeWork("Классы, методы, параметры", (short) 3, "Написать класс, описывающий студента", "Класс должен содержать необходимые, по вашему мнению поля, соответствующие геттеры и сеттеры, валидные конструкторы класса.");
        HomeWork [] homeWorks = new HomeWork[] {three1Homework, three2Homework, three3Homework, four1Homework, four2Homework, four3Homework};
        student01.setMyHomeWork(four2Homework);
        student02.setMyHomeWork(four3Homework);
        student03.setMyHomeWork(three3Homework);
        student03.addMyHomeWork(new HomeWork[]{homeWorks[3]},1);
        student01.setHomeWorkMark(0, (short) 5);
        student02.setHomeWorkMark(0, (short) 4);
        student03.setHomeWorkMark(0, (short) 5);
        student03.setHomeWorkMark(1, (short) 4);

        System.out.println(student01);
        System.out.println(student02);
        System.out.println(student03);

        //four
        System.out.println(ToStudent.averageMarkOfHWork(student03, homeWorks.length));
        System.out.println(ToStudent.averageMartOfTeam(student03, "Классы, методы, параметры"));
        System.out.println("Луший студент: " + ToStudent.goodStudent(studentu, homeWorks.length).getFIO());
        System.out.println("Худший студент: " + ToStudent.worseStudent(studentu, homeWorks.length).getFIO());


    }

}
