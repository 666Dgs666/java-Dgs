package interface01;

public class BasketballCoach extends Coach implements StudyEnglish{


    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球运动员在教打篮球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员在学习英语");
    }
}
