import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ку , я БОТ який з тобою хоче грати в цiкаву гру:Ти маєш вгадати число , яке я загадав");
        System.out.println("Згуляємо? 1 - Так 2 - Ноу");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1){

            int botNumber = (int) (Math.random()*100);
            System.out.println("Я загадую число...");
            System.out.println("Я число загадав , тепер ти маєш вгадать ");
            System.out.println("Це число бота , щоб показав, що ок все )" + botNumber);
            boolean game = true;
            while (game){
                int meNumber = scanner.nextInt();
                if (meNumber != botNumber){
                    System.out.println("Не вірно! Продовжуй вгадувати!");
                    continue;
                }
                System.out.println("Ти вгадав");
                break;
            }


        } else if (answer == 2) {
            System.out.println("Не хочеш - то не будемо");
        }
        else{
            System.out.println("Пока");
        }






    }
}