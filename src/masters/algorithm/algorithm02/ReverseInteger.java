package masters.algorithm.algorithm02;

class ReverseInteger {
    public int reverse(int x) {
        StringBuilder reversedNumber = new StringBuilder();
        String stringX = Integer.toString(x);
        if (stringX.charAt(0) == '-') {
            reversedNumber.append('-');
            stringX = stringX.substring(1, stringX.length());
        }
        if (stringX.charAt(stringX.length() - 1) == '0') {
            if (stringX.length() != 1) {
                stringX = stringX.substring(0, stringX.length() - 1);
            }
        }
        for (int i = stringX.length() - 1; i >= 0; i--) {
            reversedNumber.append(stringX.charAt(i));
        }
        if (Long.parseLong(reversedNumber.toString()) > Integer.MAX_VALUE || Long.parseLong(reversedNumber.toString()) < Integer.MIN_VALUE) {
            reversedNumber = new StringBuilder();
            reversedNumber.append("0");
        }
        return Integer.parseInt(reversedNumber.toString());
    }
}