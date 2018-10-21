
import javax.swing.*;
import java.awt.event.*;

class SwingDemo extends JFrame implements ActionListener
{
JLabel lblA=new JLabel("First Number",new ImageIcon("Fish.gif"));
JTextField txtA=new JTextField(20);
JLabel lblB=new JLabel("Second Number");
JTextField txtB=new JTextField(20);
JLabel lblC=new JLabel("Sum is");
JTextField txtC=new JTextField(20);

JButton cmdAdd=new JButton("Add",new ImageIcon("Left.gif"));
JButton cmdExit=new JButton("Exit");

SwingDemo()
{
super("Calcualte");
setSize(400,400);
Container con=this.getContentPane();
con.setLayout(new GridLayout(4,2));

con.add(lblA);
con.add(txtA);
con.add(lblB);
con.add(txtB);
con.add(lblC);
con.add(txtC);
con.add(cmdAdd);
con.add(cmdExit);


cmdAdd.addActionListener(this);
cmdExit.addActionListener(this);

this.addWindowLiastener(new WinHandler());

setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==cmdAdd)
{
int a=Integer.parseInt(txtA.getText());
int b=Integer.parseInt(txtB.getText());
int c=a+b;
txtC.setText(String.valueOf(c));
}
if(e.getSource()==cmdExit)
System.exit(0);
}


}


class WinHandler extends WindowAdapter
{
public void windowClosing(windowEvent e)
{
System.exit(0);
}
}

class SwingDemoTest
{
public static void main(String arg[])
{
SwingDemo f=new SwingDemo();
}
}










