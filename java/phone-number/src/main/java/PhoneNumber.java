public class PhoneNumber {
    private static final String INVALID = "0000000000";
    private String number;

    public PhoneNumber(String num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (Character.isDigit(c))
                sb.append(c);
        }

        int numOfDigits = sb.length();
        if (numOfDigits < 10 || numOfDigits > 11)
            number = INVALID;
        else if (numOfDigits == 11 && sb.indexOf("1") == 0)
            number = sb.deleteCharAt(0).toString();
        else if (numOfDigits == 11)
            number = INVALID;
        else
            number = sb.toString();
    }

    public String getNumber() {
        return number;
    }

    public String getAreaCode() {
        return number.substring(0,3);
    }

    public String pretty() {
        return "(" + getAreaCode() + ") " + number.substring(3, 6) + "-" + number.substring(6, 10);
    }
}
