public class DigitCounter {
    public static int countDigits(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello123World45!";
        System.out.println("Number of digits: " + countDigits(input));
    }
}
