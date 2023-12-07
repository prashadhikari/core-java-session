package predefinedclass;

import java.util.Random;
import java.util.stream.IntStream;

public class MathPractice {
    public static void main(String[] args) {

        int absValue= Math.abs(-234);
        System.out.println(absValue);

        long sum = Math.multiplyExact(9635, 9655);
        System.out.println(sum);

        double ceilValue = Math.ceil(2.1);
        System.out.println(ceilValue);
        double floorValue = Math.floor(2.9);
        System.out.println(floorValue);
        double roundValue = Math.round(2.6);
        System.out.println(roundValue);

        double sqrtValue = Math.sqrt(64);
        System.out.println(sqrtValue);

        float signumValue = Math.signum(-2000);
        System.out.println(signumValue);

        Random random = new Random();
        long randomNumber = Math.round(Math.random() * 5) +1;
        System.out.println(randomNumber);


    }
}
