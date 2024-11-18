package classes;

public class Task6 {

    int a = 8;

    public void task6() {

        System.out.println("Sixth Example");
        System.out.println("The variable a's value is: " + a);

        //First way to demonstrate incrementing by 1
        a++;
        System.out.println("The variable a's value after a postfix increment is: " + a);

        //Second way to demonstrate incrementing by 1
        a += 1;
        System.out.println("The variable a's value after an addition by 1 assignment (a += 1) is: " + a);

        //Third way to demonstrate incrementing by 1
        ++a;
        System.out.println("The variable a's value after a prefix increment is: " + a);
        System.out.println();
        System.out.println();
    }
}