
public class Constructor { // Constructor replace with Teacher

    String name;
    String department;
    int phone;

    Constructor (){
        System.out.println("No value");
    }
    Constructor(String n, String d, int ph) {
        name = n;
        department = d;
        phone = ph;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("department : " + department);
        System.out.println("phone : " + phone);
    }
    public static void main(String[] args) {

        AlamConstructor teacher1 = new AlamConstructor("Shadhin", "JVM", 1798684395);
        teacher1.displayInformation();

        AlamConstructor teacher2 = new AlamConstructor();
        teacher2.displayInformation();

        AlamConstructor teacher3 = new AlamConstructor("Mainul Hasan", "JVM", 1798684399);
        teacher3.displayInformation();
    }
}


