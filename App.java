// Класс для запуска приложения
public class App {
    public static void main(String[] args) {
        UserInputReader userInputReader = new UserInputReader();
        String userInput = userInputReader.readInput();

        try {
            UserInputProcessor userInputProcessor = new UserDataProcessor();
            userInputProcessor.process(userInput);
            System.out.println("Данные успешно обработаны и записаны в файл.");
        } catch (UserDataProcessingException e) {
            System.err.println("Ошибка при обработке данных пользователя:");
            e.printStackTrace();
        }
    }
}
