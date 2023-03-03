package problem_solving;

public class Box {
    double height, width, depth;// all are Instance variable without methode

    Box ( double h, double w, double d){// all are local variable with a methode
        height=h;
        width=w;
        depth=d;
    }

    void displayVol(){

        double vol = height*width*depth;
        System.out.println ( "Volume is : "+vol);
    }

    public static void main(String[] args) {

        Box box1= new Box (10, 10, 10);
        Box box2= new Box (20, 30, 10);

        box1.displayVol();
        box2.displayVol();

    }
}
