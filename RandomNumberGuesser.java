import java.util.Scanner;

public class RandomNumberGuesser {
    private int numOfGuesses;
    private int correctNum;
    private int guess;
    private String guessString;
    Scanner inputSystem= new Scanner(System.in);
    public void playGame(){
        numOfGuesses=0;
        correctNum=(int)Math.floor(Math.random()*101);
        do {
            System.out.println("guess a number between 1 and 100");
            guessString=inputSystem.nextLine();
            try{
            guess=Integer.parseInt(guessString);
            attempt(guess);
            } catch(NumberFormatException error){
                System.out.println("that's not an integer, you silly goose");
            }
        }
        while(numOfGuesses<5);
    }
    private void attempt(int guess){
        if(guess>=correctNum-10 && guess<=correctNum+10){
            numOfGuesses++;
            System.out.print("good job! the correct answer was ");
            System.out.println(String.valueOf(correctNum));
        }else if(numOfGuesses<4){
            numOfGuesses++;
            System.out.print("Good try, but not close enough. You have made ");
            System.out.print(String.valueOf(numOfGuesses));
            System.out.println(" guesses");
        }else{
            numOfGuesses++;
            System.out.println("Game over!");
        }
    }
}
