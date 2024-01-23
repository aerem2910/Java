import java.util.Scanner;

// Класс для ввода данных пользователя
public class UserInputReader {
    public String readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (в произвольном порядке):");
        return scanner.nextLine();
    }
}
