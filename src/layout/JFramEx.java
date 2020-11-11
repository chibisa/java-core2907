package layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFramEx {
    JButton button;
    JFrame f;
    JPanel p;
    JLabel label;
    JTextField textField;
    public static void main(String[] args) {
        JFramEx main = new JFramEx();
        main.createUI();
    }

    private void createUI(){
        f = new JFrame("Frame");
        p = new JPanel();
        button = new JButton("Click me");
        label = new JLabel("Day chinh la label");
        textField = new JTextField(10);
        p.add(button);
        p.add(label);
        p.add(textField);
        f.add(p);
        f.setSize(600,400);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("co su kien click button");
                String input = textField.getText();
                int ketqua = Integer.valueOf(input)+10;
                label.setText("Ket qua la:"+ ketqua);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

