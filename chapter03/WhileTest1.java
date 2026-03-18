import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        int random  = (int)(Math.random()*101);
        System.out.println("Guess a number between 0 and 100");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        int count  =1;
        while(guess != random){
            if(guess >random){
                System.out.println("Too high");
            }else{
                System.out.println("Too low");
            }
            System.out.println("Guess a number between 0 and 100");
             guess = sc.nextInt();
            count++;
        }
        System.out.println("You guessed it in " + count + " tries!");
    }
}
