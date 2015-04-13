package wtm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SampleListOfFaultsScreen {
	
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
		VBox One1 = new VBox();
		VBox One2 = new VBox();
		VBox Zero = new VBox();
		HBox all = new HBox(200);
		
		Text text1 = new Text("Wire 23 stuck-at-1");
		Text text2 = new Text("Wire 24 stuck-at-1");
		Text text3 = new Text("Wire 26 stuck-at-1");
		Text text4 = new Text("Wire 28 stuck-at-1");
		Text text5 = new Text("Wire 31 stuck-at-1");
		Text text6 = new Text("Wire 32 stuck-at-1");
		Text text7 = new Text("Wire 33 stuck-at-1");
		Text text8 = new Text("Wire 35 stuck-at-1");
		Text text9 = new Text("Wire 44 stuck-at-1");
		Text text10 = new Text("Wire 46 stuck-at-1");
		Text text11 = new Text("Wire 47 stuck-at-1");
		Text text12 = new Text("Wire 52 stuck-at-1");
		Text text13 = new Text("Wire 53 stuck-at-1");
		Text text14 = new Text("Wire 56 stuck-at-1");
		Text text15 = new Text("Wire 65 stuck-at-1");
		Text text16 = new Text("Wire 66 stuck-at-1");
		Text text17 = new Text("Wire 67 stuck-at-1");
		Text text18 = new Text("Wire 68 stuck-at-1");
		Text text19 = new Text("Wire 70 stuck-at-1");
		Text text20 = new Text("Wire 72 stuck-at-1");
		Text text21 = new Text("Wire 73 stuck-at-1");
		Text text22 = new Text("Wire 74 stuck-at-1");
		Text text23 = new Text("Wire 76 stuck-at-1");
		Text text24 = new Text("Wire 77 stuck-at-1");
		Text text25 = new Text("Wire 86 stuck-at-1");
		Text text26 = new Text("Wire 87 stuck-at-1");
		Text text27 = new Text("Wire 88 stuck-at-1");
		Text text28 = new Text("Wire 89 stuck-at-1");
		Text text29 = new Text("Wire 91 stuck-at-1");
		Text text30 = new Text("Wire 93 stuck-at-1");
		Text text31 = new Text("Wire 94 stuck-at-1");
		Text text32 = new Text("Wire 96 stuck-at-1");
		Text text33 = new Text("Wire 98 stuck-at-1");
		Text text34 = new Text("Wire 107 stuck-at-1");
		Text text35 = new Text("Wire 108 stuck-at-1");
		Text text36 = new Text("Wire 109 stuck-at-1");
		Text text37 = new Text("Wire 110 stuck-at-1");
		Text text38 = new Text("Wire 112 stuck-at-1");
		Text text39 = new Text("Wire 114 stuck-at-1");
		Text text40 = new Text("Wire 117 stuck-at-1");
		Text text41 = new Text("Wire 118 stuck-at-1");
		Text text42 = new Text("Wire 119 stuck-at-1");
		Text text43 = new Text("Wire 128 stuck-at-1");
		Text text44 = new Text("Wire 129 stuck-at-1");
		Text text45 = new Text("Wire 130 stuck-at-1");
		Text text46 = new Text("Wire 131 stuck-at-1");
		Text text47 = new Text("Wire 133 stuck-at-1");
		Text text48 = new Text("Wire 137 stuck-at-1");
		Text text49 = new Text("Wire 138 stuck-at-1");
		Text text50 = new Text("Wire 140 stuck-at-1");
		Text text51 = new Text("Wire 149 stuck-at-1");
		Text text52 = new Text("Wire 150 stuck-at-1");
		Text text53 = new Text("Wire 151 stuck-at-1");
		Text text54 = new Text("Wire 153 stuck-at-1");
		Text text55 = new Text("Wire 154 stuck-at-1");
		Text text56 = new Text("Wire 157 stuck-at-1");
		Text text57 = new Text("Wire 159 stuck-at-1");
		Text text58 = new Text("Wire 161 stuck-at-1");
		Text text59 = new Text("Wire 164 stuck-at-1");
		Text text60 = new Text("Wire 166 stuck-at-1");
		Text text61 = new Text("Wire 168 stuck-at-1");
		
		Text text62 = new Text("Wire 25 stuck-at-0");
		Text text63 = new Text("Wire 27 stuck-at-0");
		Text text64 = new Text("Wire 29 stuck-at-0");
		Text text65 = new Text("Wire 30 stuck-at-0");
		Text text66 = new Text("Wire 34 stuck-at-0");
		Text text67 = new Text("Wire 45 stuck-at-0");
		Text text68 = new Text("Wire 48 stuck-at-0");
		Text text69 = new Text("Wire 49 stuck-at-0");
		Text text70 = new Text("Wire 50 stuck-at-0");
		Text text71 = new Text("Wire 51 stuck-at-0");
		Text text72 = new Text("Wire 54 stuck-at-0");
		Text text73 = new Text("Wire 55 stuck-at-0");
		Text text74 = new Text("Wire 69 stuck-at-0");
		Text text75 = new Text("Wire 71 stuck-at-0");
		Text text76 = new Text("Wire 75 stuck-at-0");
		Text text77 = new Text("Wire 90 stuck-at-0");
		Text text78 = new Text("Wire 92 stuck-at-0");
		Text text79 = new Text("Wire 95 stuck-at-0");
		Text text80 = new Text("Wire 97 stuck-at-0");
		Text text81 = new Text("Wire 111 stuck-at-0");
		Text text82 = new Text("Wire 113 stuck-at-0");
		Text text83 = new Text("Wire 115 stuck-at-0");
		Text text84 = new Text("Wire 116 stuck-at-0");
		Text text85 = new Text("Wire 132 stuck-at-0");
		Text text86 = new Text("Wire 134 stuck-at-0");
		Text text87 = new Text("Wire 135 stuck-at-0");
		Text text88 = new Text("Wire 136 stuck-at-0");
		Text text89 = new Text("Wire 139 stuck-at-0");
		Text text90 = new Text("Wire 152 stuck-at-0");
		Text text91 = new Text("Wire 155 stuck-at-0");
		Text text92 = new Text("Wire 156 stuck-at-0");
		Text text93 = new Text("Wire 158 stuck-at-0");
		Text text94 = new Text("Wire 160 stuck-at-0");
		Text text95 = new Text("Wire 170 stuck-at-0");
		Text text96 = new Text("Wire 172 stuck-at-0");
		Text text97 = new Text("Wire 174 stuck-at-0");

		One1.getChildren().addAll(text1, text2, text3, text4, text5, text6, text7, text8, text9,
				text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, 
				text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, 
				text30, text31);
		One1.setAlignment(Pos.CENTER);
		One2.getChildren().addAll(text32, text33, text34, text35, text36, text37, text38, text39, 
				text40, text41, text42, text43, text44, text45, text46, text47, text48, text49, 
				text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, 
				text60, text61);
		One2.setAlignment(Pos.CENTER);
		Zero.getChildren().addAll(text62, text63, text64, text65, text66, text67, text68, text69,
				text70, text71, text72, text73, text74, text75, text76, text77, text78, text79, 
				text80, text81, text82, text83, text84, text85, text86, text87, text88, text89, 
				text90, text91, text92, text93, text94, text95, text96, text97);
		Zero.setAlignment(Pos.CENTER);
		all.getChildren().addAll(One1, One2, Zero);
		all.setAlignment(Pos.CENTER);
		
		layout.getChildren().add(all);
		layout.setAlignment(Pos.CENTER);
		
	}

}
