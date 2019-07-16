package com.soundcloud.android.collection.playhistory;

/* renamed from: com.soundcloud.android.collection.playhistory.k reason: case insensitive filesystem */
/* compiled from: ClearPlayHistoryCommand */
public class C2783k extends C1255eT<Void, Boolean> {
    private final va a;
    private final dfa b;

    C2783k(va vaVar, dfa dfa) {
        this.a = vaVar;
        this.b = dfa;
    }

    public Boolean a(Void voidR) {
        boolean g = this.b.a(hfa.a(C2226PO.CLEAR_PLAY_HISTORY.a()).c().b()).g();
        if (g) {
            this.a.a();
        }
        return Boolean.valueOf(g);
    }
}
