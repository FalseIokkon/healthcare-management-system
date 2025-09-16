import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML from file system
        FXMLLoader loader = new FXMLLoader(new File("frontend/DashBoard.fxml").toURI().toURL());
        Scene scene = new Scene(loader.load());

        primaryStage.setTitle("Healthcare Management System");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);  // Fullscreen
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
