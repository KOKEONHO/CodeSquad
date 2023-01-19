package masters.algorithm.algorithm02;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String numberString = Integer.toString(x);
        StringBuilder reverseNumber = new StringBuilder();
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reverseNumber.append(numberString.charAt(i));
        }
        if (numberString.equals(reverseNumber.toString())) {
            return true;
        }
        return false;
    }
}