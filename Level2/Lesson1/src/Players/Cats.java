package Players;

public class Cats implements Players {
    private String nickname;
    private int endurance;


    public Cats(String nickname, int endurance) {
        this.nickname = nickname;
        this.endurance = endurance;
    }

    public void getEnduranceInfo() {
        System.out.println("Выносливости осталось " + endurance);
    }

    @Override
    public boolean run(int distance) {
        endurance -= distance * 5;
        if (endurance < 0) {
            return false;
        } else {
            System.out.println(nickname + " пробежал " + distance + "м!");
            getEnduranceInfo();
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        endurance -= height*2;
        if (endurance < 0) {
            return false;
        } else {
            System.out.println(nickname + " перепрыгнул стену высотой " + height + "м!");
            System.out.println("Выносливости осталось " + endurance);
            return true;
        }
    }
}
