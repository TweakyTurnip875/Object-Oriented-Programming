package com.noah.Main;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.*;

public class Main extends Application {

    boolean paused = false;

    @Override
    public void start(Stage stage) {
    	
        Rectangle rect = new Rectangle();
        rect.setFill(Color.AQUA);
        rect.setEffect(new Glow(1));
        rect.setWidth(25);
        rect.setHeight(50);


        Pentagon pent = new Pentagon(Color.TRANSPARENT, Color.WHITE, 400, 200);
        pent.setEffect(new Glow(1));
        pent.setWidth(500);
        pent.setHeight(200);


        Pane pane = new Pane();
        pane.getChildren().add(pent);
        pane.getChildren().add(rect);
        pane.setTranslateY(30);


        BorderPane bp = new BorderPane();
        bp.setCenter(pane);


        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.seconds(4));
        pt.setPath(pent.getPentShape());
        pt.setNode(rect);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        
        FadeTransition ft = new FadeTransition(Duration.seconds(2), rect);
        ft.setFromValue(1);
        ft.setToValue(0.5);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        Scene s = new Scene(bp, 400, 350);
        s.setFill(Color.web("#40474a"));

        s.setOnMouseClicked(e -> handlePausePlay(paused, pt, ft));

        stage.setScene(s);
        stage.setTitle("Animation");
        stage.show();
    }

    public void handlePausePlay(boolean paused, PathTransition pt, FadeTransition ft) {
        this.paused = !paused;
        
    	if(paused) {
    		pt.pause();
    		ft.pause();
    	} else {
    		pt.play();
    		ft.play();
    		
    	}
    }

    class Pentagon extends StackPane {
        private Color color;
        private Color stroke;
        private double width;
        private double height;

        public Pentagon() {
            color = Color.TRANSPARENT;
            stroke = Color.BLACK;
            width = 500;
            height = 200;
        }

        public Pentagon(Color c, Color s, double w, double h) {
            color = c;
            stroke = s;
            width = w;
            height = h;
        }

        private Polygon p;
        public void create() {
            p = new Polygon();
            p.setFill(color);
            p.setStroke(stroke);
            ObservableList < Double > list = p.getPoints();
            double centerX = getWidth() / 2;
            double centerY = getHeight() / 2;
            double radius = Math.min(getWidth(), getHeight()) * 0.4;

            int s = 5;

            for (int i = 0; i < s; i++) {
                list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
                list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
            }

            getChildren().clear();
            getChildren().addAll(p);

            super.setWidth(width);
            super.setHeight(height);
        }

        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            create();
        }

        @Override
        public void setHeight(double height) {
            super.setHeight(height);
            create();
        }
        public Color getColor() {
            return color;
        }
        public void setColor(Color color) {
            this.color = color;
        }
        public Polygon getPentShape() {
            create();
            return p;
        }


    }

    public static void main(String[] args) {
        launch(args);
    }

}