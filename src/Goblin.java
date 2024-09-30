public class Goblin extends Monster {
    private int intelligence;

    public Goblin(String name, double weight, double height, int intelligence) {
        super(name, weight, height);
        this.intelligence = intelligence;
    }

    public Goblin() {
        this("Goblin", 40.0, 1.2, 100);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " атакует хитростью с уровнем интеллекта: " + intelligence);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return super.toString() + " Goblin [intelligence=" + intelligence + "]";
    }
}
