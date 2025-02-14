import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String[] lines = {
                "შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,",
                "კაცი-კაცსა შემოვსტყორცნე, ცხენ-კაცისა დავდგ გორი;",
                "კაცი, ჩემგან განატყორცნი ბრუნავს ვითა ტანაჯორი,",
                "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი."
        };

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (String line : lines) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Text successfully written to output.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}