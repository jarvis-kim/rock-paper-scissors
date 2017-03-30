package kr.co.jarvisk.rps;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test
    public void test() {

        assertEquals(0b01, 1);
        assertEquals(0b10, 2);
        assertEquals(0b11, 3);

        /* Win */
        int result = IntStream.of(0b00, 0b00, 0b01, 0b00, 0b00, 0b01).reduce((a, b) -> a | b).getAsInt();
        assertEquals(result, 1);

        /* Lose */
        int result2 = IntStream.of(0b00, 0b00, 0b00, 0b10, 0b10, 0b00).reduce((a, b) -> a | b).getAsInt();
        assertEquals(result2, 2);

        /* Draw */
        int result3 = IntStream.of(0b00, 0b00, 0b01, 0b10, 0b10, 0b01).reduce((a, b) -> a | b).getAsInt();
        assertEquals(result3, 3);
    }
}
