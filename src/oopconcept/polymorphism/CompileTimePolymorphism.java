package oopconcept.polymorphism;

public class CompileTimePolymorphism {

    public static void main(String[] args) {
        CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();

        compileTimePolymorphism.add(2,3);

        compileTimePolymorphism.add(5,10);

        compileTimePolymorphism.add(5.2,10.5);


    }

    //function overloading example
    public void add(int a, int b){//This is a function // int a, int b are the parameters
        int result = a + b;
        System.out.println(result);
    }

    public void add(double a, double b){//This is a function // int a, int b are the parameters
        double result = a + b;
        System.out.println(result);
    }


}
