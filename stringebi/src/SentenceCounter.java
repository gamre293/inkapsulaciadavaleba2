public class SentenceCounter {
    public static int countSentences(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '.' || c == '?' || c == ';' || c == '!') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello! How are you? I hope you're doing well. Let's meet tomorrow; see you soon!";
        System.out.println("Number of sentences: " + countSentences(input));
    }
}
