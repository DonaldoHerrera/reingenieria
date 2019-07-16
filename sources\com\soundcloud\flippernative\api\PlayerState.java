package com.soundcloud.flippernative.api;

public final class PlayerState {
    public static final PlayerState Completed = new PlayerState("Completed");
    public static final PlayerState Error = new PlayerState("Error");
    public static final PlayerState Idle = new PlayerState("Idle");
    public static final PlayerState Paused = new PlayerState("Paused");
    public static final PlayerState Playing = new PlayerState("Playing");
    public static final PlayerState Prepared = new PlayerState("Prepared");
    public static final PlayerState Preparing = new PlayerState("Preparing");
    public static final PlayerState Stopped = new PlayerState("Stopped");
    private static int swigNext = 0;
    private static PlayerState[] swigValues = {Idle, Preparing, Prepared, Playing, Paused, Error, Stopped, Completed};
    private final String swigName;
    private final int swigValue;

    private PlayerState(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static PlayerState swigToEnum(int i) {
        PlayerState[] playerStateArr = swigValues;
        if (i < playerStateArr.length && i >= 0 && playerStateArr[i].swigValue == i) {
            return playerStateArr[i];
        }
        int i2 = 0;
        while (true) {
            PlayerState[] playerStateArr2 = swigValues;
            if (i2 >= playerStateArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(PlayerState.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (playerStateArr2[i2].swigValue == i) {
                return playerStateArr2[i2];
            } else {
                i2++;
            }
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private PlayerState(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private PlayerState(String str, PlayerState playerState) {
        this.swigName = str;
        this.swigValue = playerState.swigValue;
        swigNext = this.swigValue + 1;
    }
}
