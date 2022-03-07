package Beginner.exeptions.task2;

public class Price {

    private String itemName;
    private String shopName;
    private double price;


    public Price(String itemName, String shopName, double price) {
        this.itemName = itemName;
        this.shopName = shopName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Price{" +
                "itemName='" + itemName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", price=" + price +
                '}';
    }
}
