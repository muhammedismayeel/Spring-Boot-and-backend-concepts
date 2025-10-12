import java.util.Scanner;
class day2{
    public static void main(String[]arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Negative");
        }
        else if (num > 0){
            System.out.println("positive");
        }
        else{
            System.out.println("Zero");
        }
        for(int i=1;i>=10;i++){
            System.out.println(num + "x" + i +"=" + (num*i));
        }
    }
}