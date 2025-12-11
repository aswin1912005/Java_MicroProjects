import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main{
    Main(){
        int x=0;
        Frame f=new Frame("Aswin MCA");
        f.setLayout(null);
        TextField t=new TextField("0");
        Button b=new Button("Count");
        Button b1=new Button("Reset");
        f.setSize(700,700);
        t.setBounds(20,30,70,30);
        b.setBounds(100,30,70,30);
        b1.setBounds(180,30,70,30);
        f.add(t);
        f.add(b);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("0");
            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val=Integer.parseInt(t.getText());
                val++;
                String s=String.valueOf(val);
                t.setText(s);
            }
        });
        f.setVisible(true);

    }
    static void main(String[] args) {
        new Main();
    }
}
