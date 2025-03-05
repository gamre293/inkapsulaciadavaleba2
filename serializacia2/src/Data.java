import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String FILE_NAME = "phonebook.ser";

    public static void saveContacts(List<PhoneContact> contacts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    public static List<PhoneContact> loadContacts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<PhoneContact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
