package com.noah.Main;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpinskiTriangle extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane(); 

    Button sub = new Button("-"), add = new Button("+");
    
    HBox hBox = new HBox(10);
    hBox.getChildren().addAll(sub, add);
    hBox.setAlignment(Pos.CENTER);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(trianglePane);
    borderPane.setBottom(hBox);
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 200, 210);
    primaryStage.setTitle("SierpinskiTriangle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    scene.widthProperty().addListener(ov -> trianglePane.paint());
    scene.heightProperty().addListener(ov -> trianglePane.paint());
  }
  
  // adds or subtracts from o based on m (0 = sub, 1 = add)
  public int handleAddSub(int m, int o) {
	  int res = o;

	  if(m == 0 && o > 0) {
		res--;  
	  } else if(m == 1) {
		res++;
	  }
	  
	  return res;
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
