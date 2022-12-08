import java.awt.*;
public class Water {
    public static void drawBack(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0, 640, 1000, 180);
    }
    public static void drawWaves(Graphics g){
        g.setColor(new Color(0, 0, 75));
        int x = -37;
        for(int waveNum = 1; waveNum <= 14; waveNum ++) {
            g.drawArc(x, 600, 75, 75, -90, 90);
            g.drawArc(x + 75, 600, 75, 75, -180, 90);
            x += 75;
        }
    }
    public static void drawDetails(Graphics g){
        g.setColor(new Color(200, 200, 255));
        int x = -37;
        for(int waveNum = 1; waveNum <= 14; waveNum ++) {
            g.drawArc(x, 605, 75, 75, -90, 90);
            g.drawArc(x + 75, 605, 75, 75, -180, 90);
            x += 75;
        }
    }
}
