# Input/Output
## StdOut library
> print()

> println()

> printF() - gives more control
    ex. StdOut.printf("...", _thing to print_)
    ex 2. StdOut.print("%14.5f)
    String consists of the following:
    * %14 width of the field (add a negative to change direction)
        i.e.    14 => "             512"
               -14 => "512             "
    * .5 is precision (how many decimal points)
    * f is the conversion specificatino - convert this to a float

## StdIn library
can use this to get feedback from a user while the code is running 
``` Java
public class TwentyQuestions {

    public static void main(String[] args) {

        // Generate a number and answer questions
        // while the user tries to guess the value.
        int secret = 1 + (int) (Math.random() * 1000000);

        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int guess = 0; 
        while (guess != secret) {

            // Solicit one guess and provide one answer
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if      (guess == secret) StdOut.println("You win!");
            else if (guess  < secret)  StdOut.println("Too low ");
            else if (guess  > secret)  StdOut.println("Too high");
        }
    }
} 
```
the above code has a user repeatedly guess to try and get the number. it doesn't end until the number is guessed