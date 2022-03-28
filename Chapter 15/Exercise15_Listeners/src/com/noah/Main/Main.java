package com.noah.Main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
	
	private double x, y = 0;
	private double sWidth = 250, sHeight = 150;
	Circle circle = new Circle(15.0f, Color.WHITE);
	
	
	@Override
	public void start(Stage stage) {
		circle.setStroke(Color.BLACK);
		
		double btnWidth = 100;
		
		Button btnUp = new Button("Up");
		btnUp.setOnAction(e -> handleCircleUp(10));
		
		Button btnDown = new Button("Down");
		btnDown.setOnAction(e -> handleCircleDown(10));
		
		Button btnLeft = new Button("Left");
		btnLeft.setOnAction(e -> handleCircleLeft(10));
		
		Button btnRight = new Button("Right");
		btnRight.setOnAction(e -> handleCircleRight(10));

		btnUp.setPrefWidth(btnWidth);
		btnDown.setPrefWidth(btnWidth);
		btnLeft.setPrefWidth(btnWidth);
		btnRight.setPrefWidth(btnWidth);
		
		HBox hbox = new HBox();
		hbox.getChildren().add(btnUp);
		hbox.getChildren().add(btnDown);
		hbox.getChildren().add(btnLeft);
		hbox.getChildren().add(btnRight);
		hbox.setAlignment(Pos.CENTER);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(circle);
		pane.setBottom(hbox);
		pane.setAlignment(hbox, Pos.CENTER);
		
		Scene s = new Scene(pane, 250, 150);
		
		s.setOnKeyPressed(e -> {
			int increment = 2;
			
			switch(e.getCode()) {
				case W: 
					handleCircleUp(increment);
					break;
				case S:
					handleCircleDown(increment);
					break;
				case A:
					handleCircleLeft(increment);
					break;
				case D:
					handleCircleRight(increment);
			} 
			
			handleBounderies(increment);
			
			stage.setTitle(x + " " + y);
		});
		
		stage.setTitle(x + " " + y);
		stage.setScene(s);
		stage.show();
	}
	public void handleCircleUp(int increment) {
		y = circle.getCenterY() - increment + y;
		
		circle.setTranslateX(x);
		circle.setTranslateY(y);
		
		handleBounderies(increment);
	}
	public void handleCircleDown(int increment) {
		y = circle.getCenterY() + increment + y;
		
		circle.setTranslateX(x);
		circle.setTranslateY(y);
		
		handleBounderies(increment);
	}
	public void handleCircleLeft(int increment) {
		x = circle.getCenterY() - increment + x;
		
		circle.setTranslateX(x);
		circle.setTranslateY(y);
		
		handleBounderies(increment);
	}
	public void handleCircleRight(int increment) {
		x = circle.getCenterY() + increment + x;
		
		circle.setTranslateX(x);
		circle.setTranslateY(y);
		
		handleBounderies(increment);
	}
	public void handleBounderies(int increment) {
		if(y < -((sHeight / 2) - 20)) {
			y += increment;
		} else if(y > (sHeight / 2) - 20) {
			y -= increment;
		}
		
		if(x <= -((sWidth / 2) - 10)) {
			x += increment;
		} else if(x > (sWidth / 2) - 10) {
			x -= increment;
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
