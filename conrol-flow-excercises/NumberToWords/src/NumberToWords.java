public class NumberToWords {

    public static void main(String[] args) {
        System.out.println("getDigitCount method");
        System.out.println(getDigitCount(0)); // returns 1
        System.out.println(getDigitCount(123)); // returns 3
        System.out.println(getDigitCount(-12)); // returns -1
        System.out.println(getDigitCount(5200)); // returns 4

        System.out.println("reverse method");
        System.out.println(reverse(-121)); // returns -121
        System.out.println(reverse(1212)); // returns 2121
        System.out.println(reverse(1234)); // returns 4321
        System.out.println(reverse(100)); // returns 1

        System.out.println("numberToWords method");
        numberToWords(123); // prints "One Two Three"
        numberToWords(1010); // prints "One Zero One Zero"
        numberToWords(1000); // prints "One Zero Zero Zero"
        numberToWords(-12); // prints "Invalid Value"
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int originalNumberDigits = getDigitCount(number);
            int reversedNumberDigits = getDigitCount(reversedNumber);
            int difference = originalNumberDigits - reversedNumberDigits;
            while (reversedNumber != 0) {
                int lastDigit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            if (difference > 0) {
                for (int i = 0; i < difference; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
}