import java.awt.event.*;
import javax.swing.*;

public class Welcome_Screen {
  JFrame frame = new JFrame("FMS");
  JLabel label_1;
  JLabel label_2;
  JButton login;
  JButton reg;

  String type,name,username,pass,dob,address,department;

  Welcome_Screen(){
    JPanel panel = new JPanel();
    panel.setVisible(true);

    label_1 = new JLabel("Facility Management Services");
    label_2 = new JLabel("System");
    login = new JButton("Login");
    reg = new JButton("Register");

    frame.setSize(1000,600);
    frame.setVisible(true);
    frame.setResizable(false);
    panel.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    label_1.setVisible(true);
    label_2.setVisible(true);
    frame.add(panel);
    panel.add(label_1);
    panel.add(label_2);
    panel.add(login);
    panel.add(reg);
    label_1.setBounds(400,150,250,50);
    label_2.setBounds(480,200,100,50);
    login.setBounds(470,280,80,30);
    reg.setBounds(460,350,100,30);

    login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });

    reg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        Register R = new Register();
            }
        });
  }
}
