import java.util.Scanner;
public class EvenOdd {
    public static void findEvnOdd(int numberOne){
        if(numberOne % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number odd");
        }
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        int numberOne = input.nextInt();
         input.nextLine();
         findEvnOdd(numberOne);
    }
}
