public abstract class Monster {
    private String name;
    private double weight;
    private double height;

    private static int instanceCount = 0;

    public Monster(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        instanceCount++;
    }

    public Monster() {
        this("Unknown", 0.0, 0.0);
    }

    public abstract void attack(); // Абстрактный метод, который будет реализован в подклассах

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String toString() {
        return "Monster [name=" + name + ", weight=" + weight + ", height=" + height + "]";
    }
}
