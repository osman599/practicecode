public class Overload {
    void add (){
        System.out.println("Nothing to add");
    }
    void add ( int a, int b){
        System.out.println(a+b);
    }
    void add (double a, double b){
        System.out.println(a+b);
    }
    void add (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Overload ob = new Overload ();
        ob.add();
        ob.add(5,6);
        ob.add(2.3,5.4);
        ob.add(4,5,8);
    }
}
