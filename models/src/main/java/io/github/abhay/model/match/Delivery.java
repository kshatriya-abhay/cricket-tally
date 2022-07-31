package io.github.abhay.model.match;

import io.github.abhay.model.events.Dismissal;
import io.github.abhay.model.events.ExtraType;
import io.github.abhay.model.people.Player;
import lombok.Data;

/**
 * One single delivery bowled to a batsman by a bowler of the opposite team
 */
@Data
public class Delivery {
    private int runs;
    private ExtraType extraType;
    private Dismissal dismissal;
    private Player batsman;
    private Player bowler;
}
