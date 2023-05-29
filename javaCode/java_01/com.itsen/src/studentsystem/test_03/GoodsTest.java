package studentsystem.test_03;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];
        Goods g1=new Goods("001","惠普战66",5999,10);
        Goods g2=new Goods("002","保温杯",50,110);
        Goods g3=new Goods("003","枸杞",28,66);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for(int i=0;i<3;i++){
            System.out.println(arr[i].getId()+"   "+arr[i].getName()+"   "+arr[i].getPrice()+"   "+arr[i].getCount());
        }
        }
}

