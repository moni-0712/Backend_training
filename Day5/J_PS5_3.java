import java.util.Scanner;
public class J_PS5_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number");
        int n = scanner.nextInt();

        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n * i);
        }
        scanner.close();
    }
}
