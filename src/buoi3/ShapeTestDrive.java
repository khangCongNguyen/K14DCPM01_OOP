package buoi3;

public class ShapeTestDrive {
    public static void main(String[] args) {
        square square= new square("lac trôi .aif");
        square.rotate();
        square.playSound();

        Circle circle = new Circle("1");
        circle.rotate();
        circle.playSound();

        TrianGle trianGle = new TrianGle("111");
        trianGle.rotate();
        trianGle.playSound();
    }
    
}
