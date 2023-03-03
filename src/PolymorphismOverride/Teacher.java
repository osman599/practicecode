package PolymorphismOverride;

public class Teacher extends Student{

    @Override
    public void learnIt() {
        System.out.println(" Teacher says: its esy if you want to learn! ");
    }
}