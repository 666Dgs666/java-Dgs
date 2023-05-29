package test_02;

public class GameTest {
    public static void main(String[] args) {
        role r1=new role("乔峰",100,"男");
        role r2=new role("鸠摩智",100,"男");
        r1.show();
        r2.show();
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
