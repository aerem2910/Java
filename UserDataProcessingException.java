// Класс для обработки исключений при обработке данных пользователя
public class UserDataProcessingException extends Exception {
    public UserDataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
