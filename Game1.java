import java.util.Scanner;

class Guess {
    private final int randomNumber;

    public Guess() {
        randomNumber = (int) (Math.random() * 100) + 1;
    }

    public boolean guessNo(int userGuess) {

        if (userGuess == randomNumber) {
            System.out.println("🎉 Congratulations! You guessed the correct number.");
            return true;
        }
        else if (userGuess > randomNumber) {
            System.out.println("Your guess is too high.");
        }
        else {
            System.out.println("Your guess is too low.");
        }

        return false;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

public class Game1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Guess g = new Guess();

        boolean guessed = false;

        while (!guessed) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = sc.nextInt();

            guessed = g.guessNo(userGuess);
        }

        System.out.println("Game Over!");
        sc.close();
    }
}