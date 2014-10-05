public class NumbersInWord {

    public String convert(int number) {
        String[] numberWords = {"zero", "one", "two"};

        if (number > 20)
            return numberWords[20] + " " + numberWords[number - 20];

        return numberWords[number];
    }
}
