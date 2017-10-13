import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main extends JFrame {

    public Main() {
        createAndShowGui();
    }



    private static void createAndShowGui() {
        JFrame mainFrame = new JFrame("5 užduotis");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        JButton firstButton = new JButton("first");
        JButton secondButton = new JButton("second");
        JButton cancelButton = new JButton("Cancel");

        firstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame firstFrame = new JFrame("First");
                JPanel firstPanel = new JPanel();

               // firstPanel.setLayout(new GridLayout(3, 2));
                firstPanel.setLayout(null);

                JLabel nameLabel = new JLabel("First name:");
                JLabel lastNameLabel = new JLabel("Last name:");
                JTextField nameField = new JTextField(20);
                JTextField lastNameField = new JTextField(20);
                JLabel ageLabel = new JLabel("Age:");
                JTextField ageField = new JTextField(20);
                JButton button = new JButton("OK");

                firstFrame.setSize(300, 180);

                nameLabel.setBounds(10, 20, 80, 25);
                firstPanel.add(nameLabel);
                nameField.setBounds(90,20,165,25);
                firstPanel.add(nameField);

                lastNameLabel.setBounds(10, 50, 80, 25);
                firstPanel.add(lastNameLabel);
                lastNameField.setBounds(90, 50, 165, 25);
                firstPanel.add(lastNameField);

                ageLabel.setBounds(10, 80, 80, 25);
                firstPanel.add(ageLabel);
                ageField.setBounds(90, 80, 50, 25);
                firstPanel.add(ageField);

                button.setBounds(174, 110, 80, 25);
                firstPanel.add(button);
                firstFrame.getContentPane().add(firstPanel);

                firstFrame.setVisible(true);

                //OK button listener
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Integer age = Integer.parseInt(ageField.getText());

                        if (age < 21) {
                            //unchecked exception
                            throw new ArithmeticException("You must be at least 21 years old");
                        }
                    }
                });

            }
        });
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //graphics
                JFrame secondFrame = new JFrame("Second");
                JPanel secondPanel = new JPanel();
                secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.PAGE_AXIS));
                secondFrame.setSize(350, 250);

                secondPanel.add(new Drawing());


                secondFrame.getContentPane().add(secondPanel);

                secondFrame.setVisible(true);


            }
        });
        cancelButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "Bye!");
            System.exit(0);

        });



        mainFrame.setSize(300, 100);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel.add(firstButton);
        mainPanel.add(secondButton);
        mainPanel.add(cancelButton);


        mainFrame.getContentPane().add(mainPanel);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        int k;
        FileInputStream fis = null;

        //checked
        try {
            fis = new FileInputStream("src/data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        }

        try {
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            fis.close();
        } catch (IOException | NullPointerException e) {
            System.out.println("IOException occurred: " + e);
        }

        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGui());

    }
}
