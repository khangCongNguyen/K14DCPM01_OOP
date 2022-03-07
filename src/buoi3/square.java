package buoi3;

public class square {
    String soundFile = "lạc trôi.aif";


   public square(String soundFile){
       this.soundFile=soundFile;
   }

    void rotate(){
        System.out.println("hinh vuong dang xoay theo chieu kim dong ho 360");
        this.playSound();
    }
    void playSound(){
        System.out.println("play file "+this.soundFile+"music");
    }
    
}
