import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

// Inheritance: SwingAssignment inherits from JFrame
public class SwingAssignment extends JFrame {

    // GUI variables required by the assignment
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    // Additional interactive components
    private JButton changeTextButton;
    private JButton changeBackgroundButton;

    private final Random random = new Random();

    // Constructor
    public SwingAssignment() {

        // -----------------------------
        // 1. CREATE THE JFRAME
        // -----------------------------
        frame = new JFrame();

        frame.setTitle("Java Swing Assignment");

        // Required size
        frame.setSize(800, 800);

        // Close application when X is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centre the window
        frame.setLocationRelativeTo(null);


        // -----------------------------
        // 2. CREATE THE JPANEL
        // -----------------------------
        panel = new JPanel();

        // Initial background colour
        panel.setBackground(new Color(240, 245, 255));

        // Arrange components vertically
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.setBorder(
                BorderFactory.createEmptyBorder(
                        200,
                        50,
                        200,
                        50
                )
        );


        // -----------------------------
        // 3. CREATE THE JLABEL
        // -----------------------------
        label = new JLabel(
                "Welcome to Java Swing First Individual Assignment by Natashia Napha Foyoh"
        );

        label.setFont(
                new Font("Tahoma", Font.BOLD, 18)
        );

        label.setAlignmentX(Component.CENTER_ALIGNMENT);


        // -----------------------------
        // 4. CREATE CHANGE TEXT BUTTON
        // -----------------------------
        changeTextButton = new JButton("Change Text");

        changeTextButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );


        // -----------------------------
        // 5. CREATE BACKGROUND BUTTON
        // -----------------------------
        changeBackgroundButton =
                new JButton("Change Background");

        changeBackgroundButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );


        // -----------------------------
        // 6. CHANGE LABEL TEXT EVENT
        // -----------------------------
        changeTextButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        label.setText(
                                "The JLabel text has been changed successfully!"
                        );

                    }
                }
        );


        // -----------------------------
        // 7. CHANGE BACKGROUND EVENT
        // -----------------------------
        changeBackgroundButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Color newColor = new Color(
                                random.nextInt(256),
                                random.nextInt(256),
                                random.nextInt(256)
                        );

                        panel.setBackground(newColor);
                    }
                }
        );


        // -----------------------------
        // 8. IMAGEICON
        // -----------------------------
        URL iconURL =
                getClass().getResource("/app_icon.png");

        if (iconURL != null) {

            ImageIcon icon =
                    new ImageIcon(iconURL);

            frame.setIconImage(
                    icon.getImage()
            );

        } else {

            System.out.println(
                    "Icon not found. Add app_icon.png to the resources folder."
            );
        }


        // -----------------------------
        // 9. ADD COMPONENTS TO PANEL
        // -----------------------------
        panel.add(label);

        panel.add(
                Box.createRigidArea(
                        new Dimension(0, 40)
                )
        );

        panel.add(changeTextButton);

        panel.add(
                Box.createRigidArea(
                        new Dimension(0, 20)
                )
        );

        panel.add(changeBackgroundButton);


        // -----------------------------
        // 10. ADD PANEL TO FRAME
        // -----------------------------
        frame.add(panel);


        // -----------------------------
        // 11. DISPLAY APPLICATION
        // -----------------------------
        frame.setVisible(true);
    }


    // -----------------------------
    // MAIN METHOD
    // -----------------------------
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {

                    @Override
                    public void run() {

                        new SwingAssignment();

                    }
                }
        );
    }
}