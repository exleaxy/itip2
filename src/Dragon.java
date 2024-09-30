public class Dragon extends Monster {
    private double firePower;

    public Dragon(String name, double weight, double height, double firePower) {
        super(name, weight, height);
        this.firePower = firePower;
    }

    public Dragon() {
        this("Dragon", 500.0, 10.0, 300.0);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " атакует мощным огненным дыханием с силой огня: " + firePower + " ед.");
    }

    public double getFirePower() {
        return firePower;
    }

    public void setFirePower(double firePower) {
        this.firePower = firePower;
    }

    @Override
    public String toString() {
        return super.toString() + " Dragon [firePower=" + firePower + "]";
    }
}
