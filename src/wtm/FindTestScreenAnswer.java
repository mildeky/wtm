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
	
	private String test;

	public Scene init(Stage stage, double w, double h, String test) {
		width = w;
		height = h;
		this.test = test;
		
		createLayout(stage);
		
		myScene = new Scene(layout, width, height);
		myScene.getStylesheets().add("style.css");
		
		return myScene;
	}

	private void createLayout(Stage stage) {
		layout = new VBox(100);
		
		HBox inputOneBox = new HBox();
		HBox inputTwoBox = new HBox();
		HBox buttons = new HBox(50);
		
		Label inputOneLabel   = new Label(" Test  Input 1: ");
		Label inputTwoLabel   = new Label("       Input 2: ");
		
		TextField inputOneField   = new TextField();
		TextField inputTwoField   = new TextField();
		setTextFieldSizes(inputOneField, inputTwoField);
		writeToFields(inputOneField, inputTwoField);
		
		Button exit = new Button("Exit");
		Button back = new Button("Back");
		buttons.getChildren().addAll(back, exit);
		buttons.setAlignment(Pos.CENTER);
		exit.setOnMouseClicked(e -> exit(stage));
		back.setOnMouseClicked(e -> findTestScreen(stage));
		
		inputOneBox.getChildren().addAll(inputOneLabel, inputOneField);
		inputTwoBox.getChildren().addAll(inputTwoLabel, inputTwoField);

		inputOneBox.setAlignment(Pos.CENTER);
		inputTwoBox.setAlignment(Pos.CENTER);
		
		layout.getChildren().addAll(inputOneBox, inputTwoBox, buttons);
		layout.setAlignment(Pos.CENTER);
	}
	
	private void setTextFieldSizes(TextField tf1, TextField tf2) {
		tf1.setMinSize(200, 50);
		tf2.setMinSize(200, 50);
	}
	
	private void writeToFields(TextField tf1, TextField tf2) {
		if(test.equals("53")) {
			tf1.setText("27");
			tf2.setText("69");
		}
		else if(test.equals("116")) {
			tf1.setText("89");
			tf2.setText("195");
		}
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
