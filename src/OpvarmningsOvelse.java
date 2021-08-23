import java.util.Scanner;

public class OpvarmningsOvelse {

    public static void main(String[] args) {

        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int x = scanner.nextInt();

        System.out.println("input another number: ");
        int y = scanner.nextInt();

        int sum = x + y;
        int antalTal = 2;
        int gennemSnit = sum / antalTal;

        String stop = "";


        System.out.println("Average of all numbers are: " + gennemSnit);
        for (int i = 0; i < 10; i--) {
            stop = scanner.next();

            if (stop.equals("q") || stop.equals("Q")) {
                System.out.println("You have stopped the program!");
                break;
            } else {
                System.out.println("You didnt end the program with Q or q - System continues");

                System.out.print("Input another number: ");
                y = scanner.nextInt();
                sum = sum + y;
                gennemSnit = sum / ++antalTal;
                System.out.println("Average of all numbers are: " + gennemSnit);

            }

        }
    }
}

