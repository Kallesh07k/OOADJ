package course.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author achyu
 */
class AddCourse implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    
    Interface ob;
    
     AddCourse()
             {
    
        ob = new Interface();
        f = new JFrame("Add Course");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/fifth.jpg"));
        Image i3 = img.getImage().getScaledInstance(920, 600,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);
    
        id8 = new JLabel("New course details");
        id8.setBounds(320,5,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);
        
        id1 = new JLabel("Course - Id");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);
        
        
        id2 = new JLabel("Course Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);
    
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
        f.getContentPane().setBackground(Color.WHITE);
   
}  
 public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
       
     
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into course values('"+a+"','"+bb+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Course Details Inserted Successfully");
                f.setVisible(false);
                
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            ob.project();
            
        }
    }
    public static void main(String[] arg){
        new AddCourse().f.setVisible(true);
    }
}