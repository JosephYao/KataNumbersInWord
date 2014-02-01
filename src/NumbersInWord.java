public class NumbersInWord {

    public static final String[] WORDS = new String[]{
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    };

    public String convert(int number) {
        return WORDS[number];
    }
}
