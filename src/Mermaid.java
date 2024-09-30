public class Mermaid extends Monster {
    private double swimmingSpeed;

    public Mermaid(String name, double weight, double height, double swimmingSpeed) {
        super(name, weight, height);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Mermaid() {
        this("Mermaid", 60.0, 1.7, 30.5);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " использует плавание для атаки со скоростью: " + swimmingSpeed + " км/ч");
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " Mermaid [swimmingSpeed=" + swimmingSpeed + "]";
    }
}
