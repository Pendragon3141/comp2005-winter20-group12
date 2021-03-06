import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberOfPlayers extends JFrame {

    private JPanel Panel = new JPanel();
    int size = 6;
    JButton button;
    JTextField field;

    public NumberOfPlayers() {

        super("Number of Players");

        GridLayout grid = new GridLayout(size + 1, 0, 0, 15);

        JLabel label1 = new JLabel();

        RicochetRobots.SetUpScreen(this, grid, Panel, label1, "Enter Number Of Players", 50);

        field = new JTextField(100);

        field.setFont(new Font("Serif", Font.PLAIN, 40));

        Panel.add(field);

        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        button = new JButton();
        button.setBackground(Color.ORANGE);
        button.setFont(new Font("Arial", Font.PLAIN, 60));
        button.setText("Save");
        Panel.add(label2);
        Panel.add(label3);

        Panel.add(button);
        add(Panel);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button) {
                    System.out.println("print");

                    String val = field.getText();

                    try {

                        int num = Integer.parseInt(val);

                        if (num <= 4 && num > 0) {

                            Data.SetNumberOfPlayers(num);
                            JOptionPane.showMessageDialog(null, "Number of Players Updated", "Saved", 1);

                        } else if (num == 0) {
                            JOptionPane.showMessageDialog(null, "Number of Players cannot be 0", "Error", 1);

                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid number of players entered", "Error", 1);
                        }

                    } catch (NumberFormatException excep) {

                        JOptionPane.showMessageDialog(null, "Please enter valid number of players", "Error", 1);

                    }
                }

            }

        });

    }

}
