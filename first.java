import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class first extends JFrame implements ActionListener
{
    
JRadioButton r1,r2,r3;
JLabel l;
    first(String s[],int i,String a[])
    {
        l=new JLabel("Ques"+(i+1)+")"+s[i]);
         ButtonGroup bg=new ButtonGroup();
    if(i==0)
    {
     r1=new JRadioButton("lang");
     r2=new JRadioButton("util");
     r3=new JRadioButton("awt.event");
    }
    else
    if(i==1)
    {
         r1=new JRadioButton("int");
         r2=new JRadioButton("Object");
         r3=new JRadioButton("boolean");
    }
    else
    {
         r1=new JRadioButton("size()");
         r2=new JRadioButton("length");
         r3=new JRadioButton("length()");
    }
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);
    add(l);
    add(r1);
    add(r2);
    add(r3);
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);
    setLayout(new FlowLayout());
    setVisible(true);
    }
public void actionPerformed(ActionEvent ae)
{
    String s=ae.getActionCommand();
  // if(s.equals(""))
}
   
}
