import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Drawing extends JPanel {

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new Color(150, 0, 0));

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put( RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        g2d.fillRect(30, 20, 50, 50);
        g2d.fillRect(120, 20, 90, 60);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
