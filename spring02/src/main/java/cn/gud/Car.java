package cn.gud;

/**
 * 方式一、调用默认无参构造函数创建 （ 此种方式用的最多）
 * 默认情况下，如果类中没有默认无参构造函数，则创建失败，会报异常
 */
public class Car {
    private String brand;
    private double price;
    public Car(){
        System.out.println("Car对象创建了 ");
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        System.out.println("set brand: " + brand);
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        System.out.println("set price: " + price);
        this.price = price;
    }
    @Override
    public String toString() {
        System.out.println("get the car string type");
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
