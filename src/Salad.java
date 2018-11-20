public class Salad implements MenuItem {
    private String name;
    private double price;

    public Salad(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
