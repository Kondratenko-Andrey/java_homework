import java.util.*;

//    Пусть дан список сотрудников:
//            Иван Иванов
//            Светлана Петрова
//            Кристина Белова
//            Анна Мусина
//            Анна Крутова
//            Иван Юрин
//            Петр Лыков
//            Павел Чернов
//            Петр Чернышов
//            Мария Федорова
//            Марина Светлова
//            Мария Савина
//            Мария Рыкова
//            Марина Лугова
//            Анна Владимирова
//            Иван Мечников
//            Петр Петин
//            Иван Ежов
//
//            Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//            Отсортировать по убыванию популярности Имени.
public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> originNames = new ArrayList<>(Arrays.asList("Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));


        HashMap<String, Integer> firstNameCount = new HashMap<>();

        Iterator<String> iter = originNames.iterator();
        while (iter.hasNext()) {
            String fullName = iter.next();
            String[] name = fullName.split(" ");


            if (firstNameCount.get(name[0]) == null) {
                firstNameCount.put(name[0], 1);
            } else {
                firstNameCount.put(name[0], firstNameCount.get(name[0]) + 1);
            }


        }


        while (firstNameCount.size() > 0) {
            Iterator<String> it = firstNameCount.keySet().iterator();
            int maxCount = Collections.max(firstNameCount.values());
            while (it.hasNext()) {
                String current = it.next();
                if (firstNameCount.get(current).equals(maxCount)) {
                    System.out.println(current + " " + maxCount);
                    it.remove();
                }
            }
        }


    }
}