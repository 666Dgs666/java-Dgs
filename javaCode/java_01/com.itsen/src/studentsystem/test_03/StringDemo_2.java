package studentsystem.test_03;

import jdk.swing.interop.SwingInterOpUtils;

public class StringDemo_2 {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        String s = arrToString(arr);
        System.out.println(s);

        /*String phoneNumber="15115935407";
        String start=phoneNumber.substring(0,3);
        String end=phoneNumber.substring(7);
        String result=start+"****"+end;
        System.out.println(result);*/
//        String id="430528200402040516";
//        String year = id.substring(6, 10);
//        String month = id.substring(10, 12);
//        String day = id.substring(12, 14);
//        System.out.println("人物信息为:");
//        System.out.println("出生日期:"+year+"年"+month+"月"+day+"日");
//        char gender=id.charAt(16);
//        int num=gender-'0';
//        if(num%2==0){
//            System.out.println("性别:女");
//        }
//        else{
//            System.out.println("性别:男");
//        }
        /*String talk="你玩的真好下次不要再玩了,TMD,SB";
        String[] arr={"TMD","SB","CNM","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);*/

    }
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
