public class Trees {
    private String name;
    private int branches;
    private int timeOfLife;

    public Trees() {
    }

    public Trees(String name, int branches, int timeOfLife){
        this.name = name;
        this.branches = branches;
        this.timeOfLife = timeOfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountStem() {
        return branches;
    }

    public void setCountBranches(int branches) {
        this.branches = branches;
    }

    public int getTimeOfLife() {
        return timeOfLife;
    }

    public void setTimeOfLife(int timeOfLife) {
        this.timeOfLife = timeOfLife;
    }

    @Override
    public String toString() {
        return "Trees: " +
                "name: " + this.name + ", " +
                "branches: " + this.branches + ", " +
                "timeOfLife: " + this.timeOfLife;
    }
}
