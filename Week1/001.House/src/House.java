import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import org.jfree.fx.FXGraphics2D;

public class House extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(960, 540);
        draw(new FXGraphics2D(canvas.getGraphicsContext2D()));
        primaryStage.setScene(new Scene(new Group(canvas)));
        primaryStage.setTitle("House");
        primaryStage.show();
    }


    public void draw(FXGraphics2D graphics) {
        //walls
        graphics.drawLine(100, 100,100,150);
        graphics.drawLine(200,150, 200, 100);
        graphics.drawLine(300, 85, 300, 135);
        //roof
        graphics.drawLine(100,100,150, 50);
        graphics.drawLine(150, 50, 200, 100);
        graphics.drawLine(150, 50, 250, 35);
        graphics.drawLine(200, 100, 300, 85);
        graphics.drawLine(250, 35, 300, 85);
        //floor
        graphics.drawLine(100,150,200, 150);
        graphics.drawLine(200, 150, 300, 135);
        //door
        graphics.drawLine(115, 115, 135, 115);
        graphics.drawLine(115, 150,115,115);
        graphics.drawLine(135, 115, 135,150);
        //window
        graphics.drawLine(145, 115, 145, 135);
        graphics.drawLine(185, 115, 185, 135);
        graphics.drawLine(145, 115, 185,115);
        graphics.drawLine(145, 135, 185, 135);
    }



    public static void main(String[] args) {
        launch(House.class);
    }

}
