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
public class GradeAssignment extends JFrame implements ActionListener {

JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3,t4;
JButton b1,b2;
  
GradeAssignment()
{
     super("gradeassignment");
     setBackground(Color.white);
     setLayout(null);
     
     JLabel course = new JLabel("Course-ID:");
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
     
      JLabel student = new JLabel("Student SRN:");
     student.setBounds(40,100,150,30);
     add(student);
     
     t3=new JTextField();
     t3.setBounds(200,100,190,30);
     add(t3);
     
     
     
     JLabel grade = new JLabel("Grade:");
     grade.setBounds(40,140,150,30);
     add(grade);
     
     t4=new JTextField();
     t4.setBounds(200,140,190,30);
     add(t4);
     
     
     
     
      b1 = new JButton("Grade");
      b1.setBounds(40,180,120,30);
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
            String srn = t3.getText();
            String grade = t4.getText();
            conn con = new conn();
            String notvalid = "";
            boolean flag = true;

            String q1 = "select * from course where courseid='"+cid+"'";
            ResultSet rs1 = con.s.executeQuery(q1); 
            if(!rs1.next()){
                notvalid = "Invalid Course ID";
                flag = false;
            }
            
            String q2 = "select * from student where srn='"+srn+"'";
            ResultSet rs2 = con.s.executeQuery(q2); 
            if(!rs2.next()){
                notvalid = "Invalid SRN";
                flag = false;
            }
            
            String q3 = "select * from assignment where title='"+name+"'";
            ResultSet rs3 = con.s.executeQuery(q3); 
            if(!rs3.next()){
                notvalid = "Invalid assignment name";
                flag = false;
            }
            
            if(!flag){
                JOptionPane.showMessageDialog(null, notvalid);
                setVisible(false);
            }

            else{
                System.out.println(); 
               
                String q4 = "insert into marks values('"+cid+"','"+srn+"','"+grade+"')";
                con.s.executeUpdate(q4);
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                setVisible(false);
            }
        }
        catch(Exception ee){
                System.out.println("The error is:"+ee);
        }
}
        
    public static void main(String[] arg){
       GradeAssignment r=new GradeAssignment();
        
    }
}