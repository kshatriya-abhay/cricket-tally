package io.github.abhay.model.people;

import lombok.Data;

@Data
public class Team {
    private final String name;
    private final Player[] players;
    private final Player sub;

    public Team(String name, Player[] players, Player sub) {
        this.name = name;
        this.players = players;
        this.sub = sub;
    }
}
