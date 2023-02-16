import java.awt.*;
import java.awt.geom.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import org.jfree.fx.FXGraphics2D;

public class Rainbow extends Application {
    Canvas canvas = new Canvas(1920/2, 1080/2);
    double x1;
    double x2;
    double y1;
    double y2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        draw(new FXGraphics2D(canvas.getGraphicsContext2D()));
        primaryStage.setScene(new Scene(new Group(canvas)));
        primaryStage.setTitle("Rainbow");
        primaryStage.show();
    }
    
    
    public void draw(FXGraphics2D graphics) {
        graphics.translate(this.canvas.getWidth()/2, this.canvas.getHeight()/2);
        graphics.scale( 1, -1);

        int j;

        for (double i = 0; i < Math.PI; i+=0.001) {
            x1 = 30 * Math.cos(i);
            y1 = 30 * Math.sin(i);
            x2 = 200 * Math.cos(i);
            y2 = 200 * Math.sin(i);
            graphics.setColor(Color.getHSBColor((float)(i / Math.PI), 1, 1));
            graphics.drawLine((int)x1,(int)y1,(int)x2,(int)y2);

        }
    }
    
    
    
    public static void main(String[] args) {
        launch(Rainbow.class);
    }

}
