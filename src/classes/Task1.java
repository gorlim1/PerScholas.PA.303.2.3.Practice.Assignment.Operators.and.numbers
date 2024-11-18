package classes;

public class Task1 {

    Integer x = 2;
    Integer a = 9;
    Integer b = 17;
    Integer c = 88;

    public void task1() {

        //The binary representation of 2 is 10
        //The binary value of 10 after left shifting by 1 is 100, whose decimal representation is 4
        System.out.println("First Example");
        System.out.println("The binary representation of " + x + " is: " + Integer.toBinaryString(x));
        System.out.println("The binary representation of " + x + " after left shifting by 1 is: " + Integer.toBinaryString(x = x << 1));
        System.out.println("The decimal representation of the binary number " + Integer.toBinaryString(x) + " is: " + x);
        System.out.println();

        System.out.println("The binary representation of " + a + " is: " + Integer.toBinaryString(a));
        System.out.println("The binary representation of " + a + " after left shifting by 1 is: " + Integer.toBinaryString(a = a << 1));
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
        System.out.println();
    }
}