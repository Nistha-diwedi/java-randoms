class Car {
    int speed;
    double regularPrice;
    String color;
    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    double getSalePrice() {
        return regularPrice;
    }
}
class Truck extends Car {
    int weight;
    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice * 0.8;
        }
    }
}
class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    double getSalePrice() {
        double salePrice = super.getSalePrice();
        return salePrice - manufacturerDiscount;
    }
}
class Sedan extends Car {
    int length;
    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.9;
        }
    }
}
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(65, 2700000, "Silver", 18);
        Ford ford1 = new Ford(70, 2500000, "Black", 2022, 1500);
        Ford ford2 = new Ford(75, 2800000, "White", 2021, 1200);
        Car car = new Car(55, 1500000, "Green");
        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
        System.out.println("Ford1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford2 Sale Price: " + ford2.getSalePrice());
        System.out.println("Car Sale Price: " + car.getSalePrice());
    }
}
