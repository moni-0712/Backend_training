import java.util.Scanner;
public class J_PS4_2 {
    public static void main(String[] args) {
        //QUESTION2
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks Eng: ");
        float m1 = sc.nextFloat();
        System.out.println("Enter the marks SSc: ");
        float m2 = sc.nextFloat();
        System.out.println("Enter the marks Sc: ");
        float m3 = sc.nextFloat();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are Pass");
        }
        else{
            System.out.println("You are Fail");
        }
    }
}
