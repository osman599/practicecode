public class NestedLoops {

    public static void main(String[]args){
        for (int i=0; i<5; i++){
            System.out.println(i);
            for (int j=1; j<=i; j++) {
                System.out.println(i + " " + j);
        }
        }
    }
}
