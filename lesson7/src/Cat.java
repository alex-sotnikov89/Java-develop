public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    public void getSatietyInfo() {
        System.out.println("Сытость: " + satiety);
    }

    public void haveDinner(Plate plate) {
        while (true) {
            eat(plate);
            if (satiety) {
                System.out.println(name + " поел!");
                break;
            } else {
                System.out.println(name + " не поел!");
                System.out.println("Добавим еды!");
                plate.addFood();
            }
        }
        getSatietyInfo();
    }

}
