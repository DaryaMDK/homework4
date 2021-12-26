public class Main {
    public static void main(String[] args) {
        Bushes bush = new Bushes("jasmine", "blue", 150);
        System.out.println(bush);

        Trees tree = new Trees();
        tree.setName("birch");
        tree.setCountBranches(1000);
        tree.setTimeOfLife(200);
        System.out.println(tree);

        Trees tree2 = new Trees("oak", 1200, 170);
        System.out.println(tree2);

        Flowers flower = new Flowers();
        flower.setName("roze");
        flower.setColour("red");
        flower.setCountStem(12);
        System.out.println(flower);

        Flowers flower2 = new Flowers("tulip", "pink", 15);
        System.out.println(flower2);
    }
}
