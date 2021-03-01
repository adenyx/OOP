import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
    Figures figures = new Figures();

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 400, 300);
        figures.addLine(0, 0 , 400, 300, Color.RED, group);
        figures.addRectangle(20, 20, 100, 150, Color.BLACK, Color.GREEN, group);
        figures.addCircle(300, 30, 20, Color.YELLOW, group);
        figures.addPolygon(Color.VIOLET ,group);
        figures.addPolyline(Color.STEELBLUE, group);

        primaryStage.setTitle("First lab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}