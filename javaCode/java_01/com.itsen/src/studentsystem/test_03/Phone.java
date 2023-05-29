package studentsystem.test_03;

public class Phone {

    private String Brand;
    private int price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Phone() {
    }

    public Phone(String brand, int price) {
        Brand = brand;
        this.price = price;
    }
}
