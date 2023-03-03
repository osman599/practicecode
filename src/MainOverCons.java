public class ConstructorTeacher { // Constructor replace with Teacher

        String name;
        String department;
        int phone;

    ConstructorTeacher (){

            System.out.println("No value");
        }
    ConstructorTeacher (String n, String d) {
            name = n;
            department = d;
        }
    ConstructorTeacher(String n, String d, int ph) {
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

            ConstructorTeacher teacher1 = new ConstructorTeacher();
            teacher1.displayInformation();

            ConstructorTeacher teacher2 = new ConstructorTeacher("Shadhin", "JVM");
            teacher2.displayInformation();

            ConstructorTeacher teacher3 = new ConstructorTeacher("Mainul Hasan", "JVM", 1798684399);
            teacher3.displayInformation();
        }
    }

