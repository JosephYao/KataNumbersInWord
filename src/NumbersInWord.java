import java.util.NavigableMap;
import java.util.TreeMap;

public class NumbersInWord {

    private static final String WORD_DELIMITER = " ";
    public static final NavigableMap<Integer, String> NUMBERS_TO_ONE_WORD =
            new TreeMap<Integer, String>() {{
        put(0, "zero"); put(1, "one"); put(2, "two"); put(3, "three");
        put(4, "four"); put(5, "five"); put(6, "six"); put(7, "seven");
        put(8, "eight"); put(9, "nine"); put(10, "ten"); put(11, "eleven");
        put(12, "twelve"); put(13, "thirteen"); put(14, "fourteen"); put(15, "fifteen");
        put(16, "sixteen"); put(17, "seventeen"); put(18, "eighteen"); put(19, "nineteen");
        put(20, "twenty"); put(30, "thirty"); put(40, "forty"); put(50, "fifty");
        put(60, "sixty"); put(70, "seventy"); put(80, "eighty"); put(90, "ninety");
    }};

    public static final NavigableMap<Integer, String> COUNTING_UNIT_WORD =
            new TreeMap<Integer, String>() {{
        put(1000000, "million");
        put(1000, "thousand");
        put(100, "hundred");
    }};

    public String convert(int number) {
        if (closestCountingUnitNumber(number) != null)
            return convert(number / closestCountingUnitNumber(number)) + WORD_DELIMITER +
                   closestCountingUnitNumberString(number) +
                   (number % closestCountingUnitNumber(number) != 0 ? WORD_DELIMITER +
                   convert(number % closestCountingUnitNumber(number)) : "");

        return convertInsideCountingUnit(number);
    }

    private String closestCountingUnitNumberString(int number) {
        return COUNTING_UNIT_WORD.floorEntry(number).getValue();
    }

    private String convertInsideCountingUnit(int number) {
        if (NUMBERS_TO_ONE_WORD.containsKey(number))
            return NUMBERS_TO_ONE_WORD.get(number);
        else
            return NUMBERS_TO_ONE_WORD.get(closestOneWordNumber(number)) + WORD_DELIMITER +
                   NUMBERS_TO_ONE_WORD.get(number - closestOneWordNumber(number));
    }

    private Integer closestCountingUnitNumber(int number) {
        return COUNTING_UNIT_WORD.floorKey(number);
    }

    private int closestOneWordNumber(int number) {
        return NUMBERS_TO_ONE_WORD.floorKey(number);
    }
}
