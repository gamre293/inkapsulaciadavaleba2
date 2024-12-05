public class Car {
    //1
//    private String make;
//    private String model;
//    private int year;
//    private String registrationNumber;
//
//    public Car(String make, String model, int year, String registrationNumber) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.registrationNumber = registrationNumber;
//
//        public void printInfo() {
//            System.out.println("Car Make: " + make);
//            System.out.println("Car Model: " + model);
//            System.out.println("Year of Manufacture: " + year);
//            System.out.println("Registration Number: " + registrationNumber);
//            System.out.println("--------------------------");
//        }
//    }

    //2
//    public static int sumOfMultiples(int a, int b, int k) {
//        if (a > b) {
//            return 0;
//        }
//        if (a % k == 0) {
//            return a + sumOfMultiples(a + k, b, k);
//        }
//        return sumOfMultiples(a + 1, b, k);
//    }

    //3
//    public static int sumOfNaturalNumbers(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumOfNaturalNumbers(n - 1);
//    }

    //4
//    public static int power(int a, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return a * power(a, n - 1);
//    }

    //5
//    public static int countZeros(int number) {
//        if (number == 0) {
//            return 0;
//        }
//        if (number % 10 == 0) {
//            return 1 + countZeros(number / 10);
//        }
//        return countZeros(number / 10);
//    }
//
//
//    public static void isOddOrEvenZeros(int number) {
//        if (number == 0) {
//            System.out.println("The number 0 contains 1 zero, which is odd.");
//            return;
//        }
//
//        int zeroCount = countZeros(Math.abs(number));
//        if (zeroCount % 2 == 0) {
//            System.out.println("The number " + number + " contains " + zeroCount + " zeros, which is even.");
//        } else {
//            System.out.println("The number " + number + " contains " + zeroCount + " zeros, which is odd.");
//        }
//    }
}
