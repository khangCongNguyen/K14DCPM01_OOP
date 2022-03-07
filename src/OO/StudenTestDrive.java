package OO;

import java.util.jar.Attributes.Name;

public class StudenTestDrive {
    public static void main(String[] args) {
        Student tuanStudent=new Student("nam",13,"tuan","CNTT",1.5 );
        Student Ducstudent=new Student("nam",13,"duc","CNTT",2.0);
        Student SEkhangpro=new Student("BEDE",11,"MỸ","CNTT",1.2);
        

        tuanStudent.dangKyMonHoc();
        tuanStudent.hoc();
        tuanStudent.thi();

        Ducstudent.dangKyMonHoc();
        Ducstudent.hoc();
        Ducstudent.thi();

        SEkhangpro.dangKyMonHoc();
        SEkhangpro.hoc();
        SEkhangpro.thi();

        

    }
    
}
