import java.util.Scanner;

public class Kalkulator {
    public  static void main (String[] args){
        System.out.println("Hello world! I'm Kalkulator!");

        Scanner scanner = new Scanner(System.in);

        String answere;
        boolean isExit;
        do {
            System.out.println("Želite li još računati? YES/NO");
            answere = scanner.next();

            switch (answere){
                case "YES":
                    isExit = false;
                    DoOperations();
                    break;
                case "NO":
                    isExit = true;
                    break;
                default:
                    isExit = false;
                    System.out.println("Wrong input! Please try again!");
                    break;
            }
        }while (!isExit);
    }

    private static void DoOperations() {
        System.out.println("Calculating!");
    }
}
