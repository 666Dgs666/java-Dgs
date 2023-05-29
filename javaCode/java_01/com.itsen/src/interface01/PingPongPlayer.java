package interface01;

public class PingPongPlayer extends Athlete implements StudyEnglish {

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员在学习英语");
    }
}
