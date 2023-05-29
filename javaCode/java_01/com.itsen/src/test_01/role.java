package test_01;

import java.util.Random;

public class role {
    private String name;
    private int blood;

    public role() {
    }

    public role(String name, int blood) {
        this.name = name;
        this.blood = blood;
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

    public void attact(role r)
    {
         Random rc=new Random();
         int hurt=rc.nextInt(20)+1;
         int RemainBlood=r.getBlood()-hurt;
         RemainBlood=RemainBlood<0?0:RemainBlood;
         r.setBlood(RemainBlood);
        System.out.println(this.getName()+"举起拳头打了"+r.getName()+"造成了"+hurt+"点伤害"+r.getName()+"还剩"+RemainBlood+"滴血");

    }

}
