import java.util.*;

public class Solution2_25 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Алексей");
        map.put("Козлов", "Алексей");
        map.put("Смирнов", "Андрей");
        map.put("Васильев", "Андрей");
        map.put("Морозов", "Дмитрий");
        map.put("Новиков", "Дмитрий");
        map.put("Ковалев", "Сергей");
        map.put("Попов", "Сергей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String value : map.values()) {
            if (!uniqueValues.add(value)) {
                duplicates.add(value);
            }
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (duplicates.contains(entry.getValue())) {
                iterator.remove();
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        map.values().removeIf(v -> v.equals(value));
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println("Исходный словарь:");
        System.out.println(map);

        removeTheFirstNameDuplicates(map);
        System.out.println("Словарь после удаления людей с одинаковыми именами:");
        System.out.println(map);

        // Пример удаления по значению
        String valueToRemove = "Иван";
        removeItemFromMapByValue(map, valueToRemove);
        System.out.println("Словарь после удаления людей с именем " + valueToRemove + ":");
        System.out.println(map);
    }
}