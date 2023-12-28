import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task2(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task3(new ArrayList<>(List.of("пес", "кошка", "пес", "2", "олень", "2", "собака", "3")));
        task4(new ArrayList<>(List.of("один", "два","два", "три", "три", "три")));
    }

        public static void task1(List<Integer> nums) {
            for (Integer num : nums) {
                if (num % 2 > 0) {
                    System.out.print(num + " ");
                }
            }


            System.out.println();
        }

        public static void task2(List<Integer> nums) {
            Collections.sort(nums);
            Set<Integer> uniqueNums = new HashSet<>();
            for (Integer num : nums) {
                if (num % 2 == 0 && !uniqueNums.contains(num)) {
                    System.out.print(num + " ");
                    uniqueNums.add(num);
                }
            }


            System.out.println();
        }

        public static void task3(List<String> strings) {
            Set<String> uniqueString = new HashSet<>(strings);
            System.out.println(uniqueString);


            System.out.println();
        }

        public static void task4(List<String> strings) {
            Map<String, Integer> words = new HashMap<>();
            for (String string : strings) {
                if (words.containsKey(string)) {
                    Integer currentrepeats = words.get(string);
                    words.put(string, currentrepeats + 1);
                } else {
                    words.put(string, 1);
                }
            }

        System.out.println(words);
    }
}