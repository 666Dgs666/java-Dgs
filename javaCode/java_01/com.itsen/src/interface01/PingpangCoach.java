package interface01;

public class PingpangCoach extends Coach {

    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教打篮球");
    }
}
