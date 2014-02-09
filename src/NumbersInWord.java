import java.util.NavigableMap;
import java.util.TreeMap;

public class NumbersInWord {

    private static final String HUNDRED = "hundred";
    private static final String WORD_DELIMITER = " ";
    public static final NavigableMap<Integer, String> NUMBER_STRINGS =
            new TreeMap<Integer, String>() {{
        put(0, "zero"); put(1, "one"); put(2, "two"); put(3, "three");
        put(4, "four"); put(5, "five"); put(6, "six"); put(7, "seven");
        put(8, "eight"); put(9, "nine"); put(10, "ten"); put(11, "eleven");
        put(12, "twelve"); put(13, "thirteen"); put(14, "fourteen"); put(15, "fifteen");
        put(16, "sixteen"); put(17, "seventeen"); put(18, "eighteen"); put(19, "nineteen");
        put(20, "twenty"); put(30, "thirty"); put(40, "forty"); put(50, "fifty");
        put(60, "sixty"); put(70, "seventy"); put(80, "eighty"); put(90, "ninety");

        put(100, get(1) + WORD_DELIMITER + HUNDRED); put(200, get(2) + WORD_DELIMITER + HUNDRED);
        put(300, get(3) + WORD_DELIMITER + HUNDRED); put(400, get(4) + WORD_DELIMITER + HUNDRED);
        put(500, get(5) + WORD_DELIMITER + HUNDRED); put(600, get(6) + WORD_DELIMITER + HUNDRED);
        put(700, get(7) + WORD_DELIMITER + HUNDRED); put(800, get(8) + WORD_DELIMITER + HUNDRED);
        put(900, get(9) + WORD_DELIMITER + HUNDRED);
    }};

    public String convert(int number) {
        if (NUMBER_STRINGS.containsKey(number))
            return NUMBER_STRINGS.get(number);

        return NUMBER_STRINGS.get(closestOneWordNumber(number)) + WORD_DELIMITER +
               convert(number - closestOneWordNumber(number));
    }

    private int closestOneWordNumber(int number) {
        return NUMBER_STRINGS.floorKey(number);
    }
}
