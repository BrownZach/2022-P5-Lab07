import java.awt.*;
public class Water {
    public static void drawBack(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0, 640, 1000, 180);
    }
    public static void drawWaves(Graphics g) {
        g.setColor(new Color(0, 0, 200));
        int x = -37;
        for(int waveNum = 1; waveNum <= 40; waveNum ++)
        g.drawArc(x, 630, 75, 75, -90, 90);

    }
    public static void drawDetails(Graphics g){

    }
}
