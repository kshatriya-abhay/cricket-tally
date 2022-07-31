package io.github.abhay.model.people;

import io.github.abhay.model.events.Dismissal;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BowlingStats {
    private boolean hasBowled;
    private boolean isBowling;
    private int runsGiven;
    private int oversBowled;
    private int ballsBowled;
    private int maidensBowled;
    private List<Dismissal> wickets;

    public BowlingStats() {
        hasBowled = false;
        isBowling = false;
        runsGiven = 0;
        oversBowled = 0;
        ballsBowled = 0;
        maidensBowled = 0;
        wickets = new ArrayList<>();
    }
}
