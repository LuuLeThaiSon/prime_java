import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        String result = "prime";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number < 2) {
            result = "Not a prime";
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0){
                    result = "Not a prime";
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
