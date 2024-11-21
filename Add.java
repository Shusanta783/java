import java.util.Scanner;
public class Add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two integer");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a +" + "+b +" = "+sum);
    }
}