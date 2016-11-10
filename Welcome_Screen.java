import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome_Screen {
  JFrame frame;
  JLabel label_1;
  JLabel label_2;
  JButton login;
  JButton reg;

  Welcome_Screen(){
    JFrame frame = new JFrame("FMS");
    JLabel label_1 = new JLabel("Facility Management Services");
    JLabel label_2 = new JLabel("System");
    JButton login = new JButton("Login");
    JButton reg = new JButton("Register");

    frame.setSize(1000,600);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    label_1.setVisible(true);
    label_2.setVisible(true);
    login.setVisible(true);
    reg.setVisible(true);
    frame.add(label_1);
    frame.add(label_2);
    frame.add(login);
    frame.add(reg);
    label_1.setBounds(400,150,250,50);
    label_2.setBounds(480,200,100,50);
    login.setBounds(470,280,80,30);
    reg.setBounds(460,350,100,30);

    login.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
        
			}
		});

    reg.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});
  }
}
