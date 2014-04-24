import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    NumbersInWord convertor = new NumbersInWord();

    @Test
    public void single_digit_convert_to_one_number_word() {
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
    public void double_digits_convert_to_one_number_word() {
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
    public void double_digits_convert_to_two_number_words() {
        assertEquals("twenty one", convertor.convert(21));
        assertEquals("twenty two", convertor.convert(22));
        assertEquals("thirty one", convertor.convert(31));
        assertEquals("thirty two", convertor.convert(32));
    }

    @Test
    public void hundreds_convert_to_one_number_word_and_one_counting_unit_word() {
        assertEquals("one hundred", convertor.convert(100));
        assertEquals("two hundred", convertor.convert(200));
    }

    @Test
    public void thousands_convert_to_one_number_word_and_one_counting_unit_word() {
        assertEquals("one thousand", convertor.convert(1000));
        assertEquals("two thousand", convertor.convert(2000));
    }

    @Test
    public void millions_convert_to_one_number_word_and_one_counting_unit_word() {
        assertEquals("one million", convertor.convert(1000000));
    }

    @Test
    public void hundreds_convert_to_number_counting_unit_number_format() {
        assertEquals("one hundred one", convertor.convert(101));
        assertEquals("one hundred two", convertor.convert(102));
        assertEquals("two hundred one", convertor.convert(201));
    }

    @Test
    public void hundreds_convert_to_number_counting_unit_number_number_format() {
        assertEquals("one hundred twenty one", convertor.convert(121));
        assertEquals("nine hundred ninety nine", convertor.convert(999));
    }

    @Test
    public void thousands_convert_to_one_number_word_and_one_counting_unit_word_and_one_number_word() {
        assertEquals("one thousand one", convertor.convert(1001));
        assertEquals("one thousand two", convertor.convert(1002));
        assertEquals("two thousand one", convertor.convert(2001));
    }

    @Test
    public void thousands_convert_to_one_number_word_and_one_counting_unit_word_and_two_number_words() {
        assertEquals("one thousand twenty one", convertor.convert(1021));
        assertEquals("nine thousand ninety nine", convertor.convert(9099));
    }

    @Test
    public void thousands_and_hundreds() {
        assertEquals("one thousand one hundred one", convertor.convert(1101));
        assertEquals("two thousand one hundred one", convertor.convert(2101));
        assertEquals("one thousand two hundred one", convertor.convert(1201));
    }

    @Test
    public void _1000101() {
        assertEquals("one million one hundred one", convertor.convert(1000101));
    }

}
