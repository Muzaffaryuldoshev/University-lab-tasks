package lab_class_4;

public class Car {

     private String model;
     private String brand;
     private int year;
     private String color;
     private int price;
     private int quantity;


    public Car(String model, String brand, int year, String color, int price, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.quantity = quantity;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    public static void main(String[] args) {
        Car newCar = new Car("Tesla", "Model Y", 2019,"Black", 184990, 1 );
        System.out.println(newCar);
    }
}
