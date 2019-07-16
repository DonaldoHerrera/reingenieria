package com.soundcloud.android.collections.data;

/* compiled from: Type.kt */
public final class fa {
    public static final ea a(C3508cda cda) {
        C7471uYa.b(cda, "$this$toType");
        if (cda.u()) {
            return ea.PLAYLIST;
        }
        if (cda.x()) {
            return ea.TRACK;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot map urn ");
        sb.append(cda.b());
        sb.append(" to track or playlist type");
        throw new IllegalArgumentException(sb.toString());
    }
}
