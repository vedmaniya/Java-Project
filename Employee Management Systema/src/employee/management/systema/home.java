package employee.management.systema;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class home extends JFrame implements ActionListener{
    JButton view,update,remove,add;
    home()
    {
     setLayout(null);
     setSize(1120,630);
     setLocation(250,100);
     setVisible(true);
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);
        
        JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(620,20,400,40);
        heading.setFont(new Font("serif",Font.BOLD,25));
        image.add(heading); 
        
        add=new JButton("ADD EMPLOYEE");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);
        image.add(add);
        
         view=new JButton("view EMPLOYEE");
        view.setBounds(820,80,150,40);
        view.addActionListener(this);
        image.add(view);
        
       update=new JButton("update EMPLOYEE");
        update.setBounds(650,140,150,40);
        update.addActionListener(this);
        image.add(update);
        
            remove=new JButton("remove EMPLOYEE");
        remove.setBounds(820,140,150,40);
        remove.addActionListener(this);
        image.add(remove);
        
        

}
public void actionPerformed(ActionEvent ae)
        {
           if(ae.getSource()==add)
           {
               
           }else if(ae.getSource()==view)
           {
               
           }
           else if(ae.getSource()==update)
           {
               
           }
           else 
           {
               
           }
    }
    public static void main(String[] arg)
    {
        new home();
    }
}
