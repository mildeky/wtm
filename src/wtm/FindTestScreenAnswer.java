package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindTestScreenAnswer {
	
	private double width;
	private double height;
	private VBox layout;
	private Scene myScene;

	public Scene init(Stage stage, double w, double h) {
		width = w;
		height = h;
		
		createLayout(stage);
		
		myScene = new Scene(layout, width, height);
		myScene.getStylesheets().add("style.css");
		
		return myScene;
	}

	private void createLayout(Stage stage) {
		layout = new VBox(100);
		
		HBox inputOneBox = new HBox();
		HBox inputTwoBox = new HBox();
		HBox correctResBox = new HBox();
		HBox errorResBox = new HBox();
		HBox buttons = new HBox(50);
		
		Label inputOneLabel   = new Label(" Test  Input 1: ");
		Label inputTwoLabel   = new Label("       Input 2: ");
		Label correctResLabel = new Label("Correct Result: ");
		Label errorResLabel   = new Label("  Error Result: ");
		
		TextField inputOneField   = new TextField();
		TextField inputTwoField   = new TextField();
		TextField correctResField = new TextField();
		TextField errorResField   = new TextField();
		setTextFieldSizes(inputOneField, inputTwoField, correctResField, errorResField);
		writeToFields(inputOneField, inputTwoField, correctResField, errorResField);
		
		Button exit = new Button("Exit");
		Button back = new Button("Back");
		buttons.getChildren().addAll(back, exit);
		buttons.setAlignment(Pos.CENTER);
		exit.setOnMouseClicked(e -> exit(stage));
		back.setOnMouseClicked(e -> findTestScreen(stage));
		
		inputOneBox.getChildren().addAll(inputOneLabel, inputOneField);
		inputTwoBox.getChildren().addAll(inputTwoLabel, inputTwoField);
		correctResBox.getChildren().addAll(correctResLabel, correctResField);
		errorResBox.getChildren().addAll(errorResLabel, errorResField);
		inputOneBox.setAlignment(Pos.CENTER);
		inputTwoBox.setAlignment(Pos.CENTER);
		correctResBox.setAlignment(Pos.CENTER);
		errorResBox.setAlignment(Pos.CENTER);
		
		layout.getChildren().addAll(inputOneBox, inputTwoBox, correctResBox, errorResBox, buttons);
		layout.setAlignment(Pos.CENTER);
	}
	
	private void setTextFieldSizes(TextField tf1, TextField tf2, TextField tf3, TextField tf4) {
		tf1.setMinSize(200, 50);
		tf2.setMinSize(200, 50);
		tf3.setMinSize(200, 50);
		tf4.setMinSize(200, 50);
	}
	
	private void writeToFields(TextField tf1, TextField tf2, TextField tf3, TextField tf4) {
		//TODO: take values from map and write them
	}
	
	private void findTestScreen(Stage stage) {
		FindTestScreen fts = new FindTestScreen();
		myScene = fts.init(stage, width, height);
		stage.setTitle("Find Test");
		stage.setScene(myScene);
		stage.show();
	}
	
	private void exit(Stage stage) {
		stage.close();
	}

}
