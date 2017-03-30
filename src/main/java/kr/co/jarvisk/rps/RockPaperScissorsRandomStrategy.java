package kr.co.jarvisk.rps;

import java.util.Random;

public class RockPaperScissorsRandomStrategy  implements RockPaperScissorsStrategy {

    private Random random = new Random();

    @Override
    public RockPaperScissors get() {

        int index = random.nextInt(3);
        return RockPaperScissors.values()[ index ];
    }
}
