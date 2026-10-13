import java.util.Scanner;
import java.util.Random;
public class Lottery{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int[] lottery = {0, 0, 0, 0, 0};
        int[] user = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i ++){
            lottery[i] = random.nextInt(0, 10);
        }
        for (int i = 0; i < 5; i ++){
            System.out.println("Enter a winning number: ");
            user[i] = input.nextInt();
            while (user[i] > 9 || user[i] < 0){
                System.out.println("Only values between 0 and 9 are allowed\nRETRY: ");
                user[i] = input.nextInt();
            }
        }
        for (int i = 0; i < 5; i ++){
            if(lottery[i]==(user[i])){
                count = count + 1;
            }
        }
        if (count==5){
            System.out.println("Congradulations! You Win!\nYou Got All Numbers Correct!\nYou Win A Gazillion Dollars!");
        }
        else {
            System.out.print("Lottery Numbers: ");
            for(int i = 0; i < 5; i ++){
                System.out.print(lottery[i]);
            }
            System.out.print("\n");
            System.out.print("Your Numbers: ");
            for(int i = 0; i < 5; i ++){
                System.out.print(user[i]);
            }
            System.out.print("\nMatching Numbers: " + count);
            System.out.println("\n");
            System.out.println("Sorry...\nyou lost...\nMaybe next time...");
        }
    }
}
