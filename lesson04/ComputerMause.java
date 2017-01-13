package EasyCodeHomeWork.lesson04;

/**
 * Created by vivat on 29.12.2016.
 */
public class ComputerMause {
    public String model;

    public String getModel() {
        return model;
    }

    public int speedMause = 1;

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeedMause(int speedMause) {
        this.speedMause = speedMause;
    }

    public void setWorkTime(float workTime) {
        this.workTime = workTime;
    }

    public float workTime = 0;
    private int startPositionX = 0;
    private int startPositiony = 0;

    public float retPositionX( ) {
        return startPositionX + (speedMause * workTime);
    }

    public float retPositiony( ) {
        return startPositiony + (speedMause * workTime);
    }
}
