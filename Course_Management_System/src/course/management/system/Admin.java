/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener{
    Interface ob;
    Admin(){
      super("Course Management System");
        
       ob = new Interface();
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/third.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        JMenuItem m3 = new JMenuItem("New Course");
        master.setForeground(Color.BLUE);
        
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        m3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon2.png"));
        Image image3 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('B');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);
    
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        

  
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        
        JMenu assign = new JMenu("Assign");
        JMenuItem c1 = new JMenuItem("Assign Instructor to Course");
        JMenuItem c2 = new JMenuItem("Assign Student to Course");
        assign.setForeground(Color.BLUE);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        assign.add(c1);
        
        c2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image33));
        c2.setMnemonic('R');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        assign.add(c2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        
        
        JMenu fee = new JMenu("Register student/teacher");
        JMenuItem s1 = new JMenuItem("register");
        fee.setForeground(Color.BLUE);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        
        
        
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        

        master.add(m1);
        master.add(m2);
        master.add(m3);
        
        user.add(u1);
        user.add(u2);
        
        assign.add(c1);
        assign.add(c2);
        
        report.add(r1);
        report.add(r2);
        
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(assign);
        mb.add(report);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            ob.addStudent();
            
        }else if(msg.equals("New Faculty")){
            ob.addTeacher();
            
        }else if(msg.equals("New Course")){
            ob.addCourse();
            
        }else if(msg.equals("Student Details")){
            ob.studentDetails();
            
        }else if(msg.equals("Teacher Details")){
            ob.teacherDetails();
           
        }
        else if(msg.equals("Update Students")){
            ob.updateStudent();
           
        }
        else if(msg.equals("Update Teachers")){
            ob.updateTeacher();
           
        }
        
         else if(msg.equals("Assign Instructor to Course")){
            ob.instructorAssignedToCourse();
           
        }
         else if(msg.equals("Assign Student to Course")){
            ob.studentAssignedToCourse();
           
        }
         else if(msg.equals("Exit")){
            dispose();
            ob.project();
        }
        
    }
        
    
    
    public static void main(String[] args){
        new Admin().setVisible(true);
    }
}
