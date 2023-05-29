package studentsystem.test_03;

public class TestDemo2 {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        boolean flag=checkequal(str1,str2);
        System.out.println(flag);
    }
    public static boolean checkequal(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            str1=rotate(str1);
            if(str1.equals(str2))
            {
                return true;
            }
        }
        return false;
    }
    public static String rotate(String str1){
        char c=str1.charAt(0);
        str1=str1.substring(1);
        str1=str1+c;
        return str1;
    }
}
