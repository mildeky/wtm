package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainScreen {
	
	private Scene myScene;
	private VBox buttons;
	private double width;
	private double height;

	public Scene init(Stage stage, double w, double h) {
		width = w;
		height = h;
		createLayout(stage);	
		myScene = new Scene(buttons, width, height);	
		myScene.getStylesheets().add("style.css");
		return myScene;
	}

	private void createLayout(Stage stage) {
		Button findTest = new Button("Find a Test for a Specific Fault");
		Button possibleFaults = new Button("Find a List of Possible Faults\n        for a Specific Test");
		Button fullList = new Button("Complete List of Tests");
		
		findTest.setOnMouseClicked(e -> findTestScreen(stage));
		possibleFaults.setOnMouseClicked(e -> possibleFaultsScreen(stage));
		fullList.setOnMouseClicked(e -> fullListScreen(stage));
		
		buttons = new VBox(100);
		setButtonSizes(findTest, possibleFaults, fullList);
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().addAll(findTest, possibleFaults, fullList);	
	}
	
	private void setButtonSizes(Button findTest, Button possibleFaults,
			Button fullList) {
		findTest.setPrefSize(500, 200);
		possibleFaults.setPrefSize(500, 200);
		fullList.setPrefSize(500, 200);
	}

	private void findTestScreen(Stage stage) {
		FindTestScreen fts = new FindTestScreen();
		myScene = fts.init(stage, width, height);
		stage.setTitle("Find Test");
		stage.setScene(myScene);
		stage.show();
	}

	private void possibleFaultsScreen(Stage stage) {
		PossibleFaultsScreen pfs = new PossibleFaultsScreen();
		myScene = pfs.init(stage, width, height);
		stage.setTitle("Find Possible Faults");
		stage.setScene(myScene);
		stage.show();
	}

	private void fullListScreen(Stage stage) {
		FullListScreen fls = new FullListScreen();
		myScene = fls.init(stage, width, height);
		stage.setTitle("Full List of Faults");
		stage.setScene(myScene);
		stage.show();
	}

}
