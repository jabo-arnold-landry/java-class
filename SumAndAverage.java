public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0, upperbound = 100;
        for (int i = 1; i <= upperbound; i++)
            sum += i;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / (double) upperbound));
    }
}
