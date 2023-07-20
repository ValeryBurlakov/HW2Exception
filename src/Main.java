import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // задание 1
        System.out.println("Задание 1");
        float inputNumber = inputNums.getFloatInput();
        System.out.println("Вы ввели число: " + inputNumber);

        // задание 4
        System.out.println("Задание 4");
        emptyException emptyException = new emptyException();
        String inputString = emptyException.inputString();
        System.out.println("Вы ввели строку: " + inputString);
        // конечно если поменять последовательность вызова методов, вылетит исключение, потому что
        // закрытие сканнера идет в inputString() и при замене он его закроет и getFloatInput() уже не выполнится
    }


}

