package stepik.javabasics.graphicaluserinterface.animations;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SimpleApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GameUnit gameUnit = new GameUnit(150, 0, 10, 10);
        Scene scene = new Scene(new Pane(gameUnit), 300, 275);
        scene.setOnKeyPressed(gameUnit);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class GameUnit extends Rectangle implements EventHandler<KeyEvent> {

        public GameUnit(double x, double y, double width, double height) {
            super(x, y, width, height);
            setFill(Color.BLACK);
        }

        private void checkInitBehavior() {
            if (behavior == null) {
                behavior = new GameUnitBehavior();
                new Thread(behavior).start();
            }
        }
        private GameUnitBehavior behavior;

        @Override
        public void handle(KeyEvent event) {
            checkInitBehavior();
            switch (event.getCode()) {
                case LEFT:
                    behavior.moveToSide(Side.LEFT);
                    break;
                case RIGHT:
                    behavior.moveToSide(Side.RIGHT);
                    break;
                case UP:
                    behavior.moveToSide(Side.TOP);
                    break;
                case DOWN:
                    behavior.moveToSide(Side.BOTTOM);
                    break;
            }
        }

        private class GameUnitBehavior extends Task {
            private boolean vertical = false;
            private boolean positive = false;
            private double step = 10.0;

            @Override
            protected Object call() throws Exception {
                while (getScene().getWindow().isShowing()) {
                    if (vertical) {
                        setX(getX() + (positive ? step : -step));
                    } else {
                        setY(getY() + (positive ? step : -step));
                    }
                    Thread.sleep(100);
                }
                return null;
            }

            public void moveToSide(Side side) {
                vertical = side.isVertical();
                positive = side == (vertical ? Side.RIGHT : Side.BOTTOM);
            }
        }
    }
}