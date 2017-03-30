package kr.co.jarvisk.rps;

import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsResultTest {

    @Test
    public void testComplex() {
        RockPaperScissorsResult result = RockPaperScissorsResult.WIN.complex(RockPaperScissorsResult.LOSE);
        Assert.assertEquals(RockPaperScissorsResult.DRAW,  result);
    }
}
