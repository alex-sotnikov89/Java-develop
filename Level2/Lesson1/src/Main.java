import ObstacleCourse.Treadmill;
import ObstacleCourse.Wall;
import Players.*;

public class Main {

    public static void playChampionship(Players[] players, OvercomingObstacle[] obstacles){
        for (Players p : players) {
            for (OvercomingObstacle o : obstacles) {
                if (o.overcoming(p)) {
                    System.out.println("Препятствие преодолено!");
                }else{
                    System.out.println("Участник сошел с дистанции!");
                    System.out.println("------------------------------");
                    break;
                }
                System.out.println("------------------------------");
            }
        }
    }
    public static void main(String[] args) {
        Players[] players = {
                new Human("Petr", 100),
                new Cats("Barsik", 500),
                new Robot("R2-D2", 500),
        };

        OvercomingObstacle[] obstacle = {
                new Treadmill(20),
                new Wall(20),
                new Treadmill(20),
                new Wall(20),
                new Treadmill(20),
                new Treadmill(20),
        };
        playChampionship(players,obstacle);


//        for (int i = 0; i < players.length; i++) {
//            for (int j = 0; j < obstacle.length; j++) {
//                if (obstacle[j].overcoming(players[i])) {
//                    System.out.println("Препятствие преодолено!");
//                } else {
//                    System.out.println("Участник сошел с дистанции!");
//                    System.out.println("------------------------------");
//                    break;
//                }
//                System.out.println("------------------------------");
//            }
//        }


    }
}
