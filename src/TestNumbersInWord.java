import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    @Test
    public void _0() {
        NumbersInWord convertor = new NumbersInWord();
        String actual = convertor.convert(0);
        assertEquals("zero", actual);
    }

}
