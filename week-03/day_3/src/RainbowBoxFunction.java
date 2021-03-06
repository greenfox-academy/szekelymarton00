import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    int NumofSQ = 0;
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter te size of the Square: ");
    int s = myScanner.nextInt();

    while(NumofSQ < 10 && s > 0) {
      NumofSQ++;
      s -= 10;
      int color1 = (int)(Math.random() * 255) + 2;
      int color2 = (int)(Math.random() * 255) + 2;
      int color3 = (int)(Math.random() * 255) + 2;
      Rainbox(graphics, s, s, s,color1,color2,color3);
    }

  }

  public static void Rainbox(Graphics graphics, int s1, int i, int s, int color1,int color2,int color3) {
    graphics.setColor(new Color(color1,color2,color3));
    graphics.fillRect((WIDTH / 2) - (s / 2), (HEIGHT / 2) - (s / 2), s, s);
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}