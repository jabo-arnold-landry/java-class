import java.util.Scanner;
public class SumOfN{
    public static int findSum(int num, int num2, int num3){
    return num + num2 + num3;
}
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first nbr");
        int numberOne = input.nextInt();
         input.nextLine();
        System.out.println("Enter first second");
        int numberTwo = input.nextInt();
         input.nextLine();
        System.out.println("Enter first third");
        int numberThree = input.nextInt();
         input.nextLine();
      System.out.println( findSum(numberOne, numberTwo, numberThree));
    }
}