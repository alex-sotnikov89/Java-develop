package Players;

import ObstacleCourse.Treadmill;
import ObstacleCourse.Wall;

public interface Players {
    boolean run(int distance);
    boolean jump(int height);
}
