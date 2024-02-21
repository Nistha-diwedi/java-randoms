import java.awt.*;
import java.awt.event.*;

public class TempConversion extends Frame implements ActionListener {
    private TextField inputField, outputField;
    private Button toCelsiusButton, toFahrenheitButton;

    public TempConversion() {
        super("Temperature Conversion");
        setLayout(null); // Disable layout manager
        
        // Input Field
        inputField = new TextField();
        inputField.setBounds(50, 50, 150, 20);
        add(inputField);
        
        // Convert to Celsius Button
        toCelsiusButton = new Button("To Celsius");
        toCelsiusButton.setBounds(220, 50, 80, 20);
        toCelsiusButton.addActionListener(this);
        add(toCelsiusButton);
        
        // Convert to Fahrenheit Button
        toFahrenheitButton = new Button("To Fahrenheit");
        toFahrenheitButton.setBounds(50, 100, 100, 20);
        toFahrenheitButton.addActionListener(this);
        add(toFahrenheitButton);
        
        // Output Field
        outputField = new TextField();
        outputField.setEditable(false);
        outputField.setBounds(160, 100, 150, 20);
        add(outputField);

        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Get input temperature
            double tempInput = Double.parseDouble(inputField.getText());
            double result;
            String unit;
            
            // Determine which button was clicked
            if (e.getSource() == toCelsiusButton) {
                // Convert to Celsius
                result = (tempInput - 32) * 5/9;
                unit = "°C";
            } else {
                // Convert to Fahrenheit
                result = (tempInput * 9/5) + 32;
                unit = "°F";
            }
            
            // Display converted temperature
            outputField.setText(result + " " + unit);
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new TempConversion();
    }
}
