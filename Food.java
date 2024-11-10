public class Food {
    private String name;
    private int price;

    public Food(String name,int price) {
        setName(name);
        setPrice(price);
    }

    public String getFoodName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Food\t" + getFoodName() +
                "price:\t" + getPrice();
    }
}
