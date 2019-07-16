package com.soundcloud.android.fcm;

/* compiled from: UnexpectedPushPayload.kt */
public final class H extends Exception {
    public H(String str, String str2) {
        C7471uYa.b(str, C1325gg.TYPE);
        C7471uYa.b(str2, "payload");
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected push payload for ");
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        super(sb.toString());
    }
}
