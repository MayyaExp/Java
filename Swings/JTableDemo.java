JTable example
  

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.table.*;

public class JTableExample extends JFrame 
{

String data[][] = {{"John", "Sutherland", "Student"},
                     {"George", "Davies", "Student"},
                     {"Melissa", "Anderson", "Associate"},
                     {"Stergios", "Maglaras", "Developer"},
                  };

String fields[] = {"Name", "Surname", "Status"};

public JTableExample( String title ) 
{
super( title );
Container con=this.getContentPane();
setSize( 150, 150 );
setLayout(new FlowLayout());

JTable jt = new JTable( data, fields );
JScrollPane pane = new JScrollPane( jt );
con.add( pane );

addWindowListener( new WindowAdapter() 
{
 public void windowClosing( WindowEvent we ) 
 {
  dispose();
  System.exit( 0 );
 }
 }
 );
setVisible( true );
 }

}




JTable

	Object getValue(int row, int col);
	void setValueAt(Object val, int row, int col);

                  jt.setValue(new Integer(10),0,0));







