import java.util.Scanner;

class day1{
    public static void main(String[]arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 ");
        int num2 = sc.nextInt();

        System.out.println("Sum : " + (num1+num2));
        System.out.println("Difference: " + (num1-num2));
        System.out.println("Product:" + (num1*num2));
        System.out.println("Quotient: " + (num1/num2));
    }
}