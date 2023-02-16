import java.awt.*;
import java.awt.geom.*;

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import org.jfree.fx.FXGraphics2D;

public class Spiral extends Application {

    double x;
    double y;

    Canvas canvas = new Canvas(1920 / 2, 1080 / 2);

    @Override
    public void start(Stage primaryStage) throws Exception {
        draw(new FXGraphics2D(canvas.getGraphicsContext2D()));
        primaryStage.setScene(new Scene(new Group(canvas)));
        primaryStage.setTitle("Spiral");
        primaryStage.show();
    }


    public void draw(FXGraphics2D graphics) {
        double newy = 0;
        double newx = 0;

        graphics.translate(this.canvas.getWidth() / 2, this.canvas.getHeight() / 2);
        graphics.scale(0.5, -0.5);

        for (double i = 0; i < 1000; i += 0.2) {
            newx = i/10 * i * Math.cos(i);
            newy = i/10 * i * Math.sin(i);
            graphics.drawLine((int) x, (int) y, (int) newx, (int) newy);
            x = newx;
            y = newy;
        }
    }


    public static void main(String[] args) {
        launch(Spiral.class);
    }

}
