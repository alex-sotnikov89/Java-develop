import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, Set<String>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            Set<String> hs;
            hs = phoneBook.get(name);
            hs.add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        if (phoneBook.get(name) == null) {
            return new HashSet<>();
        }
        return phoneBook.get(name);
    }


    @Override
    public String toString() {
        return "Phonebook{"  + phoneBook +
                '}';
    }
}
