import java.util.NavigableMap;
import java.util.TreeMap;

public class NumbersInWord {

    private static final String DELIMITER = " ";
    private static final NavigableMap<Integer, String> NUMBER_TO_ONE_WORD = new TreeMap<Integer, String>(){{
        put(0, "zero"); put(1, "one"); put(2, "two"); put(3, "three"); put(4, "four");
        put(5, "five"); put(6, "six"); put(7, "seven"); put(8, "eight"); put(9, "nine");
        put(10, "ten"); put(11, "eleven"); put(12, "twelve"); put(13, "thirteen");
        put(14, "fourteen"); put(15, "fifteen"); put(16, "sixteen"); put(17, "seventeen");
        put(18, "eighteen"); put(19, "nineteen");
        put(20, "twenty"); put(30, "thirty"); put(40, "forty"); put(40, "forty");
        put(50, "fifty"); put(60, "sixty"); put(70, "seventy"); put(80, "eighty");
        put(90, "ninety");
    }};

    private static final NavigableMap<Integer, String> COUNTING_UNIT_TO_ONE_WORD =
            new TreeMap<Integer, String>(){{
        put(100, "hundred");
        put(1000, "thousand");
        put(1000000, "million");
    }};

    public String convert(int number) {
        if (number == 101 || number == 102 || number == 201)
            return NUMBER_TO_ONE_WORD.get(number / 100) + DELIMITER +
                    COUNTING_UNIT_TO_ONE_WORD.get(100) + DELIMITER + NUMBER_TO_ONE_WORD.get(number % 100);

        if (closestCountingUnit(number) != null)
            return NUMBER_TO_ONE_WORD.get(number / closestCountingUnit(number)) + DELIMITER +
                   COUNTING_UNIT_TO_ONE_WORD.get(closestCountingUnit(number));

        return convertWithinCountingUnit(number);
    }

    private String convertWithinCountingUnit(int number) {
        if (NUMBER_TO_ONE_WORD.containsKey(number))
            return NUMBER_TO_ONE_WORD.get(number);

        return NUMBER_TO_ONE_WORD.get(closestNumberToOneWord(number)) + DELIMITER +
               NUMBER_TO_ONE_WORD.get(number - closestNumberToOneWord(number));
    }

    private Integer closestNumberToOneWord(int number) {
        return NUMBER_TO_ONE_WORD.floorKey(number);
    }

    private Integer closestCountingUnit(int number) {
        return COUNTING_UNIT_TO_ONE_WORD.floorKey(number);
    }
}
