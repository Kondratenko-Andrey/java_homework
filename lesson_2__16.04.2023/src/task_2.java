//Дана строка(получение через обычный текстовый файл!!!)
//
//        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
//        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
//        Написать метод(ы),который распарсит строку и,используя StringBuilder,создаст строки вида:
//        Студент[фамилия]получил[оценка]по предмету[предмет].
//
//        Пример вывода в консоль:
//        Студент Иванов получил 5по предмету Математика.
//        Студент Петрова получил 4по предмету Информатика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task_2 {
    public static void main(String[] args) {

        String fileName = "task_2_text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();


            while (line != null) {
                System.out.println(parsReaderLine(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    }

    private static String parsReaderLine(String line) {
        StringBuilder myStr = new StringBuilder();

        myStr.append(line);
        String[] strArr = myStr.toString().split("[,:\"]+");

        myStr.delete(0, myStr.length());

        for (int i = 0; i < strArr.length - 1; i++) {
            if (strArr[i].equals("фамилия")) myStr.append("Cтудент ").append(strArr[i + 1]);
            else if (strArr[i].equals("оценка")) myStr.append(" получил ").append(strArr[i + 1]);
            else if (i == strArr.length - 2) myStr.append(" по предмету ").append(strArr[i + 1]);
        }

        return myStr.toString();
    }


}
