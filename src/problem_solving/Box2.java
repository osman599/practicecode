package problem_solving;

public class Box2 {
    double height, width, depth;// all are Instance variable without methode

    Box2 ( double height, double width, double depth){// all are local variable with a methode
        this.height = height;
        this.width = width; // this operator use for hiding Instance variable
        this.depth = depth;
    }

    void displayVol(){

        double vol = height*width*depth;
        System.out.println ( "Volume is : "+vol);
    }

    public static void main(String[] args) {

        Box2 box1= new Box2 (10, 10, 10);
        Box2 box2= new Box2 (20, 30, 10);

        box1.displayVol();
        box2.displayVol();

    }
}
