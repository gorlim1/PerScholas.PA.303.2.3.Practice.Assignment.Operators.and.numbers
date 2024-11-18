package classes;

public class Task3 {

    Integer x = 7;
    Integer y = 17;
    Integer z;

    public void task3() {

        System.out.println("Third Example");
        System.out.println("The binary representation of " + x + " is: " + Integer.toBinaryString(x));
        System.out.println("The binary representation of " + y + " is: " + Integer.toBinaryString(y));

        //The binary representations of 7 and 17 are 111 and 10001. The bitwise & operator will compare each respective
        // digit of the two binary numbers, and return 1 if both are 1, and 0 if either are 0 in any column. The result
        // will be the binary number 1, which is equal to the decimal 1
        System.out.println("The binary representation of " + x + " and " + y + " after applying the bitwise & operator" +
                " is: " + (z = x & y));
        System.out.println("The decimal representation of the binary number " + Integer.toBinaryString(z) + " is: " + z);
        System.out.println();
        System.out.println();
    }
}