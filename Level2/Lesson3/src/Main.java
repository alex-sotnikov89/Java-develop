import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static HashSet<String> getUniqueValue(String[] array) {
        HashSet<String> uniqueValues = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            uniqueValues.add(array[i]);
        }
        return uniqueValues;
    }

    public static HashMap<String, Integer> getCountsOfValues(String[] array) {
        HashMap<String, Integer> countsOfValues = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if (!countsOfValues.containsKey(array[i])) {
                countsOfValues.put(array[i], 1);
            } else {
                countsOfValues.put(array[i], countsOfValues.get(array[i]) + 1);
            }
        }
        return countsOfValues;
    }

    public static void main(String[] args) {
        String[] array = {"alat", "duki", "radost", "molo", "doru", "doru", "alat",
                "doru", "doru", "molo", "duki", "duki"};

        System.out.println(getUniqueValue(array));
        System.out.println(getCountsOfValues(array));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Vasilev", "1111111");
        phonebook.add("Vasilev", "2222222");
        phonebook.add("Veprev", "333333");
        phonebook.add("Ivanov", "44444444");

        System.out.println(phonebook);
        System.out.println(phonebook.get("Ivanov"));


    }

}
