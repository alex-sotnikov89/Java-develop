package Players;

public class Robot implements Players {
    private String model;
    private int fuel;

    public Robot(String model, int fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public void getFuelInfo() {
        System.out.println("Топлива осталось " + fuel);
    }

    @Override
    public boolean run(int distance) {
        fuel -= distance * 3;
        if (fuel < 0) {
            return false;
        } else {
            System.out.println(model + " пробежал " + distance + "м!");
            getFuelInfo();
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        fuel -= height*10;
        if (fuel < 0) {
            return false;
        } else {
            System.out.println(model + " перепрыгнул стену высотой " + height + "м!");
            getFuelInfo();
            return true;
        }
    }
}
