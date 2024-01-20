import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player Name: ");
        String uname= sc.nextLine();
        System.out.println("Welcome ! "+uname+", to play Rock ,Paper, Scissor");
        while (true) {
            System.out.println("Enter 1=(Rock), 2=(Paper), 3=(Scissor) as per your choice: ");
            int choice = sc.nextInt();
            if (choice<1 && choice>3){
                System.out.println("Enter your choice !");
                continue;
            }
            Random rand = new Random();
            int compChoice = rand.nextInt(4);
            System.out.println("Computer chose "+compChoice);
            String result = checkWinner(choice,compChoice);
            System.out.println(result);

            System.out.println("Do you want to play again ? (y/n)\nEnter your choice (y/n): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("y")){
                System.out.println("Thanks for playing !");
                break;
            }
        }
    }
    static String checkWinner(int userChoice,int compChoice){
        if (userChoice==compChoice){
            return "It's a Tie";
        } else if (userChoice==1 && compChoice==3 || userChoice==2 && compChoice==1 || userChoice==3 && compChoice==2) {
            return "You Win !";
        } else {
            return "You Lose ! \nComputer Wins";
        }
    }
}