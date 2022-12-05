import java.awt.*;
public class Sky {
    public static void drawBlue(Graphics g){
        g.setColor(new Color(0, 150, 255));
        g.fillRect(0, 0, 1000, 800);
    }
    public static void drawClouds(Graphics g){
        g.setColor(Color.white);
        g.fillOval(850, 100, 80, 80);
        g.fillOval(875, 85, 70, 70);
        g.fillOval(820, 90, 50, 50);
        g.fillOval(815, 105, 75, 75);
        g.fillOval(900, 110, 60, 60);
        g.fillOval(550, 130, 80, 80);
        g.fillOval(575, 115, 70, 70);
        g.fillOval(520, 120, 50, 50);
        g.fillOval(515, 135, 75, 75);
        g.fillOval(600, 140, 60, 60);
    }
    public static void drawSunset(Graphics g){
        g.setColor(new Color());
    }
    public static void drawSun(Graphics g){

    }
}
