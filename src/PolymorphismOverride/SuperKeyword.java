package PolymorphismOverride;

 class See  {
     String color = " Blue Water ";
}

class River extends See {
     String color = " Roily Water ";

     void printColor(){
         System.out.println(color);
         System.out.println(super.color);
     }
}

    class supertest {
        public static void main(String[] args) {
            River r = new River();
            r.printColor();

        }
    }