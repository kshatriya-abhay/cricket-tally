package io.github.abhay.model.people;

import io.github.abhay.model.events.Dismissal;
import lombok.Data;

@Data
public class BattingStats {
    private boolean isBatting;
    private boolean isOut;
    private boolean isOnStrike;
    private int runsScored;
    private int ballsPlayed;
    private Dismissal dismissal;

    public BattingStats() {
        runsScored = 0;
        ballsPlayed = 0;
        isBatting = false;
        isOut = false;
        isOnStrike = false;
    }
}
