import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    NumbersInWord convertor = new NumbersInWord();

    @Test
    public void _0() {
        assertEquals("zero", convertor.convert(0));
    }

    @Test
    public void _1() {
        assertEquals("one", convertor.convert(1));
    }
}
