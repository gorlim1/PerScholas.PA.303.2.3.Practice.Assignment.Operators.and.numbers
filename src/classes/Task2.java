package classes;

public class Task2 {

    Integer x = 150;
    Integer a = 225;
    Integer b = 1555;
    Integer c = 32456;

    public void task2() {

        System.out.println("Second Example");
        System.out.println("The binary representation of " + x + " is: " + Integer.toBinaryString(x));

        //150 right shifted by 2 results in dividing by 4, and therefore equals 37.5, rounded to 75 as an integer
        System.out.println("The binary representation of " + x + " after right shifting by 2 is: " + Integer.toBinaryString(x = x >> 2));
        System.out.println("The decimal representation of the binary number " + Integer.toBinaryString(x) + " is: " + x);
        System.out.println();

        System.out.println("The binary representation of " + a + " is: " + Integer.toBinaryString(a));
        System.out.println("The binary representation of " + a + " after right shifting by 2 is: " + Integer.toBinaryString(a = a >> 2));
        System.out.println("The decimal representation of the binary number " + Integer.toBinaryString(a) + " is: " + a);
        System.out.println();

        System.out.println("The binary representation of " + b + " is: " + Integer.toBinaryString(b));
        System.out.println("The binary representation of " + b + " after left shifting by 1 is: " + Integer.toBinaryString(b = b << 1));
        System.out.println("The decimal representation of the binary number " + Integer.toBinaryString(b) + " is: " + b);
        System.out.println();

        System.out.println("The binary representation of " + c + " is: " + Integer.toBinaryString(c));
        System.out.println("The binary representation of " + c + " after left shifting by 1 is: " + Integer.toBinaryString(c = c << 1));
        System.out.println("The decimal representation of the binary number " + Integer.toBinaryString(c) + " is: " + c);
        System.out.println();
    }
}