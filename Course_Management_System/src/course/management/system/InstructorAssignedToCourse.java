/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.management.system;

/**
 *
 * @author aparna
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class InstructorAssignedToCourse extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2; 

    InstructorAssignedToCourse()
    {
    super("InstructorAssignedToCourse");
    setBackground(Color.white);
    setLayout(null);
     //f = new JFrame("assignment");
     //f.setBackground(Color.white);
     //f.setLayout(null);
     
     JLabel course = new JLabel("courseid:");
     course.setBounds(40,20,150,30);
     add(course);
     
     t1=new JTextField();
     t1.setBounds(200,20,190,30);
     add(t1);
     
     
     
     JLabel SRN = new JLabel("EmpID:");
     SRN.setBounds(40,60,150,30);
     add(SRN);
     
     t2=new JTextField();
     t2.setBounds(200,60,190,30);
     add(t2);
     
     
     
      b1 = new JButton("Add");
      b1.setBounds(40,140,120,30);
      b1.setFont(new Font("serif",Font.BOLD,15));
      b1.addActionListener(this);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      add(b1);
      //b1.addActionListener (this);
      
       setVisible(true);
        setSize(600,300);
        setLocation(500,300);}

    public void actionPerformed(ActionEvent ae){
        try{
            String u = t1.getText();
            String v = t2.getText();
            conn con = new conn();
            
            String q1 = "select * from course where courseid='"+u+"'";
            ResultSet rs1 = con.s.executeQuery(q1); 
            if(!rs1.next()){
                JOptionPane.showMessageDialog(null, "Invalid Course ID");
                setVisible(false);
            }
            else{
            
                String  q2 = "select * from teacher where empid='"+v+"'";
                ResultSet rs2 = con.s.executeQuery(q2); 

                if(!rs2.next()){
                    JOptionPane.showMessageDialog(null, "Invalid Employee ID");
                    setVisible(false);
                }

                else{
                    String str ="insert into teaches set courseid='"+u+"',empid='"+v+"'";
                    con.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"successfully updated");
                    setVisible(false);
                }
            }

        }catch(Exception e){
            System.out.println("The error is:"+e);
        }
    }


     public static void main(String[] arg){
        InstructorAssignedToCourse l = new InstructorAssignedToCourse();
    }  
}