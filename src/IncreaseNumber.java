import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncreaseNumber extends JFrame implements ActionListener{
    JButton bt;
    JTextField tf;

    int count = 0;

    public IncreaseNumber() {
        bt = new JButton("Increase");
        tf = new JTextField("0");
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(bt);
        container.add(tf);
        bt.addActionListener(this);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));

    }
}
