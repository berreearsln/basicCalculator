import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton a00Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a0Button1;
    private JButton button9;
    private JButton a3Button;
    private JButton xButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a9Button;
    private JButton button19;
    private JButton button20;
    private JButton button4;
    private JButton button10;
    private JButton button16;
    private JButton button17;
    private JButton button18;


    double a, b, result;
    String op;


    public Calculator() {
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(txtDisplay.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });
        a0Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button1.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")) {
                    txtDisplay.setText(txtDisplay.getText() + button9.getText());
                }
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "×";
                txtDisplay.setText("");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "÷";
                txtDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "x²";
                result = a*a;
                txtDisplay.setText(String.format("%.3f", result));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());

                if (op == "+") {
                    result = a + b;
                    txtDisplay.setText(String.format("%.3f", result));
                }
                else if (op == "-") {
                    result = a - b;
                    txtDisplay.setText(String.format("%.3f", result));
                }
                else if (op == "×") {
                    result = a * b;
                    txtDisplay.setText(String.format("%.3f", result));
                }
                else if (op == "÷") {
                    result = a / b;
                    txtDisplay.setText(String.format("%.3f", result));
                }
            }
        });

    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
