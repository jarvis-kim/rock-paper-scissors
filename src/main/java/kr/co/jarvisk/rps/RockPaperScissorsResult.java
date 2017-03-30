package kr.co.jarvisk.rps;

public enum RockPaperScissorsResult {

    DRAW(0), WIN(1), LOSE(2),;

    private final int value;

    RockPaperScissorsResult(int value) {
        this.value = value;
    }

    public RockPaperScissorsResult complex(RockPaperScissorsResult result) {
        int r = (this.value | result.value) % 3;
        return values()[ r ];
    }

}
