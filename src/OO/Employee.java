package OO;

import java.util.Scanner;

public class Employee {
    //data employee
     String emName;
     double salary;

     Scanner input=new Scanner(System.in);

     //name employee
     String getEmName(){
         System.out.print("moi  nhap ten nhan vien:");
         emName=input.nextLine();
         return emName; 
     }
     // money salary
     double getSaLary(){
         System.out.println("hay nhap tien luong ban vao :");
         return salary;
     }

  
}
