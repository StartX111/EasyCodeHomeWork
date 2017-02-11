package EasyCodeHomeWork.lesson04;

import java.util.Arrays;

public class Group {

    private final short MAXSTUDENTINGROUP = 16;
    private Student [] groupStudent;
    private String nameGroup;
    private String nameTeacher;


    public Group(String nameGroup, String nameTeacher, Student [] students) {
        this(nameGroup, nameTeacher);
        this.groupStudent = new Student[students.length];
        if (students.length < MAXSTUDENTINGROUP){
            for (int countStudent = 0; countStudent < students.length; countStudent++) {
                this.groupStudent[countStudent] = students[countStudent];
            }
        }else {
//            System.out.println("В группе не может быть больше " + MAXSTUDENTINGROUP + " студентов!");
        }
    }
    public Group(String nameGroup, String nameTeacher, Student student) {
        this(nameGroup, nameTeacher);
        this.groupStudent = new Student[]{student};

    }
    public Group(String nameGroup, String nameTeacher) {
        this.nameGroup = nameGroup;
        this.nameTeacher = nameTeacher;
    }

    public short getMAXSTUDENTINGROUP() {
        return MAXSTUDENTINGROUP;
    }

    public Student[] getGroupStudent() {
        return groupStudent;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setGroupStudent(Student[] groupStudent) {
        this.groupStudent = groupStudent;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (MAXSTUDENTINGROUP != group.MAXSTUDENTINGROUP) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(groupStudent, group.groupStudent)) return false;
        if (nameGroup != null ? !nameGroup.equals(group.nameGroup) : group.nameGroup != null) return false;
        return nameTeacher != null ? nameTeacher.equals(group.nameTeacher) : group.nameTeacher == null;
    }


    @Override
    public String toString() {
        return "Group{" +
                ", groupStudent=" + Arrays.toString(groupStudent) +
                ", nameGroup='" + nameGroup + '\'' +
                ", nameTeacher='" + nameTeacher + '\'' +
                '}';
    }
}
