import java.util.Scanner;
public class J_PS4_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the your income in LPA:");
        float tax = sc.nextFloat();
        float income = 3.3f;
        if (tax<2.5){
            tax = tax+0;
        }
        else if(tax>2.5f && tax<5.0f){
            tax = tax+0.05f * (income-2.5f);
        }
        else if(tax>5.0f && tax<10.0f){
            tax = tax+0.05f *(5.0f-2.5f);
            tax = tax+0.05f * (income-2.5f);
        }
        else if(tax>10.0f){
            tax = tax+0.05f *(5.0f-2.5f);
            tax = tax+0.05f * (income-2.5f);
            tax = tax+0.05f * (income-10.0f);
        }
        System.out.println(tax);

    }
}
