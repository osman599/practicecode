public class CallByReference {
    String name;
    void change (CallByReference r2){
        r2.name = "Sakib";
    }

    public static void main(String[] args) {

        CallByReference r1 = new CallByReference();
        r1.name = "Robiul";
        System.out.println("before call : "+r1.name);

        r1.change (r1);
        System.out.println("after call : "+r1.name);
    }
}
