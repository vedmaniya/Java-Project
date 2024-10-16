package employee.management.systema;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
public class addemployee extends JFrame{
    addemployee()
    {
       
        Random ran=new Random();
        int number=ran.nextInt(999999);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("ADD EMPLOYEE DETAIL");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25)); 
        add(heading);
        
        
        JLabel labelname=new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelname);
        
        JTextField tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        
        JLabel labelfname=new JLabel("Father's Name");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelfname);
        
        JTextField tffname=new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        JLabel dob=new JLabel("DATE OF BIRTH");
        dob.setBounds(50,200,150,30);
        dob.setFont(new Font("serif",Font.PLAIN,20));
        add(dob);
        
        JDateChooser  dcdob=new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);
        
        JLabel labelsalary=new JLabel("salary");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("serif",Font.PLAIN,20));
        add(labelsalary);
        
        JTextField tffsalary=new JTextField();
        tffsalary.setBounds(600,200,150,30);
        add(tffsalary);
        
        JLabel labeladdress=new JLabel("Address");
        labeladdress.setBounds(50,250,150,30);
        labeladdress.setFont(new Font("serif",Font.PLAIN,20));
        add(labeladdress);
        
        JTextField tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);

        JLabel labelphone=new JLabel("phone");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("serif",Font.PLAIN,20));
        add(labelphone);
        
        JTextField tfphone=new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        JLabel labelemail=new JLabel("Email");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("serif",Font.PLAIN,20));
        add(labelemail);
        
        JTextField tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel labeleducation=new JLabel("Highest Education");
        labeleducation.setBounds(400,300,150,30);
        labeleducation.setFont(new Font("serif",Font.PLAIN,20));
        add(labeleducation);
        
        String Courses[]={"BBA","BCA","BCOM","BTECH","MTECH","MCA","MA"};
        JComboBox  cbeducation=new JComboBox(Courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600,300,150,30);
        add(cbeducation);
        
        JLabel labeldesignetion=new JLabel("Designetion");
        labeldesignetion.setBounds(50,350,150,30);
        labeldesignetion.setFont(new Font("serif",Font.PLAIN,20));
        add(labeldesignetion);
        
        JTextField tfdesignetion=new JTextField();
        tfdesignetion.setBounds(200,350,150,30);
        add(tfdesignetion);

        JLabel labeladhar=new JLabel("Adhar number");
        labeladhar.setBounds(400,350,150,30);
        labeladhar.setFont(new Font("serif",Font.PLAIN,20));
        add(labeladhar);
        
        JTextField tfadhar=new JTextField();
        tfadhar.setBounds(600,350,150,30);
        add(tfadhar);
        
        JLabel labempid=new JLabel("employee id");
        labempid.setBounds(50,400,150,30);
        labempid.setFont(new Font("serif",Font.PLAIN,20));
        add(labempid);
        
        JLabel lblempid=new JLabel(""+number);
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempid);
        
        JButton add=new JButton("Add Details");
        add.setBounds(250,550,150,40);
        //add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        JButton back=new JButton("Add Employee");
        back.setBounds(450,550,150,40);
       // back.addActionListener(this);
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       add(back);
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    public static void main(String[] arg)
    {
        new addemployee();
    }
}
