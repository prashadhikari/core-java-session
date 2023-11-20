package datatype;

public class DataTypePractice {

    public static void main(String[] args) {
        //data_type variable_name = value;

        int numericalData = 2;
        numericalData = 5;

        final double PI_VALUE;
        PI_VALUE = 3.14;

       //PI_VALUE = 2.14; // cannot do this

        //Integer type
        byte b = 127;
        short s = 32000;
        int i = 2000000000;
        long l = 9876543210324324L; // if L is added at the end it supports more numbers
        //int and long is used the most

        //Floating point type
        float f = 2.14F; // writing F in the end makes it understand that its a float
        double lat = 27.1234567890123456789;

        System.out.println(lat);

        //Character type
        char c = 'a';

        //Boolean Type
        boolean isActive = false;

        //String (NOT PRIMITIVE TYPE)
        String name = "Java Class";

    }
}
