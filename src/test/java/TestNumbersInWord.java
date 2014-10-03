import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    @Test
    public void _0_convert_to_zero() {
        NumbersInWord convertor = new NumbersInWord();
        assertEquals("zero", convertor.convert(0));
    }
}
