package EasyCodeHomeWork.lesson04;

import java.util.Arrays;

public class ToStudent {

    public static float averageMarkOfHWork (Student student, int volumeFullHWork){
        int result = 0;
        for (int countOfMark = 0; countOfMark < student.getHomeWorkMark().length; countOfMark++) {
            result += student.getHomeWorkMark()[countOfMark];
        }
        return result/volumeFullHWork;
    }

    public static float averageMartOfTeam (Student student, String team) {
        int result = 0;
        int teamCount = 0;
        for (int countHWork = 0; countHWork < student.getMyHomeWork().length; countHWork++) {
            if (student.getMyHomeWork()[countHWork].getTeam().equals(team)) {
                teamCount++;
                result += student.getHomeWorkMark()[countHWork];
            }
        }
        return result/(float)teamCount;
    }

    public static Student goodStudent (Student [] students, int volumeFullHWork){
        float [] arrayAverageMarkStudents = new float[students.length];

        for (int countOfStudent = 0; countOfStudent < students.length; countOfStudent++) {
            arrayAverageMarkStudents[countOfStudent] = averageMarkOfHWork(students[countOfStudent], volumeFullHWork);
        }
        int max = 0;
        for (int count = 0; count < arrayAverageMarkStudents.length; count++) {
            if (arrayAverageMarkStudents[count] > max){
                max = count;
            }
        }
        return students[max];
    }
    public static Student worseStudent (Student [] students, int volumeFullHWork){
        float [] arrayAverageMarkStudents = new float[students.length];

        for (int countOfStudent = 0; countOfStudent < students.length; countOfStudent++) {
            arrayAverageMarkStudents[countOfStudent] = averageMarkOfHWork(students[countOfStudent], volumeFullHWork);
        }
        int min = 0;
        for (int count = 0; count < arrayAverageMarkStudents.length; count++) {
            if (arrayAverageMarkStudents[count] < min){
                min = count;
            }
        }
        return students[min];
    }

}
