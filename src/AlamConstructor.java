public class AlamConstructor { // Constructor replace with Teacher

        String name;
        String department;
        int phone;

    AlamConstructor(String n, String s, int p) {
            name = n;
            department = s;
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

            Teacher teacher3 = new Teacher("Shadhin", "JVM", 1798684395);
            teacher3.displayInformation();
        }
    }
