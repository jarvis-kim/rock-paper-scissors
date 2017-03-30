package kr.co.jarvisk.rps;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Builder
@AllArgsConstructor
public class Play {

    private final String playId;

    private final LocalDateTime playTime;

    private final PlayLoad me;

    private final PlayLoad[] others;

    private final RockPaperScissorsResult result;

    public static Play play(Player me, Player... others) {
        final PlayLoad playLoad = new PlayLoad(me);
        List<PlayLoad> playLoads =  Stream.of(others).
                map(player -> new PlayLoad(player)).collect(Collectors.toList());

        RockPaperScissors[] targets = playLoads.stream().map(pl -> pl.rps).toArray(RockPaperScissors[]::new);
        RockPaperScissorsResult rpsResult = playLoad.rps.multipleAction(targets);

        return Play.builder()
                .playId(UUID.randomUUID().toString())
                .playTime(LocalDateTime.now())
                .me(playLoad)
                .others(playLoads.stream().toArray(PlayLoad[]::new))
                .result(rpsResult)
                .build();
    }

    public Player getPlayer() {
        return this.me.player;
    }

    public Player[] getOthers() {
        return Stream.of(others).map(playLoad -> playLoad.player).toArray(Player[]::new);
    }

    static class PlayLoad {
        private RockPaperScissors rps;

        private Player player;

        public PlayLoad(Player player) {
            this.player = player;
            this.rps = player.getNew();
        }

    }

}
