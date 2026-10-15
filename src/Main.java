import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word you want your friend to guess!");
        String wordGuessed = s.next();

        char[] wordChar = new char[wordGuessed.length()];
        StringBuilder currentGuesses = new StringBuilder();

        for(int x = 0; x < wordGuessed.length(); x++){
            wordChar[x] = wordGuessed.charAt(x);
            currentGuesses.append("_");
        }

        String hello = currentGuesses.toString();

        boolean loop = true;
        int numOfGuesses = 0; //0 to 6
        char guess = ' ';

        while(loop){
            System.out.println("Guess the word!");
            guess = s.next().charAt(0);

            if(numOfGuesses == 6){
                loop = false;
                System.out.println("RIP MR. HANG MAN! The word was: " + wordGuessed);
                break;
            }

            if(GuessChecker.checker(guess, wordChar)){
                String tempGuesser = guessedWord.guessedString(guess, wordChar, hello);
                hello = tempGuesser;

                if(hello.equals(wordGuessed)){
                    System.out.println("YOU WIN SIR!");
                    break;
                }
                System.out.println(tempGuesser);

                System.out.println(Output.hangMan(numOfGuesses));
            }else{
                numOfGuesses++;
                System.out.println(Output.hangMan(numOfGuesses));

            }

        }



    }
}