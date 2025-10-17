import java.util.Scanner;

public class CompareThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c)
            System.out.println("All numbers are equal");
        else if (a != b && b != c && a != c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal nor all are different");
    }
}
