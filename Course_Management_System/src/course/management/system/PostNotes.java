/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.management.system;
        
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author aparna
 */
public class PostNotes extends JFrame implements ActionListener{
JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,submit;
StringBuffer sb;

PostNotes()
 {
     super("Post Notes");
     setBackground(Color.white);
     setLayout(null);
     
     JLabel course = new JLabel("Course ID:");
     course.setBounds(40,20,150,30);
     add(course);
     
     t1=new JTextField();
     t1.setBounds(200,20,190,30);
     add(t1);
     
     submit=new JButton("Submit");
     submit.setBounds(200,50,190,30);
     add(submit);
     submit.addActionListener(this);
     this.getRootPane().setDefaultButton(submit);
     
      
     JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());
     j.showSaveDialog(null);
     setVisible(true);
     setSize(600,300);
     setLocation(500,300);
     try{
     String filename = j.getSelectedFile().getAbsolutePath();
     InputStream inputStream = new FileInputStream(filename);
    Scanner sc = new Scanner(inputStream);
    sb = new StringBuffer();
    while(sc.hasNext()) {
        sb.append(sc.nextLine()+"\n");
        }
    }
    catch(Exception e){
    }
     
}
   public static void main(String[] arg){
        PostNotes l = new PostNotes();
    }  
  


public void actionPerformed(ActionEvent ae){
        try{
            String cid = t1.getText();
            conn con = new conn();

            String q1 = "select * from course where courseid='"+cid+"'";
            ResultSet rs1 = con.s.executeQuery(q1); 
            if(!rs1.next()){
                JOptionPane.showMessageDialog(null, "Invalid Course ID");
                setVisible(false);
            }

            else{
                System.out.println(sb); 
               
                String q2 = "insert into postnotes values('"+cid+"','"+sb+"')";
                con.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                setVisible(false);
            }
        }
        catch(Exception ee){
                System.out.println("The error is:"+ee);
        }
    }
   
}