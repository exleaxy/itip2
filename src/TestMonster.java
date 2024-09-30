public class TestMonster {
    public static void main(String[] args) {
        // Создание объектов разных наследников класса Monster
        Goblin goblin = new Goblin("Goblin", 50, 1.4, 120);
        Mermaid mermaid = new Mermaid("Mermaid", 65, 1.75, 40.0);
        Dragon dragon = new Dragon("Dragon", 550, 12, 400.0);

        // Вызов метода attack() для каждого монстра
        goblin.attack();
        mermaid.attack();
        dragon.attack();

        // Вывод информации о каждом монстре
        System.out.println(goblin);
        System.out.println(mermaid);
        System.out.println(dragon);

        // Показ счетчика созданных объектов
        System.out.println("Всего создано объектов: " + Monster.getInstanceCount());
    }
}
