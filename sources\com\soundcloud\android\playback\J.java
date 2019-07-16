package com.soundcloud.android.playback;

/* compiled from: BlockedTrackException */
public final class J extends Throwable {
    private final C3508cda a;

    public J(C3508cda cda) {
        this.a = cda;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlockedTrackException{trackUrn=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
