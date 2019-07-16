package com.soundcloud.android.playback;

/* compiled from: MissingTrackException.kt */
public final class Ka extends Exception {
    public Ka(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        StringBuilder sb = new StringBuilder();
        sb.append("MissingTrackException{ trackUrn=");
        sb.append(cda);
        sb.append(" }");
        super(sb.toString());
    }

    public Ka(C3508cda cda, Throwable th) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(th, "cause");
        StringBuilder sb = new StringBuilder();
        sb.append("MissingTrackException{ trackUrn=");
        sb.append(cda);
        sb.append(" }");
        super(sb.toString(), th);
    }
}
