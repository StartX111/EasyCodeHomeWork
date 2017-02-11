package EasyCodeHomeWork.lesson04;

import java.util.Arrays;

public class Student {

    private String fName;
    private String mName;
    private String lName;
    private short age;
    private HomeWork [] myHomeWork;
    private short [] homeWorkMark;


    public Student(String fName, String mName, String lName, short age) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.age = age;
    }

    public void setMyHomeWork(HomeWork myHomeWork) {
        this.myHomeWork = new HomeWork[] {myHomeWork};
        this.homeWorkMark = new short[this.myHomeWork.length];
    }

    public void setMyHomeWork(HomeWork[] myHomeWork) {
        this.myHomeWork = new HomeWork[myHomeWork.length];
        for (HomeWork myHWork: myHomeWork ) {
            this.myHomeWork = myHomeWork;
        }
        this.homeWorkMark = new short[this.myHomeWork.length];
    }

    public void addMyHomeWork(HomeWork []myHomeWork, int volumeHWork) {
        HomeWork [] newHWork = new HomeWork[this.myHomeWork.length + volumeHWork];
        for (int countHWork = 0; countHWork < (this.myHomeWork.length + volumeHWork); countHWork++) {
            if (countHWork < this.myHomeWork.length){
                newHWork[countHWork] = this.myHomeWork[countHWork];
            }else {
                newHWork[countHWork] = myHomeWork[Math.abs(this.myHomeWork.length - countHWork)];
            }
        }
        this.myHomeWork = newHWork;
        this.homeWorkMark = new short[newHWork.length];
    }

    public void setHomeWorkMark(int markForHWork, short homeWorkMark) {
        this.homeWorkMark[markForHWork] = homeWorkMark;
    }

    public HomeWork[] getMyHomeWork() {
        return this.myHomeWork;
    }

    public short[] getHomeWorkMark() {
        return this.homeWorkMark;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;
    }

    public String getFIO(){
        return this.fName + "." + this.mName + "." + this.lName;
    }

    public short getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (fName != null ? !fName.equals(student.fName) : student.fName != null) return false;
        if (mName != null ? !mName.equals(student.mName) : student.mName != null) return false;
        return lName != null ? lName.equals(student.lName) : student.lName == null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ФИО: " + fName + '.' +
                mName + '.' +
                lName + '.' +
                ", age=" + age + "\n"+
                ", myHomeWork=" + Arrays.toString(myHomeWork) + "\n" +
                ", homeWorkMark=" + Arrays.toString(homeWorkMark) +
                '}';
    }

}
