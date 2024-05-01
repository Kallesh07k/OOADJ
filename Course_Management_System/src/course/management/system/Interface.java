/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.management.system;

/**
 *
 * @author User
 */
public class Interface {
    AddCourse ac;
    AddStudent as;
    AddTeacher at;
    Admin a;
    CreateAssignment ca;
    GradeAssignment ga;
    InstructorAssignedToCourse iatc;
    InstructorView iv;
    Login l;
    Marks m;
    PostCourseInfo pci;
    PostNotes pn;
    Project p;
    StudentAssignedToCourse satc;
    StudentDetails sd;
    StudentLogin sl;
    StudentView sv;
    SubmitHomework sh;
    TeacherDetails td;
    TeacherLogin tl;
    UpdateStudent us;
    UpdateTeacher ut;
    ViewGrades vg;
    ViewNotes vn;

    public void addCourse(){
            ac = new AddCourse();
            ac.f.setVisible(true);
    }

    public void addStudent(){
            as = new AddStudent();
            as.f.setVisible(true);
    }

    public void addTeacher(){
            at = new AddTeacher();
            at.f.setVisible(true);
    }

    public void admin(){
            a = new Admin();
            a.setVisible(true);
    }

    public void createAssignment(){
            ca = new CreateAssignment();
            ca.setVisible(true);
    }

    public void gradeAssignment(){
            ga = new GradeAssignment();
            ga.setVisible(true);
    }

    public void instructorAssignedToCourse(){
            iatc = new InstructorAssignedToCourse();
            iatc.setVisible(true);
    }

    public void instructorView(){
            iv = new InstructorView();
            iv.setVisible(true);
    }

    public void login(){
            l = new Login();
            l.setVisible(true);
    }

    public void marks(){
            m = new Marks();
            m.setVisible(true);
    }

    public void postCourseInfo(){
            pci = new PostCourseInfo();
            pci.setVisible(true);
    }

    public void postNotes(){
            pn = new PostNotes();
            pn.setVisible(true);
    }

    public void project(){
            p = new Project();
            p.setVisible(true);
    }

    public void studentAssignedToCourse(){
            satc = new StudentAssignedToCourse();
            satc.setVisible(true);
    }

    public void studentDetails(){
            sd = new StudentDetails();
            sd.setVisible(true);
    }

    public void studentLogin(){
            sl = new StudentLogin();
            sl.setVisible(true);
    }

    public void studentView(){
            sv = new StudentView();
            sv.setVisible(true);
    }

    public void submitHomework(){
            sh = new SubmitHomework();
            sh.setVisible(true);
    }

    public void teacherDetails(){
            td = new TeacherDetails();
            td.setVisible(true);
    }

    public void teacherLogin(){
            tl = new TeacherLogin();
            tl.setVisible(true);
    }

    public void updateStudent(){
            us = new UpdateStudent();
            us.f.setVisible(true);
    }

    public void updateTeacher(){
            ut = new UpdateTeacher();
            ut.f.setVisible(true);
    }

    public void viewGrades(){
            vg = new ViewGrades();
            vg.setVisible(true);
    }

    public void viewNotes(){
            vn = new ViewNotes();
            vn.setVisible(true);
    }
}
