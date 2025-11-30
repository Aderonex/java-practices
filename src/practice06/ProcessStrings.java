package practice06;

public class ProcessStrings implements StringProcessor {

    @Override
    public int countChars(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    @Override
    public String oddPositionChars(String s) {
        if (s == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        // i = 0, 2, 4, ...  (позиции 1, 3, 5, ... по условию)
        for (int i = 0; i < s.length(); i += 2) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String reverse(String s) {
        if (s == null) {
            return "";
        }
        return new StringBuilder(s).reverse().toString();
    }
}
