/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author achyu
 */
public class CreateAssignment extends JFrame implements ActionListener {

JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2;
 CreateAssignment()
 {
     super("Create Assignment");
      setBackground(Color.white);
     setLayout(null);
     //f = new JFrame("assignment");
     //f.setBackground(Color.white);
     //f.setLayout(null);
     
     JLabel course = new JLabel("Course id:");
     course.setBounds(40,20,150,30);
     add(course);
     
     t1=new JTextField();
     t1.setBounds(200,20,190,30);
     add(t1);
     
     
     
     JLabel assignmentName = new JLabel("Assignment Name:");
     assignmentName.setBounds(40,60,150,30);
     add(assignmentName);
     
     t2=new JTextField();
     t2.setBounds(200,60,190,30);
     add(t2);
     
     JLabel assignmentDesc = new JLabel("Assignment Description:");
     assignmentDesc.setBounds(40,100,150,30);
     add(assignmentDesc);
     
     t3=new JTextField();
     t3.setBounds(200,100,190,30);
     add(t3);
     
     
     
      b1 = new JButton("Create");
      b1.setBounds(40,160,120,30);
      b1.setFont(new Font("serif",Font.BOLD,15));
      //b1.addActionListener(this);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      add(b1);
      b1.addActionListener(this);
      
       setVisible(true);
        setSize(600,300);
        setLocation(500,300);
 }
 
public void actionPerformed(ActionEvent ae){
        try{
            String cid = t1.getText();
            String name = t2.getText();
            String desc = t3.getText();
            conn con = new conn();

            String q1 = "select * from course where courseid='"+cid+"'";
            ResultSet rs1 = con.s.executeQuery(q1); 
            if(!rs1.next()){
                JOptionPane.showMessageDialog(null, "Invalid Course ID");
                setVisible(false);
            }

            else{
                System.out.println(); 
               
                String q2 = "insert into assignment values('"+cid+"','"+name+"','"+desc+"')";
                con.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                setVisible(false);
            }
        }
        catch(Exception ee){
                System.out.println("The error is:"+ee);
        }
    
}

     public static void main(String[] arg){
        CreateAssignment l = new CreateAssignment();
    }  
  
    
}
