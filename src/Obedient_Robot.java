import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	
	Robot k = new Robot();
	static Color color= new Color(0,0,0);
	
public static void main(String[] args) {
Obedient_Robot k1= new Obedient_Robot();
String a=JOptionPane.showInputDialog("What shape do you want? (Options:  triangle, square, or circle)");
String c=JOptionPane.showInputDialog("What color do you want? (Options:  red, green, or blue)");
if(c.equals("red")) {
	color= new Color(255,0,0);
}
	
else if(c.equals("green")) {
	color= new Color(0,255,0);
}
	
else {
	color= new Color(0,0,255);
}

if(a.equals("triangle")) {
	k1.drawTriangle();
}
else if(a.equals("square")) {
	k1.drawSquare();
	}
else {
	k1.drawCircle();
	
}
}
	
	




void drawSquare() {
	k.setSpeed(10);
k.setPenColor(color);
k.penDown();
for(int i=0;i<4;i++ ) {
k.move(100);	
k.turn(90);

}
k.penUp();

k.move(100);
}

void drawTriangle() {
	k.setSpeed(10);
	k.setPenColor(color);
	k.penDown();
	k.move(100);
	for(int i=0;i<2;i++ ) {
	k.turn(120);
	k.move(100);
	}
k.penUp();
	
	k.move(100);
	
}

void drawCircle() {
	k.setSpeed(10);
	k.setPenColor(color);
	k.penDown();
	//k.turn(90);
for(int i=0;i<360;i++ ) {
	k.move(1);
	k.turn(1);
	
}
k.penUp();

k.move(100);
}

}
	
	
	
	
	


