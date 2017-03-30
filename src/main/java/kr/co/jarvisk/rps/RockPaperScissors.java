package kr.co.jarvisk.rps;

public enum RockPaperScissors implements RockPaperScissorsAction{

    ROCK {
        @Override
        public RockPaperScissorsResult action(RockPaperScissors target) {
            if ( this.equals(target) ) {
                return RockPaperScissorsResult.DRAW;
            } else if ( RockPaperScissors.PAPER.equals(target) ) {
                return RockPaperScissorsResult.WIN;
            } else {
                return RockPaperScissorsResult.LOSE;
            }
        }
    },

    PAPER {
        @Override
        public RockPaperScissorsResult action(RockPaperScissors target) {
            if ( this.equals(target) ) {
                return RockPaperScissorsResult.DRAW;
            } else if ( RockPaperScissors.SCISSORS.equals(target) ) {
                return RockPaperScissorsResult.WIN;
            } else {
                return RockPaperScissorsResult.LOSE;
            }
        }
    },

    SCISSORS {
        @Override
        public RockPaperScissorsResult action(RockPaperScissors target) {
            if ( this.equals(target) ) {
                return RockPaperScissorsResult.DRAW;
            } else if ( RockPaperScissors.ROCK.equals(target) ) {
                return RockPaperScissorsResult.WIN;
            } else {
                return RockPaperScissorsResult.LOSE;
            }
        }
    }


}
