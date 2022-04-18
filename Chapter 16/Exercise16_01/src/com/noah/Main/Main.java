package com.noah.Main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

@Override
public void start(Stage stage) {
	// array for setting text color based on radio buttons
	Color[] colorsRaw = {Color.RED, Color.BLUE, Color.BLACK, Color.ORANGE, Color.GREEN};
	// array for setting the text to the radio buttons corresponding to the colorsRaw array.
	String[] colors = {"Red", "Blue", "Black", "Orange", "Green"};
	// Radio buttons represented in an array to easily lay them out and manipulate values.
	RadioButton[] rSet = new RadioButton[5];
	
	Text cText = new Text("Programming is fun");
	cText.setScaleX(2);
	cText.setScaleY(2);
	
	// buttons to move left and right.
	Button l = new Button("<=");
	l.setOnMouseClicked(e -> handleLeft(cText, 500));
	l.setTextFill(Color.DARKGREEN);
	l.setStyle("-fx-background-color:#2fd68e;");
	
	Button r = new Button("=>");
	r.setOnMouseClicked(e -> handleRight(cText, 500));
	r.setTextFill(Color.DARKGREEN);
	r.setStyle("-fx-background-color:#2fd68e;");
	
	// container for radio buttons
	HBox rBox = new HBox();
	rBox.setAlignment(Pos.CENTER);
	rBox.setSpacing(20);
	rBox.setStyle("-fx-background-color: #49505c; -fx-padding: 20px;");
	
	ToggleGroup tg = new ToggleGroup();
	
	for(int i = 0; i < rSet.length; i++) {
		
		// populate radio button array with radio button elements with the text in the colors array
		rSet[i] = new RadioButton(colors[i]);
		rSet[i].setTextFill(Color.WHITE);
		
		// gets index i as final to use in lambda expression (for setOnMouseClick() event handler). 
		final Integer IND = new Integer(i);
		
		rSet[i].setOnMouseClicked(e -> cText.setFill(colorsRaw[IND]));
		
		// add radio button elements to container
		rBox.getChildren().add(rSet[i]);
		rSet[i].setToggleGroup(tg);
	}
	
	// container for text
	Pane txtPane = new Pane();
	txtPane.getChildren().add(cText);
	
	// container for buttons
	HBox btnBox = new HBox();
	btnBox.getChildren().addAll(l, r);
	btnBox.setAlignment(Pos.CENTER);
	btnBox.setStyle("-fx-background-color: #49505c; -fx-padding: 20px;");
	btnBox.setSpacing(20);
	
	BorderPane bp = new BorderPane();
	bp.setTop(rBox);
	bp.setCenter(cText);
	bp.setBottom(btnBox);
	
	
	Scene scene = new Scene(bp, 500, 400);
	
	stage.setTitle("Test");
	stage.setScene(scene);
	stage.setResizable(false);
	stage.show();
	}
	
	// move a text element left, sets barrier based on screen width
	public void handleLeft(Text t, double scrW) {
		if(-t.getTranslateX() < scrW / 3) {
			t.setTranslateX(t.getTranslateX() - 20);
		}
	
	}
	
	// move text element right, sets barrier based on screen width
	public void handleRight(Text t, double scrW) {
		if(t.getTranslateX() < scrW / 3) {
			t.setTranslateX(t.getTranslateX() + 20);
		}
	
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}

}