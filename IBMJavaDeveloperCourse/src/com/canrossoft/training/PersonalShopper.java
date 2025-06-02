package com.canrossoft.training;
import java.util.Scanner;

//Task 4: Create infinite loop
//Create an infinite loop that runs as long as the user wants the loop to run. The loop should exit when the user inputs Exit (ignoring the case).

public class PersonalShopper {
    String magicWord;
    String yourWord;

    public void buy(String w) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Infinite loop!");
            System.out.println("This is an infinite loop which keep asking until you enter the magic word \"Exit\" ");
            yourWord = s.nextLine();
            System.out.println("You enter: " + yourWord + " as magic word");
            System.out.println("Magic word is: " + magicWord);

        } while (!magicWord.equalsIgnoreCase(yourWord)); //Mientras la magicWord no sea yourWord .. seguimos haciendo

    }

    PersonalShopper (String magicWord){
       this.magicWord = magicWord;
    }
}
