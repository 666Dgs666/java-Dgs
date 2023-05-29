package studentsystem.test_03;

import java.util.Scanner;

        public class MoneyDemo {
            public static void main(String[] args) {
                //1.键盘录入一个金额,判断金额是否有效
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入金额:");
                int money=sc.nextInt();
                String str1="";
                while (true) {
                    if(0<=money&&money<=999999999){
                        break;
                    }
                    else{
                        System.out.println("金额无效,请重新输入");
                    }
                }
                while (money!=0) {
                    int ge=money%10;
                    String s = toCapatilNumber(ge);
                    money/=10;
                    str1=s+str1;
                }
                int count=7-str1.length();
                for (int i = 0; i < count; i++) {
                    str1="零"+str1;
                }
                String result="";
        String[] Number2={"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < 7; i++) {
            char c=str1.charAt(i);
            result=result+c+Number2[i];
        }
        System.out.println(result);
    }

    public static  String toCapatilNumber(int a){
        String[] Number1={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return Number1[a];
    }
}
