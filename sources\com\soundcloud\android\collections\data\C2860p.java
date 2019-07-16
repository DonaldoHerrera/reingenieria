package com.soundcloud.android.collections.data;

/* renamed from: com.soundcloud.android.collections.data.p reason: case insensitive filesystem */
/* compiled from: CollectionsStateProvider.kt */
public final class C2860p {
    private final K a;

    public C2860p(K k) {
        C7471uYa.b(k, "likesReadStorage");
        this.a = k;
    }

    public final boolean a() {
        try {
            if (!this.a.b(ea.TRACK).isEmpty() || !this.a.b(ea.PLAYLIST).isEmpty() || !this.a.c(ea.TRACK).isEmpty() || !this.a.c(ea.PLAYLIST).isEmpty()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
