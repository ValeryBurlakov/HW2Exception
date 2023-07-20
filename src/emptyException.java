import java.util.Scanner;

class emptyException {
    public String inputString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            }
            return input;
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return inputString();
        } finally {
            scanner.close();
        }
    }
}
