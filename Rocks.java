import java.awt.*;

public class Rocks {
    public static void drawBase(Graphics g){
        g.setColor(Color.gray);
        Polygon rockBase = new Polygon();
        rockBase.addPoint(400, 640);
        rockBase.addPoint(410, 550);
        rockBase.addPoint(385, 445);
        rockBase.addPoint(435, 312);
        rockBase.addPoint(420, 220);
        rockBase.addPoint(445, 165);
        rockBase.addPoint(395, 145);
        rockBase.addPoint(0, 150);
        rockBase.addPoint(0, 640);
        rockBase.addPoint(400, 640);
        g.fillPolygon(rockBase);
    }
    public static void drawDetails(Graphics g){
        g.setColor(Color.black);
        Polygon rockDetail = new Polygon();
        rockDetail.addPoint(400, 640);
        rockDetail.addPoint(410, 550);
        rockDetail.addPoint(385, 445);
        rockDetail.addPoint(435, 312);
        rockDetail.addPoint(420, 220);
        rockDetail.addPoint(445, 165);
        rockDetail.addPoint(395, 145);
        rockDetail.addPoint(0, 150);
        rockDetail.addPoint(0, 640);
        rockDetail.addPoint(400, 640);
        g.drawPolygon(rockDetail);
    }
}
