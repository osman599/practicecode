package PolymorphismOverride;

 class MD {
   int Salary = 10000;
}
class GeneralManager extends MD {
    String name = " Osman";

    void Office (){
        System.out.println(" General Manager name is : " + name);
        System.out.println(" Managing Director name is : " +super.Salary);
    }
}

class office {
    public static void main(String[] args) {
        GeneralManager gm = new GeneralManager();
        gm.Office();
    }
}