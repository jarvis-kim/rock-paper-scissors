package kr.co.jarvisk.rps;

import java.util.stream.Stream;

public interface RockPaperScissorsAction {

    /**
     *
     * @param target
     * @return result
     *
     */
    RockPaperScissorsResult action(RockPaperScissors target);

    /**
     *
     * @param targets
     * @return
     */

    default RockPaperScissorsResult multipleAction(RockPaperScissors[] targets) {
        RockPaperScissorsResult result = Stream.of(targets).map(target -> action(target)).reduce(RockPaperScissorsResult::complex).orElseGet(null);
        return result;
    }
}
