/*
 * TableDemo2.java
 *
 * Created on April 15, 2009, 9:02 AM
 */

/**
 *
 * @author  Administrator
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
public class TableDemo3 extends JFrame implements KeyListener
{
    DefaultTableModel tblMdl=new DefaultTableModel(1,2);
    JScrollPane pane;
    JTable tblNames;
    JTextField txtEName;
    JTextField txtEmpNo;
    
    public TableDemo3() {
        Container con=this.getContentPane();
              
        
        tblNames=new JTable();
        tblNames.setModel(tblMdl);
        tblNames.setValueAt(new String("EmpNo"),0,0);
        tblNames.setValueAt(new String("EName"),0,1);
        txtEmpNo=new JTextField(20);
        txtEName=new JTextField(20);
        setSize(400,400);
        con.setLayout(new FlowLayout());
        con.add(txtEmpNo);
        con.add(txtEName);
        pane=new JScrollPane(tblNames);
        con.add(pane);
        txtEName.addKeyListener(this);
        setVisible(true);
        
    }
    
   public void keyPressed(KeyEvent evt) 
   {

        int rw;
        if(evt.getKeyCode()==evt.VK_ENTER)
        {
            
            tblMdl.setRowCount(tblMdl.getRowCount()+1);
            rw=tblMdl.getRowCount()-1;
            tblNames.setValueAt(txtEmpNo.getText(),rw,0);
            tblNames.setValueAt(txtEName.getText(),rw,1);
            
            
        }
    }
        public void keyTyped(KeyEvent e)
        {
            
        }
        public void keyReleased(KeyEvent e)
        {
            
        } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        TableDemo3 d=new TableDemo3();
       
        
        }
    
    

    
}

