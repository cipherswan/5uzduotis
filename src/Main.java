import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static void createAndShowGui() {
        JFrame mainFrame = new JFrame("5 užduotis");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));
        JButton firstButton = new JButton("first");
        JButton secondButton = new JButton("second");
        JButton cancelButton = new JButton("Cancel");


        firstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame firstFrame = new JFrame("First");
                JPanel firstPanel = new JPanel();
                firstPanel.setLayout(new FlowLayout());
                JButton someButton = new JButton("it gonna do sumtin");
                firstFrame.setSize(200, 150);
                firstPanel.add(someButton);
                firstFrame.getContentPane().add(firstPanel);

                firstFrame.setVisible(true);

            }
        });
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //graphics
            }
        });
        cancelButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "Bye!");
            System.exit(0);

        });



        mainFrame.setSize(300, 250);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel.add(firstButton);
        mainPanel.add(secondButton);
        mainPanel.add(cancelButton);


        mainFrame.getContentPane().add(mainPanel);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGui());

    }
}
