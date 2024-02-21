package filework;
import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends Frame {
    private Label messageLabel;

    public ButtonFrame() {
        setTitle("Button Frame");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        Button closeButton = new Button("Close");

        messageLabel = new Label("Press a button");
        add(messageLabel);

        add(yesButton);
        add(noButton);
        add(closeButton);

        yesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Button Yes is pressed");
            }
        });

        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Button No is pressed");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonFrame();
    }
}
