import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Класс для обработки и записи данных в файл
public class UserDataProcessor implements UserInputProcessor {
    @Override
    public void process(String userInput) throws UserDataProcessingException {
        try {
            String[] data = validateAndSplitUserInput(userInput);

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            String phoneNumber = data[4];
            String gender = data[5];

            // Валидация формата данных
            validateDataFormat(lastName, firstName, middleName, birthDate, phoneNumber, gender);

            // Создание файла с именем фамилии
            writeDataToFile(lastName, firstName, middleName, birthDate, phoneNumber, gender);
        } catch (IllegalArgumentException | IOException e) {
            throw new UserDataProcessingException("Ошибка при обработке данных пользователя", e);
        }
    }

    private String[] validateAndSplitUserInput(String userInput) {
        if (userInput == null) {
            throw new IllegalArgumentException("Введенные данные пользователя являются null");
        }

        String[] data = userInput.split(" ");

        if (data.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных. Ожидается 6 параметров.");
        }

        return data;
    }

    private void validateDataFormat(String lastName, String firstName, String middleName,
                                    String birthDate, String phoneNumber, String gender) {
        // Добавьте дополнительные проверки формата данных, если необходимо
    }

    private void writeDataToFile(String lastName, String firstName, String middleName,
                                 String birthDate, String phoneNumber, String gender) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lastName + ".txt", true))) {
            // Запись данных в файл
            writer.write(lastName + firstName + middleName + birthDate + " " + phoneNumber + gender + "\n");
        }
    }
}
