import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComboboxDemo extends JFrame implements ItemListener
{
JCombobox cmbSubject=new JCombobox();
JTextField txtSubject=new JTextField(20);

JComboboxDemo()
{
Container con=this.getContentPane();

/*String sub[]={"Oracle","Java","C++"};

cmbSubject=new JCombobox(sub);
*/

cmbSubject.addItem("Oracle");
cmbSubject.addItem("Java");
cmbSubject.addItem("C++");

cmbSubject.addItemListener(this);
con.setLayout(new FlowLayout());

con.add(cmbSubject);
con.add(txtSubject);
}
public void itemStateChanged(ItemEvent e)
{
txtSubject.setText((String)cmbSubject.getSelectedItem());
}
}









