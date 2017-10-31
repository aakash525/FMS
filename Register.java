import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Register{
  static int id = 0;

  JFrame regFrame = new JFrame("Register");

  JLabel ins1 = new JLabel("*Note your ID number");
  JLabel ID = new JLabel("ID : " + ++id);
  JLabel Type = new JLabel("Type");
  JLabel Name = new JLabel("Name");
  JLabel UserName = new JLabel("Userame");
  JLabel Password = new JLabel("Password");
  JLabel DOB= new JLabel("Date Of Birth");
  JLabel Address = new JLabel("Address");
  JLabel Department = new JLabel("Department");
  JLabel ins2 = new JLabel("*All fields are mandatory");
  JLabel Tmp = new JLabel("");

  TextField textType = new TextField("",30);
  TextField textName = new TextField("",30);
  TextField textUserName = new TextField("",30);
  JPasswordField passPassword = new JPasswordField(30);
  TextField textDOB = new TextField("",30);
  TextField textAddress = new TextField("",30);
  TextField textDepartment = new TextField("",30);

  JButton submit = new JButton("Submit");

  Register(){
    regFrame.setVisible(true);
    regFrame.setResizable(false);
    regFrame.setSize(500,300);

    regFrame.add(ID);
    ID.setBounds(100,40,40,20);
    regFrame.add(ins1);
    ins1.setForeground(Color.RED);
    ins1.setBounds(200,40,200,20);
    regFrame.add(Type);
    Type.setBounds(100,60,40,20);
    regFrame.add(textType);
    textType.setBounds(200,60,200,20);
    regFrame.add(Name);
    Name.setBounds(100,80,40,20);
    regFrame.add(textName);
    textName.setBounds(200,80,200,20);
    regFrame.add(UserName);
    UserName.setBounds(100,100,80,20);
    regFrame.add(textUserName);
    textUserName.setBounds(200,100,200,20);
    regFrame.add(Password);
    Password.setBounds(100,120,80,20);
    regFrame.add(passPassword);
    passPassword.setBounds(200,120,200,20);
    regFrame.add(DOB);
    DOB.setBounds(100,140,100,20);
    regFrame.add(textDOB);
    textDOB.setBounds(200,140,200,20);
    regFrame.add(Address);
    Address.setBounds(100,160,100,20);
    regFrame.add(textAddress);
    textAddress.setBounds(200,160,200,20);
    regFrame.add(Department);
    Department.setBounds(100,180,100,20);
    regFrame.add(textDepartment);
    textDepartment.setBounds(200,180,200,20);
    regFrame.add(submit);
    submit.setBounds(200,240,80,20);
    regFrame.add(Tmp);
    
    submit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        	storeRegistration();
        }
    });
  }
  
  public void storeRegistration()
  {
	  try(FileWriter fw = new FileWriter("Registered.txt",true);
			  BufferedWriter bw = new BufferedWriter(fw);
			  PrintWriter out = new PrintWriter(bw))
	  {
		  if(textType.getText().length() != 0 && textName.getText().length() != 0 && textUserName.getText().length() != 0 && passPassword.getText().length() != 0 && textDOB.getText().length() != 0 && textAddress.getText().length() != 0 && textDepartment.getText().length() != 0)
		  {
			  if(checkUsername() == 1)
			  {
				  fw.append(String.valueOf(id)+","+textType.getText()+","+textName.getText()+","+textUserName.getText()+","+passPassword.getText()+","+textDOB.getText()+","+textAddress.getText()+","+textDepartment.getText());
				  fw.append(System.lineSeparator());
				  regFrame.setVisible(false);
			  }
			  else
			  {
				  regFrame.add(ins2);
				  ins2.setText("Username not available");
				  ins2.setForeground(Color.RED);
				  ins2.setBounds(170,210,150,20);
				  regFrame.add(Tmp);
			  }
		  }
		  else
		  {
			  regFrame.add(ins2);
			  ins2.setForeground(Color.RED);
			  ins2.setBounds(170,210,150,20);
		  }
	  }
	  catch(Exception e)
	  {	}
  }
  
  //checking username function 
  
  public int checkUsername()
  {
	  int a = 1;
	  String line,lineList[];
	  
	  try
	  {
		  BufferedReader br = new BufferedReader(new FileReader("Registered.txt"));
		  while((line = br.readLine()) != null)
		  {
			  lineList = line.split(",");
			  if(lineList[3].equals(textUserName.getText()))
			  {
				  return 0;
			  }
		  }
	  }
	  catch(Exception e)
	  {	}
	  return 1;
  }
}