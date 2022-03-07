package OO;

public class Student {
    //attribute
   String gioiTinh;
   float tuoi;
   String name;
   String khoa;
   double diemTB;

   //mothod
   public Student (String gioiTinh,float tuoi,String name,String khoa, Double diemTb){
       this.name=name;
       this.gioiTinh=gioiTinh;
       this.diemTB=diemTB;
       this.khoa=khoa;
       this.tuoi=tuoi;

   }
   void hoc(){System.out.println("học lực tốt"+diemTB+"có cố gắn");};
   void thi(){System.out.println("ở lại r bạn ơi "+diemTB);};
   void dangKyMonHoc(){System.out.println("đăng ký môn "+khoa);};
    
    
}
