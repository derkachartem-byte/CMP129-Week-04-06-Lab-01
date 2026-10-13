import java.util.Scanner;
public class DriversLicenseExam {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] answers = {"A", "D", "B", "B", "C", "B", "A", "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A", "D", "B"};
        String[] user = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        int counter = 0, wrong = 0; 
        String tryAgain = "";
        for (int i = 0; i < 20; i ++){
            System.out.println("Answer for question " + (i + 1) + ": ");
            user[i] = input.nextLine();
            while (!(user[i].equals("A") || user[i].equals("B") || user[i].equals("C") || user[i].equals("D"))){
                System.out.println("Only Answers A, B, C, or D are allowed\nTRY AGAIN!!!");
                System.out.println("Answer for question " + (i + 1) + ": ");
                user[i] = input.nextLine();
            }
        }
        for (int i = 0; i < 20; i ++){
            if (user[i].equals(answers[i])){
                counter = counter + 1;
            }
            else {
                wrong = wrong + 1;
                tryAgain += (i + 1) + ", " ;
            }
        }
        if (counter >= 15){
            System.out.println("Correct Asnwers: " + counter);
            System.out.println("Incorrect Answers: " + wrong);
            System.out.println("Result: PASS");
            System.out.println("You got " + tryAgain + "wrong.");
        } else {
            System.out.println("Correct Answers: " + counter);
            System.out.println("Incorrect Answers: " + wrong);
            System.out.println("Result: FAIL, maybe next time...");
            System.out.println("You got " + tryAgain + "wrong.");
        }


    }
}
