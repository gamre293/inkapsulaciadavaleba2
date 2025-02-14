import java.io.FileWriter;
import java.io.IOException;

public class UppercaseFileWriter {
    public static void main(String[] args) {
        String text = "Assure polite his real and other figures though. Day age advantages " +
                "and sufficient eating expression traveling. Of on am father by agreed " +
                "supply rather either. Own handsome delicate property mistresses her " +
                "end appetite. Mean are sons too sold nor said. Son share three men " +
                "power by you. Now merits wonder effect garret own.";

        String upperText = text.toUpperCase(); // Convert text to uppercase
        String fileName = "uppercase_text.txt"; // New file name

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(upperText);
            System.out.println("File '" + fileName + "' successfully created with capitalized text.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
