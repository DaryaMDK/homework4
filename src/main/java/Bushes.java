public class Bushes {
    private String name;
    private String colour;
    private int price;

    public Bushes(String name, String colour, int price){
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bushes: " +
                "name: " + this.name + ", " +
                "colour: " + this.colour  + ", " +
                "price: " + this.price;
    }
}
