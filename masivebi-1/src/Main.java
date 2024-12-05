import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {
                //1
//        int[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.println("Element at index " + i + ": " + b[i]);
//        }
//
//        //2
//        int[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
//
//        int sum = 0;
//        long product = 1;
//        double arithmeticMean;
//
//        for (int i = 0; i < b.length; i++) {
//            sum += b[i];
//            product *= b[i];
//        }
//
//        arithmeticMean = (double) sum / b.length;
//
//        System.out.println("Sum of elements: " + sum);
//        System.out.println("Product of elements: " + product);
//        System.out.println("Arithmetic Mean: " + arithmeticMean);
//
//        //3
//        int[] b = new int[20];
//        Random rand = new Random();
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = rand.nextInt(21);
//        }
//
//        System.out.println("Array elements:");
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//        System.out.println();
//
//        int max = b[0];
//        int min = b[0];
//        for (int i = 1; i < b.length; i++) {
//            if (b[i] > max) {
//                max = b[i];
//            }
//            if (b[i] < min) {
//                min = b[i];
//            }
//        }
//
//        System.out.println("Maximum element: " + max);
//        System.out.println("Minimum element: " + min);
//
//        //4
//        int[] array = new int[15];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//
//        System.out.println("Array elements:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Index " + i + ": Value " + array[i]);
//        }
//
//        //5
//        int[] array = new int[15];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1; // Value is index + 1
//        }
//
//        int sum = 0;
//        long product = 1;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//            product *= array[i];
//        }
//
//        double arithmeticMean = (double) sum / array.length;
//
//        System.out.println("Array elements:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Index " + i + ": Value " + array[i]);
//        }
//
//        System.out.println("\nSum of elements: " + sum);
//        System.out.println("Product of elements: " + product);
//        System.out.println("Arithmetic Mean: " + arithmeticMean);
//
//        //6
//        int[] array = new int[15];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1; // Value is index + 1
//        }
//
//        System.out.println("Array elements:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number to search in the array: ");
//        int x = scanner.nextInt();
//
//        boolean found = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                found = true;
//                System.out.println("The number " + x + " is found at index " + i + ".");
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("The number " + x + " does not exist in the array.");
//        }
//
//        //7
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Choose an array type (int, String, float):");
//        String type = scanner.nextLine().toLowerCase();
//
//        switch (type) {
//            case "int":
//                handleIntArray(scanner);
//                break;
//            case "string":
//                handleStringArray(scanner);
//                break;
//            case "float":
//                handleFloatArray(scanner);
//                break;
//            default:
//                System.out.println("Invalid type. Please choose int, String, or float.");
//        }
//    }
//
//    private static void handleIntArray(Scanner scanner) {
//        int[] array = {10, 20, 30, 40, 50};
//
//        System.out.println("Original array:");
//        printArray(array);
//
//        System.out.print("Enter an integer to add to the array: ");
//        int newElement = scanner.nextInt();
//
//        array = addFirst(array, newElement);
//
//        System.out.println("Updated array (new element added as the first element):");
//        printArray(array);
//
//        array = addLast(array, newElement);
//
//        System.out.println("Updated array (new element added as the last element):");
//        printArray(array);
//    }
//
//    private static void handleStringArray(Scanner scanner) {
//        String[] array = {"apple", "banana", "cherry"};
//
//        System.out.println("Original array:");
//        printArray(array);
//
//        System.out.print("Enter a string to add to the array: ");
//        String newElement = scanner.next();
//
//        array = addFirst(array, newElement);
//
//        System.out.println("Updated array (new element added as the first element):");
//        printArray(array);
//
//        array = addLast(array, newElement);
//
//        System.out.println("Updated array (new element added as the last element):");
//        printArray(array);
//    }
//
//    private static void handleFloatArray(Scanner scanner) {
//        float[] array = {1.1f, 2.2f, 3.3f};
//
//        System.out.println("Original array:");
//        printArray(array);
//
//        System.out.print("Enter a float to add to the array: ");
//        float newElement = scanner.nextFloat();
//
//        array = addFirst(array, newElement);
//
//        System.out.println("Updated array (new element added as the first element):");
//        printArray(array);
//
//        array = addLast(array, newElement);
//
//        System.out.println("Updated array (new element added as the last element):");
//        printArray(array);
//    }
//
//    private static int[] addFirst(int[] array, int newElement) {
//        int[] newArray = new int[array.length + 1];
//        newArray[0] = newElement;
//        System.arraycopy(array, 0, newArray, 1, array.length);
//        return newArray;
//    }
//
//    private static int[] addLast(int[] array, int newElement) {
//        int[] newArray = new int[array.length + 1];
//        System.arraycopy(array, 0, newArray, 0, array.length);
//        newArray[array.length] = newElement;
//        return newArray;
//    }
//
//    private static String[] addFirst(String[] array, String newElement) {
//        String[] newArray = new String[array.length + 1];
//        newArray[0] = newElement;
//        System.arraycopy(array, 0, newArray, 1, array.length);
//        return newArray;
//    }
//
//    private static String[] addLast(String[] array, String newElement) {
//        String[] newArray = new String[array.length + 1];
//        System.arraycopy(array, 0, newArray, 0, array.length);
//        newArray[array.length] = newElement;
//        return newArray;
//    }
//
//    private static float[] addFirst(float[] array, float newElement) {
//        float[] newArray = new float[array.length + 1];
//        newArray[0] = newElement;
//        System.arraycopy(array, 0, newArray, 1, array.length);
//        return newArray;
//    }
//
//    private static float[] addLast(float[] array, float newElement) {
//        float[] newArray = new float[array.length + 1];
//        System.arraycopy(array, 0, newArray, 0, array.length);
//        newArray[array.length] = newElement;
//        return newArray;
//    }
//
//    private static <T> void printArray(T[] array) {
//        for (T element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//
//    private static void printArray(int[] array) {
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//
//    private static void printArray(float[] array) {
//        for (float element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//
//
//        //8
//        Scanner scanner = new Scanner(System.in);
//
//        int[] array = {3, 4, 5, 7, 8, 10};
//
//        System.out.println("Array elements:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        System.out.print("Enter the target sum: ");
//        int target = scanner.nextInt();
//
//        boolean pairFound = false;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    System.out.println("Pair found: " + array[i] + ", " + array[j]);
//                    pairFound = true;
//                }
//            }
//        }
//
//        if (!pairFound) {
//            System.out.println("No pair found with the sum " + target);
//        }
//
//        //9
//        Scanner scanner = new Scanner(System.in);
//
//        int[] array = {10, 20, 30, 40, 50};
//
//        System.out.println("Original array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int num : array) {
//            arrayList.add(num);
//        }
//
//        System.out.print("Enter a number to remove from the array: ");
//        int numberToRemove = scanner.nextInt();
//
//        if (arrayList.contains(numberToRemove)) {
//            arrayList.remove(Integer.valueOf(numberToRemove));
//            System.out.println("Updated array after removing " + numberToRemove + ":");
//            for (int num : arrayList) {
//                System.out.print(num + " ");
//            }
//        } else {
//            System.out.println("The number " + numberToRemove + " is not in the array.");
//        }
//
//        //10
//        Scanner scanner = new Scanner(System.in);
//
//        int[] array = {10, 20, 30, 40, 50};
//
//        System.out.println("Original array:");
//        printArray(array);
//
//        while (!allZero(array)) {
//
//            System.out.print("Enter a number to remove from the array: ");
//            int numberToRemove = scanner.nextInt();
//
//            boolean removed = false;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == numberToRemove) {
//                    array[i] = 0;
//                    removed = true;
//                    break;
//                }
//            }
//
//            if (removed) {
//                System.out.println("Updated array after removing " + numberToRemove + ":");
//                printArray(array);
//            } else {
//                System.out.println("The number " + numberToRemove + " is not in the array.");
//            }
//        }
//
//        System.out.println("All numbers are now zero.");
//    }
//
//    private static void printArray(int[] array) {
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
//    private static boolean allZero(int[] array) {
//        for (int num : array) {
//            if (num != 0) {
//                return false;
//            }
//        }
//        return true;

    }
}