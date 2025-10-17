import java.util.Scanner;
public class CheckZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        int numberOne = input.nextInt();
        input.nextLine();
        if(numberOne < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is not positive");
        }
    }
}