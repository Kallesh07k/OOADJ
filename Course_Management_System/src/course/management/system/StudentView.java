package course.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentView extends JFrame implements ActionListener{
    StudentView(){
        super("Course Management System");
        
       
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/third.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("View notes");
        JMenuItem m1 = new JMenuItem("notes");
        
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
    
        
        m1.addActionListener(this);
        
   
        JMenu user = new JMenu("View personal info");
        JMenuItem u1 = new JMenuItem("Student Details");
        user.setForeground(Color.RED);
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        u1.addActionListener(this);
        
        
        
        JMenu attendance = new JMenu("View grades");
        JMenuItem a1 = new JMenuItem("grades");
      
        attendance.setForeground(Color.BLUE);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon14.jpg"));
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        a1.addActionListener(this);
        
        JMenu exam = new JMenu("Submit homework");
        JMenuItem c1 = new JMenuItem("submit");
        
        exam.setForeground(Color.BLUE);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
         c1.addActionListener(this);
        
        
        
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
        
        user.add(u1);
        
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(exam);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent aep){
        String msg = aep.getActionCommand();
        if(msg.equals("notes")){
            new ViewNotes().setVisible(true);
            
        }
        if(msg.equals("submit")){
            new SubmitHomework().setVisible(true);
            
        }else if(msg.equals("grades")){
            new ViewGrades().setVisible(true);
            
        }else if(msg.equals("Teacher Details")){
            new TeacherDetails().setVisible(true);
           
        }
        else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
           
        }
        else if(msg.equals("Update Teachers")){
            new UpdateTeacher().f.setVisible(true);
           
        }
        
        else if(msg.equals("Exit")){
            dispose();
            new Project().setVisible(true);
        }
    }
              
    
    public static void main(String[] args){
        new StudentView().setVisible(true);
    }
    
}
