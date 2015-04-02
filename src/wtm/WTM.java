package wtm;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class WTM extends Application {
	
	private double width;
	private double height;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {	
		setTitle(stage);
		configureStage(stage);
		showStage(stage);
	}

	private void setTitle(Stage stage) {
		stage.setTitle("Wallace Tree Multiplier");	
	}

	private void configureStage(Stage stage) {
		Screen screen = Screen.getPrimary();
	    Rectangle2D bounds = screen.getVisualBounds();
	    
	    width = bounds.getWidth();
	    height = bounds.getHeight();
	    
	    setStageWidthHeight(stage, width, height);	
	}
	
	private void setStageWidthHeight(Stage stage, double width, double height) {	
		stage.setX(0);
		stage.setY(0);

		stage.setWidth(width);
		stage.setHeight(height);	
	}
	
	private void showStage(Stage stage) {
		MainScreen mainScreen = new MainScreen();
		Scene scene = mainScreen.init(stage, width, height);
		stage.setScene(scene);
		stage.show();	
	}

}
