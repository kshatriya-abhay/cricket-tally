package io.github.abhay.model.match;

import lombok.Data;

/**
 * An inning consists of a sequence of overs
 */
@Data
public class Inning {
    private Over[] overs;
}
