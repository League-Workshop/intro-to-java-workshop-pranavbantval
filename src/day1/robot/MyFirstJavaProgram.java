package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 = new Robot();
r2d2.setSpeed(15);	
r2d2.penDown();
for (int i = 0; i < 4; i++) {
	r2d2.move(100);
	r2d2.turn(90);
}

for (int i = 0; i < 4; i++) {
	r2d2.move(-100);
	r2d2.turn(90);
}


	}
}
