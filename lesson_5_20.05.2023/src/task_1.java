import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//        Добавить функции 1) Добавление номера
//        2) Вывод всего
//        Пример:
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 1242353
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 547568
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я: 2
//        Иванов: 1242353, 547568
public class task_1 {
    public static void addContact(Map<String, ArrayList<String>> phoneBook, String name, String phone){

        if(phoneBook.get(name) == null){
            ArrayList<String> contactNumbers = new ArrayList<>();
            contactNumbers.add(phone);
            phoneBook.put(name, contactNumbers);
        }else {
            ArrayList<String> contactNumbers = phoneBook.get(name);
            if(!contactNumbers.contains(phone)) {
                contactNumbers.add(phone);
                phoneBook.put(name, contactNumbers);
            }
        }
    }
    public static void addContactMenu(Map phoneBook) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter second name: ");
        String secondName = scan.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scan.nextLine();

        addContact(phoneBook, secondName, phoneNumber);
        System.out.printf("Contact %s added or updated.\n", secondName);
    }

    public static void printAll(Map<String, ArrayList<String>> phoneBook){
        for (String key : phoneBook.keySet()) {
            System.out.printf("%s: %s\n", key, String.join(" ,", phoneBook.get(key)));
        }

    }

    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        phoneBook.put("Ivan", new ArrayList<>(Arrays.asList("123", "456"))); //Тестовые данные
        phoneBook.put("Petr", new ArrayList<>(Arrays.asList("678")));//Тестовые данные
        while (true) {
            System.out.println("1 -> Add number\n2 -> Print all");
            int userSelect = scan.nextInt();

            if (userSelect == 1) addContactMenu(phoneBook);
            else if (userSelect == 2) printAll(phoneBook);
            else System.out.println("Enter 1 or 2");
        }
    }
}