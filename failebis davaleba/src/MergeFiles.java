import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        String firstFile = "file1.txt";
        String secondFile = "file2.txt";
        String outputFile = "merged_output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
             BufferedReader reader1 = new BufferedReader(new FileReader(firstFile));
             BufferedReader reader2 = new BufferedReader(new FileReader(secondFile))) {

            writer.write("FIRST FILE\n");
            writeFileContent(reader1, writer);
            writer.write("\n");

            writer.write("SECOND FILE\n");
            writeFileContent(reader2, writer);

            System.out.println("Files successfully merged into " + outputFile);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }

    private static void writeFileContent(BufferedReader reader, BufferedWriter writer) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
    }
}
