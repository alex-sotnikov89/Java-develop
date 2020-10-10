public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void getInfo() {
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int n) {
        if (food < n) {
            System.out.println("В миске нет столько еды!");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void addFood() {
        food += 100;
    }
}
