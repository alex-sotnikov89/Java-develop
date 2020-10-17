package Players;

public class Human implements Players {
    private String name;
    private int endurance;

    public Human(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
    }

    public void getEnduranceInfo() {
        System.out.println("Выносливости осталось " + endurance);
    }

    @Override
    public boolean run(int distance) {
        endurance -= distance * 2;
        if (endurance < 0) {
            return false;
        } else {
            System.out.println(name + " пробежал " + distance + "м!");
            getEnduranceInfo();
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        endurance -= height;
        if (endurance < 0) {
            return false;
        } else {
            System.out.println(name + " перепрыгнул стену высотой " + height + "м!");
            getEnduranceInfo();
            return true;
        }
    }

}
