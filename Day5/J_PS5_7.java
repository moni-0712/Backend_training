import java.util.Scanner;
public class J_PS5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int repeatCount = scanner.nextInt();
        int count = 0;
        while (count < repeatCount) {
            System.out.println(1);
            count++;
        }

        scanner.close();
    }
}
