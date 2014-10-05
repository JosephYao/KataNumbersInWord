import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    NumbersInWord convertor = new NumbersInWord();

    @Test
    public void single_digit_convert_to_one_word() {
        assertEquals("zero", convertor.convert(0));
        assertEquals("one", convertor.convert(1));
        assertEquals("two", convertor.convert(2));
    }

    @Test
    public void convert_2X() {
        assertEquals("twenty one", convertor.convert(21));
        assertEquals("twenty two", convertor.convert(22));
    }
}
