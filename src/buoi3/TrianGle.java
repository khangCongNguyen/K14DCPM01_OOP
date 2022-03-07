package buoi3;

public class TrianGle {
    //attribute-thuộc tính
    String soundFile ="em cua ngay hom  qua .aif";
    //method-phương thức
    public TrianGle(String soundFile){
        this.soundFile=soundFile;
    }
    void rotate(){
        System.out.println("quay 360 theo kim dong ho");
        this.playSound();

    }
    void playSound(){
        System.out.println("play file"+this.soundFile+"music");
    }
    
}
