package tennis;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class TieBreak extends Tennis {

    public TieBreak(Tennis tennis) {
	super(tennis.scoreA.getPlayerAWonBalls(), tennis.scoreB.getPlayerAWonBalls());
    }

    @Override
    public String score() {
	Map<Integer, String> relativeScore = ImmutableMap.of(
		-2, "game-B",
		-1, "advantage-B",
		 0, "deuce",
		 1, "advantage-A",
		 2, "game-A"
		);
	    int scoreDifference = scoreA.getPlayerAWonBalls() - scoreB.getPlayerAWonBalls();
	    return relativeScore.get(scoreDifference);
    }

}
