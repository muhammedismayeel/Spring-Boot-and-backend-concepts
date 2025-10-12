import java.util.Scanner;

public class day3 {
    // Function to find the maximum element in the array
    static int findMax(int[] arr) {
        int max = arr[0]; // assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = findMax(numbers);
        System.out.println("Maximum = " + max);
    }
}
