package buoi3;

public class Circle {
    //attribute 
    String SoundFile = " mô tả :chung ta khong thuoc vn.aif ";

    //method
    public Circle(String SoundFile){
        this.SoundFile=SoundFile;
    }
    void rotate(){
        //code xử lý 
        System.out.println("xoay 360 độ  theo chiều kim đồng hồ");
        this.playSound();
    }
    void playSound(){
        //code xử lý cho play âm thanh aif
        System.out.println("play file "+this.SoundFile+"music");
    }
    
}
