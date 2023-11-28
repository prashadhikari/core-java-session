package oopconcept.inheritance;

public class SchoolApp {
    public static void main(String[] args) {

        Student prash = new Student();
        prash.setName("Prash");
        prash.setAge(25);
        prash.setGender("Male");
        prash.setRollNumber(2);

        Teacher taman = new Teacher();
        taman.setName("Taman");
        taman.setAge(30);
        taman.setGender("Male");
        taman.setSubject("Java");

        Staff tony = new Staff();
        tony.setName("Tony");
        tony.setAge(40);
        tony.setGender("Male");
        tony.setJobResponsibility("Doctor");


    }
}
