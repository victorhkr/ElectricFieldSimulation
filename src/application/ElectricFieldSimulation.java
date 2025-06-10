package application;

import java.util.Random;
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class ElectricFieldSimulation extends Application {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final double CHARGE_RADIUS = 50;
	private static final double ELECTRIC_FIELD_LINE_LENGTH = 1000;

	private double chargeX = WIDTH / 2;
	private double chargeY = HEIGHT / 2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Canvas canvas = new Canvas(WIDTH, HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Pane root = new Pane(canvas);
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		primaryStage.setTitle("Electric Field Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();

		new AnimationTimer() {
			@Override
			public void handle(long now) {
				draw(gc);
			}
		}.start();
	}

	private void draw(GraphicsContext gc) {
		// Clear the canvas
		gc.clearRect(0, 0, WIDTH, HEIGHT);

		// Draw charged object
		gc.fillOval(chargeX - CHARGE_RADIUS, chargeY - CHARGE_RADIUS, 2 * CHARGE_RADIUS, 2 * CHARGE_RADIUS);

		// Draw electric field lines
		drawElectricFieldLines(gc, chargeX, chargeY);
	}

	private void drawElectricFieldLines(GraphicsContext gc, double x, double y) {
		for (int angle = 0; angle < 360; angle += 10) {
			double radianAngle = Math.toRadians(angle);
			double endX = x + ELECTRIC_FIELD_LINE_LENGTH * Math.cos(radianAngle);
			double endY = y + ELECTRIC_FIELD_LINE_LENGTH * Math.sin(radianAngle);
			gc.strokeLine(x, y, endX, endY);
		}
	}


}