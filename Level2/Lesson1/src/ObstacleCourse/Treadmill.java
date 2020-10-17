package ObstacleCourse;

import Players.OvercomingObstacle;
import Players.Players;

public class Treadmill implements OvercomingObstacle {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }


    @Override
    public boolean overcoming(Players player) {
        if (player.run(distance)) {
            return true;
        } else {
            return false;
        }
    }
}
