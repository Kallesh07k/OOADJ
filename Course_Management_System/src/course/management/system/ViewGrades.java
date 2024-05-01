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
public class ViewGrades extends JFrame implements ActionListener{

JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3,t4;
JButton b1,b2;
  
ViewGrades()
{
     super("viewgrades");
     setBackground(Color.white);
     setLayout(null);
     
     JLabel course = new JLabel("course id:");
     course.setBounds(40,20,150,30);
     add(course);
     
     t1=new JTextField();
     t1.setBounds(200,20,190,30);
     add(t1);
     
     
     
     /*JLabel assignmentName = new JLabel("assignment name:");
     assignmentName.setBounds(40,60,150,30);
     add(assignmentName);
     
     t1=new JTextField();
     t1.setBounds(200,60,190,30);
     add(t1);
     
      JLabel student = new JLabel("student name:");
     student.setBounds(40,90,150,30);
     add(student);
     
     t3=new JTextField();
     t3.setBounds(200,90,190,30);
     add(t3);*/
          
     
     
    b1 = new JButton("View Grade");
      b1.setBounds(40,170,120,30);
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
      //  if(ae.getSource()==b1)
      {
            try{
                conn con = new conn();
                 String u = t1.getText();
                //String v = t1.getText();
                //String w=  t3.getText();
                  
                String q = "select grade from marks where marks.courseid='"+u+"'  ";
            
                 ResultSet rs = con.s.executeQuery(q);
                  while(rs.next())
        {
        String columnName1= rs.getString("grade");
        
        JOptionPane.showMessageDialog(null,columnName1);
        System.out.println(columnName1);
      }
  }

                
                
            catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
}

        
    public static void main(String[] arg){
       ViewGrades r=new ViewGrades();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
