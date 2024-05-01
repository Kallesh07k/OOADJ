/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package course.management.system;

    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;
    import java.sql.*;
    public class ViewNotes extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;

    ViewNotes()
    {
        super("viewnotes");
        setBackground(Color.white);
        setLayout(null);

        JLabel course = new JLabel("courseid:");
        course.setBounds(40,20,150,30);
        add(course);

        t1=new JTextField();
        t1.setBounds(200,20,190,30);
        add(t1);



        b1 = new JButton("View notes");
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

   
        try{
                conn con = new conn();
                String u = t1.getText();
                /*String v = t1.getText();
                String w=  t3.getText();*/

                String q = "select notes from notes where courseid='"+u+"' ";
                System.out.println("her");

                ResultSet rs = con.s.executeQuery(q);
                
                while(rs.next())
                {
                  String columnName1= rs.getString("notes");

                  JOptionPane.showMessageDialog(null,columnName1);
                  System.out.println(columnName1);
                }

            }
            catch(Exception e){
                System.out.println("The error is:"+e);
            }
        dispose();
    }
    


    public static void main(String[] arg){
       ViewNotes r = new ViewNotes();
    }    
}