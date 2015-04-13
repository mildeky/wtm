package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FullListScreen {
	
	private double width;
	private double height;
	private VBox layout;
	private Scene myScene;

	public Scene init(Stage stage, double w, double h) {
		width = w;
		height = h;
		
		createLayout(stage);
		
		myScene = new Scene(layout, width, height);
		
		return myScene;
	}

	private void createLayout(Stage stage) {
		layout = new VBox();
		VBox vb1 = new VBox(5);
		VBox vb2 = new VBox(5);
		HBox all = new HBox(200);
		
		Text test1 = new Text("78 * 83");
		Text test2 = new Text("27 * 69");
		Text test3 = new Text("89 * 195");
		Text test4 = new Text("124 * 96");
		Text test5 = new Text("34 * 55");
		Text test6 = new Text("107 * 158");
		Text test7 = new Text("42 * 246");
		Text test8 = new Text("47 * 81");
		Text test9 = new Text("188 * 162");
		Text test10 = new Text("50 * 182");
		Text test11 = new Text("20 * 197");
		Text test12 = new Text("229 * 61");
		Text test13 = new Text("118 * 215");
		Text test14 = new Text("9 * 13");
		Text test15 = new Text("126 * 39");
		Text test16 = new Text("223 * 96");
		Text test17 = new Text("117 * 6");
		Text test18 = new Text("104 * 12");
		Text test19 = new Text("21 * 218");
		Text test20 = new Text("194 * 66");
		Text test21 = new Text("96 * 128");
		Text test22 = new Text("220 * 5");
		Text test23 = new Text("245 * 156");
		Text test24 = new Text("133 * 38");
		Text test25 = new Text("52 * 94");
		Text test26 = new Text("150 * 91");
		Text test27 = new Text("226 * 196");
		Text test28 = new Text("206 * 107");
		Text test29 = new Text("199 * 119");
		Text test30 = new Text("214 * 204");
		Text test31 = new Text("48 * 250");
		Text test32 = new Text("66 * 16");
		Text test33 = new Text("222 * 184");
		Text test34 = new Text("157 * 217");
		Text test35 = new Text("213 * 140");
		Text test36 = new Text("125 * 37");
		Text test37 = new Text("198 * 38");
		Text test38 = new Text("172 * 18");
		Text test39 = new Text("190 * 0");
		Text test40 = new Text("20 * 145");
		Text test41 = new Text("163 * 166");
		Text test42 = new Text("188 * 129");
		Text test43 = new Text("151 * 242");
		Text test44 = new Text("125 * 113");
		Text test45 = new Text("38 * 123");
		Text test46 = new Text("18 * 165");
		Text test47 = new Text("168 * 209");
		Text test48 = new Text("107 * 51");
		Text test49 = new Text("40 * 67");		
		Text test50 = new Text("210 * 52");
		Text test51 = new Text("232 * 167");
		Text test52 = new Text("148 * 1");
		Text test53 = new Text("48 * 130");
		Text test54 = new Text("65 * 72");
		Text test55 = new Text("96 * 21");
		Text test56 = new Text("155 * 41");
		Text test57 = new Text("17 * 226");
		Text test58 = new Text("254 * 20");
		Text test59 = new Text("28 * 158");
		Text test60 = new Text("190 * 222");
		
		vb1.getChildren().addAll(test1, test2, test3, test4, test5, test6, test7, test8, test9,
				test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, 
				test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30);
		vb1.setAlignment(Pos.CENTER);
		vb2.getChildren().addAll(test31, test32, test33, test34, test35, test36, test37, test38, test39, 
				test40, test41, test42, test43, test44, test45, test46, test47, test48, test49, 
				test50, test51, test52, test53, test54, test55, test56, test57, test58, test59, test60);
		vb2.setAlignment(Pos.CENTER);
		
		all.getChildren().addAll(vb1, vb2);
		all.setAlignment(Pos.CENTER);
		
		layout.getChildren().add(all);
		layout.setAlignment(Pos.CENTER);
		
	}


}
