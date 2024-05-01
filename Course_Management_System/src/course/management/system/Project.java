package course.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("Course Management System");
        setSize(1000,1000);
        
        createRight();
        createLeftBar();
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/first.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
    }
    public void createLeftBar(){
        JPanel panel= new JPanel(null);
        panel.setOpaque(true);
        panel.setBackground(Color.darkGray);
        panel.setBounds(0, 0, 500, 1000);
        JLabel heading= new JLabel("Course Management System");
        heading.setOpaque(true);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        heading.setForeground(Color.white);
        heading.setBackground(Color.darkGray);
        Dimension d= heading.getPreferredSize();
        heading.setBounds(250-(d.width/2),30, d.width, d.height);
        panel.add(heading);
        JLabel icon= new JLabel(new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/logo.jpg")));
        icon.setOpaque(true);
        icon.setBackground(Color.darkGray);
        icon.setBounds(150-100, 50, 200, 200);
        panel.add(icon);
        add(heading);
    }

    public void createRight(){
        JLabel heading= new JLabel("LOGIN");
        heading.setOpaque(true);
        heading.setForeground(Color.darkGray);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        Dimension d = heading.getPreferredSize();
        heading.setBounds(500+(250-(d.width/2)), 30, d.width, d.height);
        add(heading);
        
        JButton loginAsAdmin = new JButton("Login As Admin");
        loginAsAdmin.setFocusable(false);
        loginAsAdmin.setOpaque(true);
        loginAsAdmin.setBackground(Color.darkGray);
        loginAsAdmin.setForeground(Color.white);
        loginAsAdmin.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsAdmin.setBounds(500+(250-100), 250, 200, 40);
        loginAsAdmin.addActionListener(this);
        add(loginAsAdmin);
        
        JButton loginAsStudent= new JButton("Login As Student");
        loginAsStudent.setFocusable(false);
        loginAsStudent.setOpaque(true);
        loginAsStudent.setBackground(Color.darkGray);
        loginAsStudent.setForeground(Color.white);
        loginAsStudent.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsStudent.setBounds(500+(250-100), 500, 200, 40);
        loginAsStudent.addActionListener(this);
        add(loginAsStudent);
        
        JButton loginAsTeacher= new JButton("Login As Instructor");
        loginAsTeacher.setFocusable(false);
        loginAsTeacher.setOpaque(true);
        loginAsTeacher.setBackground(Color.darkGray);
        loginAsTeacher.setForeground(Color.white);
        loginAsTeacher.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsTeacher.setBounds(500+(250-100), 750, 200, 40);
        loginAsTeacher.addActionListener(this);
        add(loginAsTeacher);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
      //  System.out.println(msg);
        if(msg.equals("Login As Admin")){
            new Login().setVisible(true);
        }
        else if(msg.equals("Login As Student")){
            new StudentLogin().setVisible(true);
        }
        else if(msg.equals("Login As Instructor")){
            new TeacherLogin().setVisible(true);
        }
        dispose();
    }
    
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
