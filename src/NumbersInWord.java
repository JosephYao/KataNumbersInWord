import java.util.HashMap;
import java.util.Map;

public class NumbersInWord {

    private static final String[] WORDS = new String[]{
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty"
    };

    private static final Map<Integer, String> NUMBER_TO_ONE_WORD = new HashMap<Integer, String>(){{
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "nineteen");
        put(20, "twenty");
    }};

    public String convert(int number) {
        if (number <= 20)
            return NUMBER_TO_ONE_WORD.get(number);

        return NUMBER_TO_ONE_WORD.get(20) + " " + NUMBER_TO_ONE_WORD.get(number - 20);
    }
}
