import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
//        g2.setStroke(new BasicStroke(5));
//		 
//		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
//		//portion of the GUI
//		g2.drawRect(10, 10, 765, 540);
//		
//		//2) Draw a horizontal line to bisect the Rectangle
//		g2.drawLine(10, 270, 770, 270);
//		
//		//3) Draw a vertical line to bisect the shape again
//		g2.drawLine(765/2, 10, 765/2,550 );
//		
//		
//		// 4) small rectangles on top-left
//		// g2.drawLine(765/4, 10, 765/4, 550/2-10);
//		
//		int count = 0;
//		while (count < 100) {
//	        int red = (int) (Math.random() * 255);
//	        int green = (int) (Math.random() * 255);
//	        int blue = (int) (Math.random() * 255);
//	        
//	        int linex1 = (int) (Math.random() * 360 + 15);
//	        int linex2 = (int) (Math.random() * 360 + 15);
//	        int liney1 = (int) (Math.random() * 250 + 15);
//	        int liney2 = (int) (Math.random() * 250 + 15);
//	        
//	        int rectx1 = (int) (Math.random() * 340 + 385);
//	        int recty1 = (int) (Math.random() * 200 + 15);
//	        
//	        int ovalx1 = (int) (Math.random() * 360 + 15);
//	        int ovaly1 = (int) (Math.random() * 320 + 280);
//	        int ovalRad = (int) (Math.random() * 201);
//	        		
//	        while (ovalx1 + ovalRad > 380 || ovaly1 + ovalRad > 550) {
//	        	ovalRad--;
//	        }
//	        
//	        g.setColor(new Color(red, green, blue));
//	        g2.setStroke(new BasicStroke(1));
//	        g.drawLine(linex1, liney1, linex2, liney2);
//	        g.fillRect(rectx1, recty1, 50, 50);
//	        g.drawOval(ovalx1, ovaly1, ovalRad, ovalRad);
//	        
//	        count++;
//		}
		
		int xCoord = 0;
		int yCoord = 650;
		
		for (int i = 0; i < 26; i++) {
			g2.drawLine(xCoord, 0, 0, yCoord);
			xCoord = xCoord + 25;
			yCoord = yCoord - 25;
		}
		
		xCoord = 350;
		yCoord = 0;
		
		for (int i = 0; i < 26; i++) {
			g2.drawLine(1000, yCoord, xCoord, 0);
			xCoord = xCoord + 25;
			yCoord = yCoord + 25;
		}
		
		xCoord = 1000;
		yCoord = 0;
		int count = 0;
		
		while (count < 26) {
			g2.drawLine(xCoord, 650, 1000, yCoord);
			xCoord = xCoord - 25;
			yCoord = yCoord + 25;
			count++;
		}
		
		xCoord = 650;
		yCoord = 650;
		count = 0;
		
		while (count < 26) {
			g2.drawLine(0, yCoord, xCoord, 650);
			xCoord = xCoord - 25;
			yCoord = yCoord - 25;
			count++;
		}
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
