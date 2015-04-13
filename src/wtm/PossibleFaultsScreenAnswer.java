package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PossibleFaultsScreenAnswer {
	
	private double width;
	private double height;
	private VBox layout;
	private Scene myScene;

	public Scene init(Stage stage, double w, double h, int inputOneInt, int inputTwoInt, int resultInt) {
		width = w;
		height = h;
		
		createLayout(stage, inputOneInt, inputTwoInt, resultInt);
		
		myScene = new Scene(layout, width, height);
		myScene.getStylesheets().add("style.css");
		
		return myScene;
	}

	private void createLayout(Stage stage, int inputOne, int inputTwo, int result) {
		layout = new VBox(100);
		
		HBox correctResBox = new HBox();
		HBox listBox = new HBox();
		HBox buttons = new HBox(50);
		
		Label correctResLabel = new Label("Correct Result: ");
		Label listLabel   = new Label("List of Possible Faults: ");
		
		TextField correctResField = new TextField();
		setTextFieldSizes(correctResField);
		writeToFields(correctResField, inputOne, inputTwo);
			
		Button list = new Button("List");	
		Button exit = new Button("Exit");
		Button back = new Button("Back");
		buttons.getChildren().addAll(back, exit);
		buttons.setAlignment(Pos.CENTER);
		list.setOnMouseClicked(e -> showList(stage));
		back.setOnMouseClicked(e -> possibleFaultsScreen(stage));
		exit.setOnMouseClicked(e -> exit(stage));
		
		correctResBox.getChildren().addAll(correctResLabel, correctResField);
		listBox.getChildren().addAll(listLabel, list);
		correctResBox.setAlignment(Pos.CENTER);
		listBox.setAlignment(Pos.CENTER);
		
		layout.getChildren().addAll(correctResBox, listBox, buttons);
		layout.setAlignment(Pos.CENTER);
	}
	
	private void setTextFieldSizes(TextField tf1) {
		tf1.setMinSize(200, 50);
	}
	
	private void writeToFields(TextField tf, int inputOne, int inputTwo) {
		int result = inputOne * inputTwo;
		String resString = Integer.toString(result);
		tf.setText(resString);
	}
	
	private void possibleFaultsScreen(Stage stage) {
		PossibleFaultsScreen pfs = new PossibleFaultsScreen();
		myScene = pfs.init(stage, width, height);
		stage.setTitle("Find Possible Faults");
		stage.setScene(myScene);
		stage.show();
	}
	
	private void showList(Stage stage) {
		SampleListOfFaultsScreen slofs = new SampleListOfFaultsScreen();
		myScene = slofs.init(stage, width, height);
		stage.setTitle("List of Detectable Faults");
		stage.setScene(myScene);
		stage.show();
	}
	
	private void exit(Stage stage) {
		stage.close();
	}

}
