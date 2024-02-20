package filework;
import java.awt.*;
import java.awt.event.*;

public class BMI_CalculatorAWT extends Frame implements ActionListener {
    private TextField weightField, heightField, resultField;
    private Button calculateButton;

    public BMI_CalculatorAWT() {
        setTitle("BMI Calculator");
        setSize(400, 400);
        setLayout(new GridLayout(4, 2));

        Label weightLabel = new Label("Enter weight (kg):");
        add(weightLabel);
        weightField = new TextField();
        add(weightField);

        Label heightLabel = new Label("Enter height (m):");
        add(heightLabel);
        heightField = new TextField();
        add(heightField);

        calculateButton = new Button("Calculate BMI");
        calculateButton.addActionListener(this);
        add(calculateButton);

        Label resultLabel = new Label("BMI:");
        add(resultLabel);
        resultField = new TextField();
        resultField.setEditable(false);
        add(resultField);

        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                double bmi = calculateBMI(weight, height);
                resultField.setText(String.format("%.2f", bmi));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        }
    }

    private double calculateBMI(double weight, double height) {
        if (height <= 0 || weight <= 0) {
            return 0;
        } else {
            return weight / (height * height);
        }
    }

    public static void main(String[] args) {
        new BMI_CalculatorAWT();
    }
}
