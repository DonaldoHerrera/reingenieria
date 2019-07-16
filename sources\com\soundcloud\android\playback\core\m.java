package com.soundcloud.android.playback.core;

/* compiled from: PlayerType.kt */
public class m {
    private final String a;

    public m(String str) {
        C7471uYa.b(str, "value");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (true ^ C7471uYa.a((Object) obj != null ? obj.getClass() : null, (Object) getClass())) {
            return false;
        }
        if (obj != null) {
            return C7471uYa.a((Object) this.a, (Object) ((m) obj).a);
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.playback.core.PlayerType");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
