package buoi3;

public class Circle {
    //attribute 
    String SoundFile = "chung ta khong thuoc vn.aif ";

    //method
    public Circle(String SoundFile){
        this.SoundFile=SoundFile;
    }
    void rotate(){
        System.out.println("xoay 366 theo huong kim dong ho");
        this.playSound();
    }
    void playSound(){
        System.out.println("play file "+this.SoundFile+"music");
    }
    
}
