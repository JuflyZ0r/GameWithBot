import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ку, я БОТ, який з тобою хоче грати в цікаву гру: Ти маєш вгадати число, яке я загадав");
        System.out.println("Зграємо? 1 - Так, 2 - Ні");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                Game.playGame(scanner);
                break;
            case 2:
                Game.exit();
                break;
        }

    }


}
