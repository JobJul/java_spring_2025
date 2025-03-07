import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        double allPiastres;
        int numberOfPirates;
        double piastresOfTheOwner;
        double piastresOfTheCaptain;
        double piastresOfEveryPirates;

        Scanner input = new Scanner(System.in);

        // Получить добычу пиратов в пиастрах
        System.out.println("Введите добычу пиратов в пиастрах: ");
        allPiastres = input.nextDouble();

        // Получить количество пиратов на корабле, включая капитана
        System.out.println("Введите количество пиратов на корабле, включая капитана: ");
        numberOfPirates = input.nextInt();

        // Вычислить добычу владельца в пиастрах
        piastresOfTheOwner = allPiastres / 2;

        // Вычислить добычу каждого пирата, кроме капитана, в пиастрах
        piastresOfEveryPirates = allPiastres / 4 / numberOfPirates;

        // Вычислить добычу капитана в пиастрах
        piastresOfTheCaptain = allPiastres / 4 + piastresOfEveryPirates;

        // Проверить, что вычисления верны, и вывести, найденные суммы
        System.out.println("Проверка правильности дележа пиастров: " + (piastresOfTheOwner + piastresOfEveryPirates * (numberOfPirates - 1) + piastresOfTheCaptain));
        System.out.println("Добыча владельца в пиастрах: " + piastresOfTheOwner);
        System.out.println("Добыча каждого пирата, кроме капитана, в пиастрах: " + piastresOfEveryPirates);
        System.out.println("Добыча капитана в пиастрах: " + piastresOfTheCaptain);












    }
}
