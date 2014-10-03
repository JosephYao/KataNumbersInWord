import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    NumbersInWord convertor = new NumbersInWord();

    @Test
    public void _0_convert_to_zero() {
        assertEquals("zero", convertor.convert(0));
    }

    @Test
    public void _1_convert_to_one() {
        assertEquals("one", convertor.convert(1));
    }
}
