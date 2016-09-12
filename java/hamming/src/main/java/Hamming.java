public class Hamming {
    public static int compute(String a, String b) {
        int count = 0, length = a.length();

        if (length != b.length())
            throw new IllegalArgumentException("The two DNA strands are not of equal length.");

        for (int i = 0; i < length; i++)
            if (a.charAt(i) != b.charAt(i)) count++;

        return count;
    }
}
