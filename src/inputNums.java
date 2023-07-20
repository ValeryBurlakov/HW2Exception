import java.util.Scanner;
// задание 1
public class inputNums {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float inputNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            try {
                inputNumber = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Пожалуйста, введите дробное число.");
            }
        }
        return inputNumber;
    }
}
