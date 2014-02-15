import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    NumbersInWord convertor = new NumbersInWord();

    @Test
    public void single_digit_convert_to_one_word() {
        assertEquals("zero", convertor.convert(0));
        assertEquals("one", convertor.convert(1));
        assertEquals("two", convertor.convert(2));
        assertEquals("three", convertor.convert(3));
        assertEquals("four", convertor.convert(4));
        assertEquals("five", convertor.convert(5));
        assertEquals("six", convertor.convert(6));
        assertEquals("seven", convertor.convert(7));
        assertEquals("eight", convertor.convert(8));
        assertEquals("nine", convertor.convert(9));
    }

    @Test
    public void two_digits_convert_to_one_word() {
        assertEquals("ten", convertor.convert(10));
        assertEquals("eleven", convertor.convert(11));
        assertEquals("twelve", convertor.convert(12));
        assertEquals("thirteen", convertor.convert(13));
        assertEquals("fourteen", convertor.convert(14));
        assertEquals("fifteen", convertor.convert(15));
        assertEquals("sixteen", convertor.convert(16));
        assertEquals("seventeen", convertor.convert(17));
        assertEquals("eighteen", convertor.convert(18));
        assertEquals("nineteen", convertor.convert(19));
        assertEquals("twenty", convertor.convert(20));
        assertEquals("thirty", convertor.convert(30));
        assertEquals("forty", convertor.convert(40));
        assertEquals("fifty", convertor.convert(50));
        assertEquals("sixty", convertor.convert(60));
        assertEquals("seventy", convertor.convert(70));
        assertEquals("eighty", convertor.convert(80));
        assertEquals("ninety", convertor.convert(90));
    }

    @Test
    public void two_digits_until_29_convert_to_two_words() {
        assertEquals("twenty one", convertor.convert(21));
        assertEquals("twenty two", convertor.convert(22));
    }

}
