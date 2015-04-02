package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindTestScreen {
	
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
		layout = new VBox(150);
		HBox wireBox = new HBox();
		HBox stuckAtBox = new HBox();
		
		Label wireLabel = new Label("Wire: ");
		Label stuckAtLabel = new Label("Stuck-at- ");
		
		TextField wireField = new TextField();
		TextField stuckAtField = new TextField();
		setTextFieldSizes(wireField, stuckAtField);
		
		Button go = new Button("Go");
		go.setOnMouseClicked(e -> findTestResults());
		
		wireBox.getChildren().addAll(wireLabel, wireField);
		stuckAtBox.getChildren().addAll(stuckAtLabel, stuckAtField);
		wireBox.setAlignment(Pos.CENTER);
		stuckAtBox.setAlignment(Pos.CENTER);
		
		layout.getChildren().addAll(wireBox, stuckAtBox, go);
		layout.setAlignment(Pos.CENTER);
	}

	private void setTextFieldSizes(TextField wireField, TextField stuckAtField) {
		wireField.setMinSize(200, 50);
		stuckAtField.setMinSize(200, 50);
	}
	
	private Object findTestResults() {
		// TODO Auto-generated method stub
		return null;
	}

}
