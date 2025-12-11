import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,a,s,m,d,c,eq;
    TextField t;
    double num1 = 0, num2 = 0;
    String op = "";

    Main() {

        setTitle("Calculator");

        t = new TextField();

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");

        a = new Button("+");
        s = new Button("-");
        m = new Button("*");
        d = new Button("/");
        c = new Button("Clear");
        eq = new Button("=");

        setLayout(null);

        add(b1); add(b2); add(b3);
        add(b4); add(b5); add(b6);
        add(b7); add(b8); add(b9);
        add(b0);

        add(a); add(s); add(m); add(d);
        add(c); add(eq); add(t);

        t.setBounds(500, 40, 275, 30);

        b7.setBounds(500, 75, 70, 30);
        b8.setBounds(600, 75, 70, 30);
        b9.setBounds(700, 75, 70, 30);

        b4.setBounds(500, 125, 70, 30);
        b5.setBounds(600, 125, 70, 30);
        b6.setBounds(700, 125, 70, 30);

        b1.setBounds(500, 175, 70, 30);
        b2.setBounds(600, 175, 70, 30);
        b3.setBounds(700, 175, 70, 30);

        b0.setBounds(600, 225, 70, 30);

        a.setBounds(450, 225, 70, 30);
        s.setBounds(500, 275, 70, 30);
        m.setBounds(600, 275, 70, 30);
        d.setBounds(700, 275, 70, 30);

        eq.setBounds(850, 75, 50, 230);
        c.setBounds(575, 325, 100, 30);

        Button[] buttons = { b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,a,s,m,d,eq,c };

        for (Button b : buttons) {
            b.addActionListener(this);
        }

        setSize(1000, 1000);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String val = t.getText();

        if (e.getSource() == b0) t.setText(val + "0");
        if (e.getSource() == b1) t.setText(val + "1");
        if (e.getSource() == b2) t.setText(val + "2");
        if (e.getSource() == b3) t.setText(val + "3");
        if (e.getSource() == b4) t.setText(val + "4");
        if (e.getSource() == b5) t.setText(val + "5");
        if (e.getSource() == b6) t.setText(val + "6");
        if (e.getSource() == b7) t.setText(val + "7");
        if (e.getSource() == b8) t.setText(val + "8");
        if (e.getSource() == b9) t.setText(val + "9");

        if (e.getSource() == a) {
            num1 = Double.parseDouble(t.getText());
            op = "+";
            t.setText("");
        }

        if (e.getSource() == s) {
            num1 = Double.parseDouble(t.getText());
            op = "-";
            t.setText("");
        }

        if (e.getSource() == m) {
            num1 = Double.parseDouble(t.getText());
            op = "*";
            t.setText("");
        }

        if (e.getSource() == d) {
            num1 = Double.parseDouble(t.getText());
            op = "/";
            t.setText("");
        }

        if (e.getSource() == eq) {
            num2 = Double.parseDouble(t.getText());
            double result = 0;

            switch (op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            t.setText(String.valueOf(result));
        }

        if (e.getSource() == c) {
            t.setText("");
            num1 = num2 = 0;
            op = "";
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
