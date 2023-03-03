package ReturningValu;

public class ReturningValueDemo {
    int square ( int value){
        return value*value;
    }

    public static void main(String[]args){
        ReturningValueDemo ob1 =  new ReturningValueDemo();
        int result = ob1.square (5);
        System.out.println("square of 5 ="+result);

        ReturningValueDemo ob2 =  new ReturningValueDemo();
        System.out.println("square of 6 ="+ob1.square (6));

        ReturningValueDemo ob3 =  new ReturningValueDemo();
        System.out.println("square of 7 ="+ob1.square (7));
    }
}
