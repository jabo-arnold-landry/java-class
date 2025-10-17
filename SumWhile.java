public class SumWhile {
    public static void main(String[] args) {
        int sum = 0, i = 1, upperbound = 100;
        while (i <= upperbound) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / (double) upperbound));
    }
}
