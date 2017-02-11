package EasyCodeHomeWork.lesson04;

public class HomeWork {

    private String team;
    private short namber;
    private String head;
    private String text;

    public HomeWork(String team, short namber, String head, String text) {
        this.team = team;
        this.namber = namber;
        this.head = head;
        this.text = text;
    }

    public String getTeam() {
        return team;
    }

    public short getNamber() {
        return namber;
    }

    public String getHead() {
        return head;
    }

    public String getText() {
        return text;
    }

    public void setNamber(short namber) {
        this.namber = namber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeWork homeWork = (HomeWork) o;

        if (namber != homeWork.namber) return false;
        if (team != null ? !team.equals(homeWork.team) : homeWork.team != null) return false;
        if (head != null ? !head.equals(homeWork.head) : homeWork.head != null) return false;
        return text != null ? text.equals(homeWork.text) : homeWork.text == null;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "team='" + team + '\'' +
                ", namber=" + namber +
                ", head='" + head + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
