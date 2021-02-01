package Ray.Andy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if (max < number){
                    max = number;
                }
                if (min > number){
                    min = number;
                }
            } else {
                System.out.println("Max is " + max);
                System.out.println("Min is " + min);
                break;
            }

            scanner.nextLine(); //handle input
        }

        scanner.close();
    }
}
