public class Flowers {
    private String name;
    private String colour;
    private int countStem;

    public Flowers(){

    }

    public Flowers(String name, String colour, int countStem) {
        this.name = name;
        this.colour = colour;
        this.countStem = countStem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCountStem() {
        return countStem;
    }

    public void setCountStem(int countStem) {
        this.countStem = countStem;
    }

    @Override
    public String toString() {
        return "Flowers: " +
                "name: " + this.name + ", " +
                "colour: " + this.colour + ", " +
                "countStem: " + this.countStem;
    }
}
