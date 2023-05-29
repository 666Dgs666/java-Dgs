package test_01;

public class GameTest {
    public static void main(String[] args) {
        role r1=new role("乔峰",100);
        role r2=new role("鸠摩智",100);
        while(true){
            r1.attact(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"ko了"+r2.getName());
                break;
            }
            r2.attact(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"ko了"+r1.getName());
                break;
            }
        }
        }
}
