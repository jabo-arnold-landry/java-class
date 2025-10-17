import java.util.Scanner;

public class CompareDecimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two floating-point numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (Math.round(a * 1000) == Math.round(b * 1000))
            System.out.println("Same up to three decimal places");
        else
            System.out.println("Different");
    }
}
