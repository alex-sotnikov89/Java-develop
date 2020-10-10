public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 100),
                new Cat("Maylo", 100),
                new Cat("Weider", 100)
        };
        Plate plate = new Plate(200);

        plate.getInfo();

        for (int i = 0; i < cats.length; i++) {
            cats[i].haveDinner(plate);
            System.out.println("--------------------");
        }
        plate.getInfo();
        plate.addFood();
        plate.getInfo();
    }
}
