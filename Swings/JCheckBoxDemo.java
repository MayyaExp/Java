import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckboxTest extends JFrame implements ItemListener
{
JCheckbox chk1,chk2,chk3;
JLabel lbl;
JTextField txt;
CheckboxTest()
{
super("checkbox test");
Container con=this.getContentPane();

chk1=new JCheckbox("Oracle");
chk2=new JCheckbox("Java");
chk3=new JCheckbox("C++");

lbl=new JLabel("Subject");
txt=new JTextField(20);

con.setLayout(new FlowLayout());

con.add(chk1);
con.add(chk2);
con.add(chk3);
con.add(lbl);
con.add(txt);


chk1.addItemListener(this);
chk2.addItemListener(this);
chk3.addItemListener(this);


}

public void itemStateChanged(ItemEvent e)
{
if(e.getItemSelectable()==chk1 && chk1.isSelected()==true)
txt.setText("Oracle");

if(e.getItemSelectable()==chk2 && chk2.isSelected()==true)
txt.setText("Java");

if(e.getItemSelectable()==chk3 && chk3.isSelected()==true)
txt.setText("C++");
}
}


class Test
{
public static void main(String arg[])
{
CheckboxTest t=new CheckboxTest();
t.setVisible(true);
}
}














