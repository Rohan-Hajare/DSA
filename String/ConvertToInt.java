package DSA.String;

public class ConvertToInt {

    public static int convert(String str)
    {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int num = 0, i = 0;
        boolean isNegative = false;

        // Check if the string has a negative sign
        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1; // Start conversion from the next character
        }

        // Convert characters to integer
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new IllegalArgumentException("Invalid character found: " + ch);
            }
            num = num * 10 + (ch - '0');
        }

        return isNegative ? -num : num;
    }
    public static void main(String[] args) {
        String str ="";
        int result = convert(str);
        System.out.println("Converted Integer: " + result);
    }
}
