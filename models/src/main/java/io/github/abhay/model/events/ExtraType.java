package io.github.abhay.model.events;

public enum ExtraType {
    NONE(true, false, 0),
    WIDE(false, false, 1),
    NO_BALL(false, false, 1),
    LEG_BYES(true, true, 0),
    BYES(true, true, 0),
    PENALTY_RUNS(false, true, 0);

    private final boolean legalDelivery;
    private final boolean variableExtraRuns;
    private final int extraRuns;

    ExtraType(boolean legalDelivery, boolean variableExtraRuns, int extraRuns) {
        this.legalDelivery = legalDelivery;
        this.variableExtraRuns = variableExtraRuns;
        this.extraRuns = extraRuns;
    }

    public boolean isLegalDelivery() {
        return legalDelivery;
    }

    public int getExtraRuns() {
        if (variableExtraRuns) return -1;
        return extraRuns;
    }
}
