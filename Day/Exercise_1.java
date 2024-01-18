import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Enter your marks of each Subject");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Eng: ");
        float m1 = sc.nextFloat();
        System.out.println("Enter Marks of Hindi: ");
        float m2 = sc.nextFloat();
        System.out.println("Enter Marks SSc: ");
        float m3 = sc.nextFloat();
        System.out.println("Enter Marks Sc: ");
        float m4 = sc.nextFloat();
        System.out.println("Enter Marks Maths: ");
        float m5 = sc.nextFloat();
        float Percentage = ((m1+m2+m3+m4+m5)/500)*100;
        System.out.println(Percentage);

    }
}
