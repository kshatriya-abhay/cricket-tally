package io.github.abhay.model.people;

import lombok.Data;

@Data
public class Player {
    private int id;
    private final String name;
    private final BattingStats battingStats;
    private final BowlingStats bowlingStats;

    public Player(String name) {
        this.name = name;
        this.battingStats = new BattingStats();
        this.bowlingStats = new BowlingStats();
    }
}
