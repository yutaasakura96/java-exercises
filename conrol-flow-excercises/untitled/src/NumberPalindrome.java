public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1001));
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return number == reverse;
    }
}