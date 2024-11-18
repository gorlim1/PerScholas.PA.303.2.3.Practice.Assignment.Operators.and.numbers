package classes;

public class Task7 {

    int x = 5;
    int y = 8;
    int sum = y + (++x);

    public void task7() {

        System.out.println("Seventh Example");
        System.out.println("The sum of y + (++x), where x and y are 5 and 8, is: " + sum);

        x = 5;
        sum = y + (x++);
        System.out.println("If the program is rerun with the increment operator changed from a prefix " +
                "to a postfix, then the sum of y + (x++), is: " + sum);
    }
}
