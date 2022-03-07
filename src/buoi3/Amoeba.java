package buoi3;

public class Amoeba {
     //attribute 
     String SoundFile = " mô tả :chung ta khong thuoc vn.aif ";
    double xpoint;
    double ypoint;
     //method
     public Amoeba(String SoundFile){
         this.SoundFile=SoundFile;
     }

     public Amoeba(String SoundFile,double xpoint, double ypoint){
         this(SoundFile);
         this.xpoint=xpoint;
         this.ypoint=ypoint;
     }

     void rotate(){

         //code xử lý 
         System.out.println("xoay 360 độ  theo chiều kim đồng hồ và xpoint:"+this.xpoint+"ypoint"+this.ypoint);
         this.playSound();

     }

     void playSound(){
         //code xử lý cho play âm thanh file.hif
         System.out.println("play file "+this.SoundFile+"music");
     }
    
}
