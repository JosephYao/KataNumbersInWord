public class NumbersInWord {

    public String convert(int number) {
        String[] numberWords = {"zero", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen",
        "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

        if (number == 21)
            return numberWords[20] + " " + numberWords[1];

        return numberWords[number];
    }
}
