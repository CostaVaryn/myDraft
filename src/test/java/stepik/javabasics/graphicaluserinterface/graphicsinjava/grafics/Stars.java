package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Path2D;

public class Stars {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> drawingAndDisplay());
    }

    private static void drawingAndDisplay() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new StarPanel());
        f.setSize(600, 600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}

class StarPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.draw(createSimpleStar(50, 200, 200));

        g.setPaint(Color.GREEN);
        g.fill(drawStar(400, 400, 40, 60, 10, 0));

        g.setPaint(new RadialGradientPaint(
                new Point(400, 200), 60, new float[] { 0, 1 },
                new Color[] { Color.RED, Color.YELLOW }));
        g.fill(drawStar(400, 200, 20, 60, 8, 0));

        g.setPaint(new RadialGradientPaint(
                new Point(200, 400), 50, new float[] { 0, 0.3f, 1 },
                new Color[] { Color.BLACK, Color.YELLOW, Color.ORANGE }));
        g.fill(drawStar(200, 400, 40, 50, 20, 0));
    }

    private static Shape createSimpleStar(double radius, double koordX, double koordY) {
        return drawStar(koordX, koordY, radius, radius * 2.63, 5,
                Math.toRadians(-18));
    }

    private static Shape drawStar(double koordX, double koordY,
                                  double innerRadius, double outerRadius, int numRays,
                                  double startAngleR) {
        Path2D p = new Path2D.Double();
        double deltaAngleR = Math.PI / numRays;
        for (int i = 0; i < numRays * 2; i++) {
            double angleR = startAngleR + i * deltaAngleR;
            double ca = Math.cos(angleR);
            double sa = Math.sin(angleR);
            double relX = ca;
            double relY = sa;
            if ((i & 1) == 0) {
                relX *= outerRadius;
                relY *= outerRadius;
            } else {
                relX *= innerRadius;
                relY *= innerRadius;
            }
            if (i == 0) {
                p.moveTo(koordX + relX, koordY + relY);
            } else {
                p.lineTo(koordX + relX, koordY + relY);
            }
        }
        p.closePath();
        return p;
    }
}