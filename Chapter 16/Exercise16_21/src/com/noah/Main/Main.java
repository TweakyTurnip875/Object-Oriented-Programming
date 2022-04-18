package com.noah.Main;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.media.*;

public class Main extends Application {
    int user = 0; // seconds to be counted down
    TextField input = new TextField(); // text field input for count down

    @Override
    public void start(Stage stage) {

        input.setStyle("-fx-padding: 30px; -fx-font-size: 3em;");
        input.setScaleX(0.5);
        input.setScaleY(0.5);
        input.setOnKeyReleased(e -> {
     
            user = new Integer(input.getText()); // set count down to text field input as an Integer
            
            // if enter key is pressed, disable text field input and execute startTimer using user variable as a param
            if (e.getCode() == KeyCode.ENTER) {
                input.setDisable(true);
                startTimer(user);
            }
        });
        
        VBox center = new VBox();
        center.getChildren().add(input);
        
        BorderPane bp = new BorderPane();
        bp.setCenter(center);

        Scene s = new Scene(bp, 500, 300);

        stage.setTitle("Enter number of seconds");
        stage.setScene(s);
        stage.show();
    }
    // creates a count down timer, media url will be played when finished
    public void startTimer(int u) {
        Timer t = new Timer();
        t.schedule(new SubTimer("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3"), 0, 1000);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    class SubTimer extends TimerTask {
    	private String url;
    	
    	SubTimer(String url) {
    		this.url = url;
    	}
    	
    	@Override
    	public void run() {
    		// set up media to be played
			Media media = new Media(url);
			MediaPlayer mp = new MediaPlayer(media);
			MediaView mv = new MediaView(mp);
			
    		input.setText(user-- + ""); // text field value set to the value of user = user - 1 every second
    		
    		// if count down reaches 0, cancel timer, enable text field, and play media url
    		if(user < 0) {
    			cancel();
    			input.setDisable(false);
    			
    			mp.play();
    		}
    	}
    	
    }
    
}