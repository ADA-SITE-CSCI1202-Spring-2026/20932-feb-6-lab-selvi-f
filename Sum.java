import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First int:");
        int a = in.nextInt();
        System.out.print("Second int:");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum:" + sum);
    }
}
