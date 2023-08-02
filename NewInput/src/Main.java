import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ку, я БОТ, який з тобою хоче грати в цікаву гру: Ти маєш вгадати число, яке я загадав");
        System.out.println("Зграємо? 1 - Так, 2 - Ні");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                playGame(scanner);
                break;
            case 2:
                Exit();
                break;
        }

    }

    public static void playGame(Scanner scanner) {
        int botNumber = (int) (Math.random() * 100);
        System.out.println("Я загадую число...");
        System.out.println("Я число загадав, тепер ти маєш вгадати");
        System.out.println("Це число бота, щоб показав, що ок все): " + botNumber);
        boolean game = true;

        while (game) {
            int meNumber = scanner.nextInt();

            if (meNumber != botNumber) {
                System.out.println("Не вірно! Продовжуй вгадувати!");
            } else {
                System.out.println("Ти вгадав!");
                game = false;
            }
        }
    }
    public static void Exit() {
        return;
    }
}
