import java.util.Scanner;

public class Game {
    public static void playGame(Scanner scanner) {
        int botNumber = (int) (Math.random() * 100);
        System.out.println("Я загадую число...");
        System.out.println("Я число загадав , тепер ти маєш вгадати");
        System.out.println("Це число бота, щоб показав, що ок все): " + botNumber);
        boolean game = true;

        while (game) {
            int meNumber = scanner.nextInt();

            if (meNumber != botNumber) {
                System.out.println("Не вірно!!! Продовжуй вгадувати!");
            } else {
                System.out.println("Ти вгадав!");
                game = false;
            }
        }
    }

    public static void exit() {
        System.exit(0);
    }

}
