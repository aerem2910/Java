**Описание программы**

1. **UserInputProcessor (Интерфейс):**
    - Определяет метод `process`, который будет обрабатывать введенные данные пользователя.

2. **UserDataProcessor (Класс):**
    - Реализует интерфейс `UserInputProcessor`.
    - Метод `process` принимает строку с данными пользователя, разбивает их, валидирует формат и записывает в файл с именем, равным фамилии пользователя.

3. **UserDataProcessingException (Класс):**
    - Расширяет класс `Exception` и используется для обработки исключений, связанных с обработкой данных пользователя.

4. **UserInputReader (Класс):**
    - Отвечает за чтение данных пользователя с консоли.

5. **App (Класс):**
    - В методе `main` создается экземпляр `UserInputReader` для чтения ввода пользователя.
    - Полученные данные передаются в `UserInputProcessor` (класс `UserDataProcessor`), который обрабатывает, валидирует и записывает данные в файл.
    - При возникновении исключения выводится сообщение об ошибке.

Таким образом, программа принимает ввод от пользователя, обрабатывает и валидирует данные, записывает их в файл, а затем сообщает пользователю о результате операции. 
Если при этом происходит ошибка, программа обрабатывает исключение и выводит информацию об ошибке.