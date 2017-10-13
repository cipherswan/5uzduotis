import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

public class Drawing extends JPanel {
    Color c = Color.red;
    Rectangle2D rect = new Rectangle2D.Double(20, 20, 50, 50);
    Rectangle2D rect2 = new Rectangle2D.Double(80, 20, 50, 50);


    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(g);

        graphics2D.setPaint(c);
        graphics2D.fill(rect);
        graphics2D.fill(rect2);
    }

}
