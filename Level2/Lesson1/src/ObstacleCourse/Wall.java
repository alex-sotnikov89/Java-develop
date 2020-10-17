package ObstacleCourse;

import Players.Players;
import Players.OvercomingObstacle;

public class Wall implements OvercomingObstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcoming(Players player) {
        if (player.jump(height)) {
            return true;
        } else {
            return false;
        }
    }
}
