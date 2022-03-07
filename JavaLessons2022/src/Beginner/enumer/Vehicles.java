package Beginner.enumer;

public enum Vehicles {
    PRICE1(1000), PRICE2(2000), PRICE3(3000);

Color color;
 int price;

    Vehicles(int price) {
        this.price = price;
    }
   public String carColor(){
        return color.name();
   }

    @Override
    public String toString() {
        return "Vehicles{" +
                "color=" + color +
                ", price=" + price +
                '}';
    }
}
