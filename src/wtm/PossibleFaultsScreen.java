package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PossibleFaultsScreen {
	
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
		HBox buttons = new HBox(50);
		
		Label inputOneLabel   = new Label(" Test  Input 1: ");
		Label inputTwoLabel   = new Label("       Input 2: ");
		
		TextField inputOneField   = new TextField();
		TextField inputTwoField   = new TextField();
		setTextFieldSizes(inputOneField, inputTwoField);
		
		Button go = new Button("Go");
		Button back = new Button("Back");
		buttons.getChildren().addAll(back, go);
		buttons.setAlignment(Pos.CENTER);
		go.setOnMouseClicked(e -> possibleFaultsScreenAnswer(stage, inputOneField, inputTwoField));
		back.setOnMouseClicked(e -> startMainScreen(stage));
		
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
	
	private void possibleFaultsScreenAnswer(Stage stage, TextField inputOne, TextField inputTwo) {
		int inputOneInt = Integer.parseInt(inputOne.getText());
		int inputTwoInt = Integer.parseInt(inputTwo.getText());
		int resultInt = inputOneInt * inputTwoInt;
		
		PossibleFaultsScreenAnswer pfsa = new PossibleFaultsScreenAnswer();
		myScene = pfsa.init(stage, width, height, inputOneInt, inputTwoInt, resultInt);
		stage.setTitle("Possible Faults");
		stage.setScene(myScene);
		stage.show();
	}
	
	private void startMainScreen(Stage stage) {
		MainScreen mainScreen = new MainScreen();
		Scene scene = mainScreen.init(stage, width, height);
		stage.setScene(scene);
		stage.show();
	}

}
