public class SubstringChecker {
    public static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "Hello, welcome to Java programming!";
        String s2 = "Java";

        System.out.println("Is s2 a substring of s1? " + isSubstring(s1, s2));
    }
}