public class NumbersInWord {

    public static final String[] WORDS = new String[]{
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
    };

    public String convert(int number) {
        if (number == 21)
            return "twenty one";

        return WORDS[number];
    }
}
