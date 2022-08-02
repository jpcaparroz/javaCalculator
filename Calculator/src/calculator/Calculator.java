package calculator;

import javax.swing.JLabel;

public class Calculator {

    public static void main(String[] args) {

        Orange orange = new Orange();
        orange.setVisible(true);
        orange.setLocationRelativeTo(null);
    }

    public void buttonPress(JLabel jLabel, String tecla) {

        String label;

        label = jLabel.getText();

        if (label.equals("0")) {

            jLabel.setText(tecla);

        } else {
            jLabel.setText(label + tecla);
        }

    }

}
