public class Teacher {

    String name;
    String department;
    int phone;

    Teacher () {
        System.out.println("No Value");
    }
    Teacher (String a, String b, int p) {
        name = a;
        department = b;
        phone = p;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("department : " + department);
        System.out.println("phone : " + phone);
    }

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mainul Hasan", "JVM", 1798684399);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Robiul Islam", "JVM", 1798684396);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();
    }
}
