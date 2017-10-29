import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

public class Drawing extends JPanel implements MouseListener {
    private Rectangle2D rect;
    private Rectangle2D rect2;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)(g);
        g2d.setColor(Color.GREEN);
        rect = new Rectangle2D.Double(1, 10, 100, 100);
        rect2 = new Rectangle2D.Double(200, 10, 100, 100);

        g2d.fill(rect);
        g2d.fill(rect2);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(rect2.contains(e.getX(), e.getY()))
            System.out.println("Rectangle clicked");

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
