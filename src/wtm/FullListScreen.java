package wtm;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FullListScreen {
	
	private double width;
	private double height;

	public Scene init(Stage stage, double w, double h) {
		width = w;
		height = h;
		createLayout(stage);
		return null;
	}

	private void createLayout(Stage stage) {
		VBox vbox = new VBox();
//		TextField textField = new TextField();
//		textField.setMinSize(400, 400);
		TextField textField = addTests();
		vbox.getChildren().add(textField);
	}

	private TextField addTests() {
		FileParser fp = new FileParser("FullList.xml");
		TextField textField = fp.create();
		return textField;
	}

}
