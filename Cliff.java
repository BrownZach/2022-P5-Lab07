import java.awt.*;
import java.applet.*;

public class Cliff extends Applet {
    public void paint(Graphics g) {

        Sky.drawBlue(g);
        Sky.drawClouds(g);
        Sky.drawSunset(g);
        Sky.drawSun(g);
        Water.drawBack(g);
        Water.drawWaves(g);
        Water.drawDetails(g);
        /*Rocks.drawBase(g);
        Rocks.drawDetails(g);*/
    }
}