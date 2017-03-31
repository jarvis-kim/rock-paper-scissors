package kr.co.jarvisk.rps;

import java.util.ArrayList;
import java.util.List;

public class PlayMain {

    private int repeat = 50;

    private List<Play> plays = new ArrayList<>();

    public void run() {
        RockPaperScissorsRandomStrategy randomStrategy = new RockPaperScissorsRandomStrategy();
        Player me = new Player("jarvis.k", randomStrategy);
        Player[] others = new Player[] {
                new Player("flora.c", randomStrategy),
                new Player("anbug.java", randomStrategy),
                new Player("addie.lee", randomStrategy),
                new Player("kayle.k", randomStrategy),
                new Player("jack.jack", randomStrategy),
                new Player("russell.c", randomStrategy),
        };

        for ( int count = 0; count < repeat; count++ ) {
            plays.add(Play.play(me, others));
        }

        long winCount = plays.parallelStream().filter(play -> play.getResult() == RockPaperScissorsResult.WIN).count();
        long loseCount = plays.parallelStream().filter(play -> play.getResult() == RockPaperScissorsResult.LOSE).count();

        System.out.println("win : " + winCount);
        System.out.println("lose : " + loseCount);
    }

    public static void main(String[] args) {
        new PlayMain().run();
    }
}
