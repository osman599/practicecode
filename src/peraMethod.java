public class PeraMethod {

    String name;
    String department;
    int phone;

    void setInformation(String n, String d, int ph) {
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

        PeraMethod teacher1 = new PeraMethod();
        teacher1.setInformation("Mainul Hasan", "JVM", 1798684399);
        teacher1.displayInformation();


        PeraMethod teacher2 = new PeraMethod();
        teacher2.setInformation("Robiul Islam", "JVM", 1798684396);
        teacher2.displayInformation();


        PeraMethod teacher3 = new PeraMethod();
        teacher3.setInformation("Shadhin", "JVM", 1798684395);
        teacher3.displayInformation();
    }

}