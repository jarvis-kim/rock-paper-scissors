package kr.co.jarvisk.rps;

public class Player {

    private final String playerName;

    private RockPaperScissorsStrategy rockPaperScissorsStrategy;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public RockPaperScissors getNew() {
        return rockPaperScissorsStrategy.get();
    }
    public Player(String playerName, RockPaperScissorsStrategy rockPaperScissorsStrategy) {
        this.playerName = playerName;
        this.rockPaperScissorsStrategy = rockPaperScissorsStrategy;
    }

    public String getPlayerName() {
        return playerName;
    }
}
