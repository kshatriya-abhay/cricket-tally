package io.github.abhay.model.match;

import lombok.Data;

/**
 * One over consists of 6 legal deliveries
 */
@Data
public class Over {
    private Delivery[] deliveries;
}
