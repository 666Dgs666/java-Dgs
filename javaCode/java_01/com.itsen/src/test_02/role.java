package test_02;

import java.util.Random;

public class role {
    private String name;
    private int blood;
    private String gender;
    private String face;
    String[] boyFace={"风流倜傥","相貌英俊","道貌岸然"};
    String[] girlFace={"亭亭玉立","闭月羞花","惨不忍睹"};
    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public role() {
    }

    public role(String name, int blood,String gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;
        setFace(gender);
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String gender) {
        Random rc=new Random();
        if(gender=="男") {
            int index = rc.nextInt(boyFace.length);
            this.face = boyFace[index];
        }
        if(gender=="女") {
            int index = rc.nextInt(girlFace.length);
            this.face = girlFace[index];
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attact(role r) {
        Random rc = new Random();
        int index = rc.nextInt(attacks_desc.length);
        String kunFu = attacks_desc[index];

        //输出攻击描述
        System.out.printf(kunFu, this.name, r.getName());
        System.out.println();
        //重置血量
        int hurt = rc.nextInt(20) + 1;
        int remainBlood = r.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        r.setBlood(remainBlood);
        //输出受伤描述
        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], r.getName());
        } else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injureds_desc[1], r.getName());

        } else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injureds_desc[2], r.getName());
        } else if (remainBlood > 60 && remainBlood <= 70) {
            System.out.printf(injureds_desc[3], r.getName());
        } else if (remainBlood > 40 && remainBlood <= 60) {
            System.out.printf(injureds_desc[4], r.getName());

        } else if (remainBlood > 20 && remainBlood <= 40) {
            System.out.printf(injureds_desc[5], r.getName());
        }
        else if(remainBlood>10&&remainBlood<=20){
            System.out.printf(injureds_desc[6],r.getName());
        }
        else{
            System.out.printf(injureds_desc[7],r.getName());
        }
        System.out.println();
    }
            public void show(){
        System.out.println("姓名:"+this.getName());
        System.out.println("性别:"+this.getGender());
        System.out.println("血量:"+this.getBlood());
        System.out.println("相貌:"+this.getFace());
    }
}
