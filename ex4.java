import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){

        System.out.println("What is your name?");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling the dice...");

        int die1 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1: "+ die1);

        int die2 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 2: "+ die2);

        int sum = die1 + die2;

        System.out.println("Total value: " + sum);

        if(sum > 7) System.out.println(name + " won");
        else System.out.println(name +  " lost");
    }
}
