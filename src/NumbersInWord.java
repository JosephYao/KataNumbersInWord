import java.util.NavigableMap;
import java.util.TreeMap;

public class NumbersInWord {

    private static final String HUNDRED = "hundred";
    private static final NavigableMap<Integer, String> WORDS =
            new TreeMap<Integer, String>() {{
        put(0, "zero"); put(1, "one"); put(2, "two"); put(3, "three");
        put(4, "four"); put(5, "five"); put(6, "six"); put(7, "seven");
        put(8, "eight"); put(9, "nine"); put(10, "ten"); put(11, "eleven");
        put(12, "twelve"); put(13, "thirteen"); put(14, "fourteen"); put(15, "fifteen");
        put(16, "sixteen"); put(17, "seventeen"); put(18, "eighteen"); put(19, "nineteen");
        put(20, "twenty"); put(30, "thirty"); put(40, "forty"); put(50, "fifty");
        put(60, "sixty"); put(70, "seventy"); put(80, "eighty"); put(90, "ninety");

        put(100, get(1) + " " + HUNDRED); put(200, get(2) + " " + HUNDRED);
        put(300, get(3) + " " + HUNDRED); put(400, get(4) + " " + HUNDRED);
        put(500, get(5) + " " + HUNDRED); put(600, get(6) + " " + HUNDRED);
        put(700, get(7) + " " + HUNDRED); put(800, get(8) + " " + HUNDRED);
        put(900, get(9) + " " + HUNDRED);
    }};

    public String convert(int number) {
        if (WORDS.containsKey(number))
            return WORDS.get(number);

        return WORDS.get(closestOneWordNumber(number)) + " " + convert(number - closestOneWordNumber(number));
    }

    private int closestOneWordNumber(int number) {
        return WORDS.floorKey(number);
    }
}
