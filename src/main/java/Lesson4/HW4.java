package Lesson4;

import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        Repid();
        FoneBook();

    }

    static void Repid() {
        List<String> kaupungi = Arrays.asList("Ребус", "Загадка", "Лафет", "Рукав", "Загадка", "Лафет",
                "Урал", "урал", "Лорд", "Лорд");

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : kaupungi) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(kaupungi);
        unique.forEach(System.out::println);
        System.out.println();

        System.out.println("Начало второго задания");
    }
    static void FoneBook() {
       Directory directory = new Directory();

        directory.add("antonyan", "8999123321");
        directory.add("antonyan", "8912155326");
        directory.add("bobov", "8917155552");
        directory.add("bobov", "8913455672");
        directory.add("antonyan", "899999999");
        directory.add("igoryan", "899111111");
        directory.add("bobov", "89923231999");
        directory.add("smetanov", "8888123113");
        directory.add("igoryan", "8324325234");

        System.out.println(directory.get("antonyan"));
        System.out.println(directory.get("igoryan"));
        System.out.println(directory.get("bobov"));
        System.out.println(directory.get("smetanov"));
    }
    private static class Directory {
        private Map<String, List<String>> directory_hm = new HashMap<>();
        private List<String> phone_number_list;

        public void add(String surname, String phone_number) {
            if (directory_hm.containsKey(surname)) {
                phone_number_list = directory_hm.get(surname);
                phone_number_list.add(phone_number);
                directory_hm.put(surname, phone_number_list);
            } else {
                phone_number_list = new ArrayList<>();
                phone_number_list.add(phone_number);
                directory_hm.put(surname, phone_number_list);
            }
        }

        public List<String> get(String surname) {
            return directory_hm.get(surname);
        }

    }
}
