package com.soundcloud.android.playback.players.playback.local;

public final /* synthetic */ class a {
    public static final /* synthetic */ int[] a = new int[Jla.values().length];
    public static final /* synthetic */ int[] b = new int[Kla.values().length];

    static {
        a[Jla.NONE.ordinal()] = 1;
        a[Jla.PAUSED.ordinal()] = 2;
        a[Jla.PLAYBACK_COMPLETE.ordinal()] = 3;
        a[Jla.ERROR_RECOVERABLE.ordinal()] = 4;
        a[Jla.ERROR_FATAL.ordinal()] = 5;
        b[Kla.IDLE.ordinal()] = 1;
        b[Kla.BUFFERING.ordinal()] = 2;
        b[Kla.PLAYING.ordinal()] = 3;
    }
}
