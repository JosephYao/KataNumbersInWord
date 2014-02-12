public class NumbersInWord {

    private static final String[] WORDS = new String[]{
            "zero", "one", "two"
    };

    public String convert(int number) {
        return WORDS[number];
    }
}
