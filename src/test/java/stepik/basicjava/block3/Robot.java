package stepik.basicjava.block3;

public class Robot {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() != toX ) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()){
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}

/**
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое:
 * robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 *
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 *
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 */