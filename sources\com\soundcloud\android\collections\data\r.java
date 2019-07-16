package com.soundcloud.android.collections.data;

/* compiled from: Converters.kt */
public final class r {
    public final C3508cda a(String str) {
        C7471uYa.b(str, "value");
        return new C3508cda(str);
    }

    public final String a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        String b = cda.b();
        C7471uYa.a((Object) b, "urn.content");
        return b;
    }

    public final ea a(int i) {
        if (i == ea.PLAYLIST.a()) {
            return ea.PLAYLIST;
        }
        if (i == ea.TRACK.a()) {
            return ea.TRACK;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown Type with value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int a(ea eaVar) {
        C7471uYa.b(eaVar, C1325gg.TYPE);
        return eaVar.a();
    }
}
